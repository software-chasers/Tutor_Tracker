package com.example.software_chasers.tutor_tracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Tutor_application extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutor_application);

        getSupportActionBar().setDisplayHomeAsUpEnabled( true );
    }
}
