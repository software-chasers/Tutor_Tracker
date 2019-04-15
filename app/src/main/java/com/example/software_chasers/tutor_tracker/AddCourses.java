package com.example.software_chasers.tutor_tracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class AddCourses extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_courses);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate( R.menu.activity_lecture_home_page_drawer,menu );
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            //case R.id.profile:
            //    Intent intent = new Intent(this,LectureProfile.class);
            //    this.startActivity(intent);
            //    return true;
            //case R.id.scan:
            //    Intent intent1 = new Intent(this,ScanActivity.class);
            //   this.startActivity(intent1);
            //   return true;
            case R.id.signout:
                Intent intent2 = new Intent( this, MainActivity.class );
                this.startActivity( intent2 );
                return true;
            default:
                return super.onOptionsItemSelected( item );

        }
    }
}
