package com.example.software_chasers.tutor_tracker;

import android.app.Application;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class HomePage extends AppCompatActivity {
 //String item[] = new String[]{"subitem1", "subitem2", "subitem3", "subitem4"};

/*
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example_menu);
    }*/
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.example_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch ( item.getItemId()) {
            case R.id.subitem1:
                Intent intent = new Intent(HomePage.this, View_profile.class);
                startActivity(intent);
                return true;
        }
            switch ( item.getItemId()) {
                case R.id.subitem2:
                    Intent intent = new Intent(HomePage.this, Genarate_form.class);
                    startActivity(intent);
                    return true;
            }
        switch ( item.getItemId()) {
            case R.id.subitem3:
                Intent intent = new Intent(HomePage.this, QR_Code.class);
                startActivity(intent);
                return true;
        }
        switch ( item.getItemId()) {
            case R.id.subitem4:
                Intent intent = new Intent(HomePage.this, Tutor_application.class);
                startActivity(intent);

                return true;
        }
        switch ( item.getItemId()) {
            case R.id.subitem5:
                Intent intent = new Intent(HomePage.this, MainActivity.class);
                startActivity(intent);

                break;
        }




    return super.onOptionsItemSelected(item);


    }
}

    /*@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.example_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId())
        {

            case R.id.item1:
                Toast.makeText(this,"Item 1 selected",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item2:
                Toast.makeText(this,"Item 2 selected",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item3:
                Toast.makeText(this,"Item 3 selected",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.subitem1:
                Toast.makeText(this,"sub Item 1 selected",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.subitem2:
                Toast.makeText(this,"sub Item 2 selected",Toast.LENGTH_SHORT).show();
                return true;
                default:
                    return super.onOptionsItemSelected(item);
        }

    }
}*/
