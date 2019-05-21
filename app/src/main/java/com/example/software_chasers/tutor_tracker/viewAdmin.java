package com.example.software_chasers.tutor_tracker;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONObject;

public class viewAdmin extends AppCompatActivity {
    private TextView textView3, textView4, textView5, textView8, textView11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_view_admin );

        textView3 = (TextView) findViewById( R.id.textView3 );
        textView4 = (TextView) findViewById( R.id.textView4 );
        textView5 = (TextView) findViewById( R.id.textView5 );
        textView8 = (TextView) findViewById( R.id.textView8 );
        textView11 = (TextView) findViewById( R.id.textView11 );

        final String userid = getIntent().getStringExtra( "UserId" );
        ContentValues params = new ContentValues();
        params.put( "userId", userid );
        @SuppressLint("StaticFieldLeak") AsyncHTTPPost asyncHTTPPost = new AsyncHTTPPost( "http://lamp.ms.wits.ac.za/~s1741606/viewAdmin.php", params ) {
            @Override
            protected void onPostExecute(String output) {
                try {
                    JSONArray ja = new JSONArray( output );
                    JSONObject jo = (JSONObject) ja.get( 0 );
                    textView3.setText( "First Names: " + jo.getString( "UserFname" ) );
                    textView4.setText( "Last Name: " + jo.getString( "UserLname" ) );
                    textView5.setText( "UserId: " + userid );
                    textView8.setText( "Phone Number: " + jo.getString( "PhonNo" ) );
                    textView11.setText( "Email: " + jo.getString( "Email" ) );
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }

        };
        asyncHTTPPost.execute( );
    }
}