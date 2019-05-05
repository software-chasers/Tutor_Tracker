package com.example.software_chasers.tutor_tracker;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class View_profile extends AppCompatActivity {
String fname,iname ,edituserid,phonenumber,email;
private TextView textView3, textView4, textView5, textView8, textView11;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_profile);

        edituserid = getIntent().getStringExtra("UserId");
        fname = getIntent().getStringExtra("First Names");
        iname= getIntent().getStringExtra("Last Name");
        phonenumber = getIntent().getStringExtra("Phone Number");
        email = getIntent().getStringExtra("Email");

       textView3 =(TextView) findViewById(R.id.textView3);
        textView4 =(TextView) findViewById(R.id.textView4);
        textView5=(TextView) findViewById(R.id.textView5);
        textView8 =(TextView) findViewById(R.id.textView8);
        textView11 =(TextView) findViewById(R.id.textView11);



        textView3.setText("First Names: "+fname);
        textView4.setText("Last Name: "+iname);
        textView5.setText("UserId: "+edituserid);
        textView8.setText("Phone Number: "+phonenumber);
        textView11.setText("Email: "+email);

//        t1.setText("Full Names: "+getIntent().getStringExtra("full_names"));
//        t2.setText("Username: "+getIntent().getStringExtra("username"));
//        t3.setText("Email: "+getIntent().getStringExtra("email"));
//        t6.setText("Phone number: "+getIntent().getStringExtra("phone_number"));
//        t7.setText("Degree: "+getIntent().getStringExtra("degree"));
//        t8.setText("YOS: "+getIntent().getStringExtra("yos"));;


//        SharedPreferences pref = PreferenceManager
//                .getDefaultSharedPreferences(getApplicationContext());
//        String fav= pref.getString(getString(R.string.full_names),"");
//        String fa= pref.getString(getString(R.string.username),"");
//        String f= pref.getString(getString(R.string.email),"");
//        String favc= pref.getString(getString(R.string.phone_number),"");
//        String favv= pref.getString(getString(R.string.degree),"");
//        String favvvv= pref.getString(getString(R.string.yos),"");
       // String favvvvv= pref.getString(getString(R.string.full_names),"");
        //Intent intent = getIntent();
}}
