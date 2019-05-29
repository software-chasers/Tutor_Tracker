package com.example.software_chasers.tutor_tracker;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class LectureHomePage extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    Button b;
    String userid;
    RecyclerView recyclerView;
    InformationAdapter informationAdapter;
    List<Course> courses;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lecture_home_page);
        Toolbar toolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(toolbar);
        final String user = getIntent().getStringExtra( "UserId" );
        userid = user;
        courses = new ArrayList<Course>();
        ContentValues params = new ContentValues();
        params.put("id","123");

        @SuppressLint("StaticFieldLeak") AsyncHTTPPost asyncHTTPPost = new AsyncHTTPPost("http://lamp.ms.wits.ac.za/~s1741606/getCourseLecturer.php",params) {
            @Override
            protected void onPostExecute(String output) {
                Main2Activity.processCourses(output,courses);
            }
        };
        asyncHTTPPost.execute();


        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        informationAdapter = new InformationAdapter(this,courses);
        recyclerView.setAdapter(informationAdapter);

        courses.add(new Course("COMS3003","MONDAY","NO LABS",
                "MSL004","NONE","12:30-13:15","12:30-13:15"));
        courses.add(new Course("COMS2014","WEDNESDAY","NO LABS",
                "MSL004","NONE","12:30-13:15","12:30-13:15"));

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LectureHomePage.this, Addcourse.class);
                startActivity(intent);
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    public void OnSubmit(View view){
        Intent intent = new Intent(getApplicationContext(), LectureHomePage.class);
        startActivity(intent);
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
        getMenuInflater().inflate(R.menu.lecture_home_page, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.out) {
            Intent intent = new Intent(LectureHomePage.this, MainActivity.class);
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

        if (id == R.id.profile) {
            Intent intent = new Intent(LectureHomePage.this, viewLecture.class);
            intent.putExtra("UserId", userid);
            startActivity(intent);
            // Handle the camera action
        }
//         else if (id == R.id.scan) {
//            Intent intent = new Intent(LectureHomePage.this, Scan_QR_Code.class);
//            startActivity(intent);
//
//        }else if (id == R.id.addd){
//            Intent intent = new Intent(getApplicationContext(), AddAssessment.class);
//            startActivity(intent);
//        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
