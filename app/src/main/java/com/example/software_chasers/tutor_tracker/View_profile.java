package com.example.software_chasers.tutor_tracker;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class View_profile extends AppCompatActivity {
TextView t1,t2,t3,t6,t7,t8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getSupportActionBar().setDisplayHomeAsUpEnabled( true );

        setContentView(R.layout.activity_view_profile);
        t1 =(TextView) findViewById(R.id.textView3);
        t2 =(TextView) findViewById(R.id.textView4);
        t3=(TextView) findViewById(R.id.textView5);
        t6 =(TextView) findViewById(R.id.textView8);
        t7 =(TextView) findViewById(R.id.textView11);
        t8 =(TextView) findViewById(R.id.textView12);

        t1.setText("Full Names: "+getIntent().getStringExtra("full_names"));
        t2.setText("Username: "+getIntent().getStringExtra("username"));
        t3.setText("Email: "+getIntent().getStringExtra("email"));
        t6.setText("Phone number: "+getIntent().getStringExtra("phone_number"));
        t7.setText("Degree: "+getIntent().getStringExtra("degree"));
        t8.setText("YOS: "+getIntent().getStringExtra("yos"));;


        SharedPreferences pref = PreferenceManager
                .getDefaultSharedPreferences(getApplicationContext());
        String fav= pref.getString(getString(R.string.full_names),"");
        String fa= pref.getString(getString(R.string.username),"");
        String f= pref.getString(getString(R.string.email),"");
        String favc= pref.getString(getString(R.string.phone_number),"");
        String favv= pref.getString(getString(R.string.degree),"");
        String favvvv= pref.getString(getString(R.string.yos),"");
       // String favvvvv= pref.getString(getString(R.string.full_names),"");
        //Intent intent = getIntent();
}}
