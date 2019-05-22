package com.example.software_chasers.tutor_tracker;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.PopupMenu;
import android.support.v7.widget.RecyclerView;
import android.view.MenuInflater;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener{
    private static
    String userid;
        RecyclerView recyclerView;
        CardView cardView;
        InformationAdapter informationAdapter;
    List<Course> courses;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(toolbar);
        cardView = findViewById(R.id.card_view);
         final String user = getIntent().getStringExtra("UserId");
        ContentValues param = new ContentValues();
        courses = new ArrayList<Course>();
        param.put("userid",user);

        @SuppressLint("StaticFieldLeak") AsyncHTTPPost asyncHTTPPost = new AsyncHTTPPost(
                "http://lamp.ms.wits.ac.za/~s1741606/checkCourse.php",param) {
            @Override
            protected void onPostExecute(String output) {
              getcCode(output,courses);
            }
        };
        asyncHTTPPost.execute();

        recyclerView = (RecyclerView) findViewById(R.id.upcomingacts);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        informationAdapter = new InformationAdapter(this,courses);
        recyclerView.setAdapter(informationAdapter);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        userid = user;
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

    }
    public static void getcCode(String output, final List<Course> courses){
        try {
            JSONArray ja = new JSONArray(output);
            for (int i=0; i<ja.length(); i++){
                JSONObject jo = (JSONObject)ja.get(i);
                String course = new String(jo.getString("CourseTutored"));
               ContentValues params = new ContentValues();
               params.put("code",course);

                @SuppressLint("StaticFieldLeak") AsyncHTTPPost a = new AsyncHTTPPost("http://lamp.ms.wits.ac.za/~s1741606/getCourse.php",params) {
                    @Override
                    protected void onPostExecute(String output) {
                        processCourses(output,courses);
                    }
                };
                a.execute();
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public void showPopUp(View v){
        PopupMenu popupMenu = new PopupMenu(this,v);
    MenuInflater menuInflater = popupMenu.getMenuInflater();
    menuInflater.inflate(R.menu.pop_up,popupMenu.getMenu());
    popupMenu.show();
}

    public  static  void processCourses(String output,List<Course> courses2) {

        try {
            JSONArray ja = new JSONArray(output);
            for (int i=0; i<ja.length(); i++){
                JSONObject jo = (JSONObject)ja.get(i);
                Course course = new Course(jo.getString("CourseCode"),jo.getString("TutDay"),
                        jo.getString("LabDay"),jo.getString("TutVenue"), jo.getString("LabVenue"),
                        jo.getString("TutTime"),jo.getString("LabTime"));
                    modType(output,course,courses2);
                courses2.add(course);

            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static  void modType(String output,Course c,List<Course> courses1) {
        String s = c.getType();
        if (s.equals("BOTH")) {
            try {
                JSONArray ja = new JSONArray(output);
                for (int i = 0; i < ja.length(); i++) {
                    JSONObject jo = (JSONObject) ja.get(i);
                    Course c1 = new Course(jo.getString("CourseCode"), jo.getString("TutDay"),
                            "None", jo.getString("TutVenue"), jo.getString("LabVenue"),
                            jo.getString("TutTime"), jo.getString("LabTime"));
                    Course c2 =new Course(jo.getString("CourseCode"),"None",
                            jo.getString("LabDay"), jo.getString("TutVenue"), jo.getString("LabVenue"),
                            jo.getString("TutTime"), jo.getString("LabTime"));

                    courses1.add(c1);
                    courses1.add(c2);
                }
            }catch (Exception e){
                e.getStackTrace();
            }
        }
        else {
            courses1.add(c);
        }

    }
    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_sign_out) {
            Intent intent = new Intent(Main2Activity.this, MainActivity.class);
            startActivity(intent);

            return true;

        }

        return super.onOptionsItemSelected(item);
    }


    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.generate_form) {
            Intent intent = new Intent(Main2Activity.this, Genarate_form.class);
            intent.putExtra("UserId",userid);
            startActivity(intent);
            return true;

        } else if (id == R.id.generate_qr_code) {
            Intent intent = new Intent(Main2Activity.this, QR_Code.class);
            intent.putExtra("UserId",userid);
            startActivity(intent);
            return true;
        } else if (id == R.id.view_profile) {
            Intent intent = new Intent(Main2Activity.this, View_profile.class);
            startActivity(intent);
            return true;
        } else if (id == R.id.apply_to_be_a_tutor) {
            Intent intent = new Intent(Main2Activity.this, Tutor_application.class);
            startActivity(intent);
            return true;
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
