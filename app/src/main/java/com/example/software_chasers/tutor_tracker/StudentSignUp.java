package com.example.software_chasers.tutor_tracker;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class StudentSignUp extends AppCompatActivity {
    EditText fac,yos,deg;
    Button proceed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_sign_up);

        fac = findViewById(R.id.faculty);
        yos = findViewById(R.id.yos);
        deg = findViewById(R.id.degree);
        proceed =findViewById(R.id.proceed);
        final String userid = getIntent().getStringExtra("userId");

        proceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String faculty = fac.getText().toString().trim();
                String degree = deg.getText().toString().trim();
                String Yos = yos.getText().toString().trim();

                ContentValues params = new ContentValues();
                params.put("userid",userid);
                params.put("faculty",faculty);
                params.put("yos",Yos);
                params.put("degree",degree);

                @SuppressLint("StaticFieldLeak") AsyncHTTPPost asyncHTTPPost = new AsyncHTTPPost("http://lamp.ms.wits.ac.za/~s1741606/createStudent.php", params) {
                    @Override
                    protected void onPostExecute(String output) {
                        if (output.contains("true")){
                            Intent intent = new Intent( StudentSignUp.this,MainActivity.class);
                            startActivity(intent);
                            intent.putExtra("userId",userid);
                            Toast.makeText(getApplicationContext(), "Sign up successful", Toast.LENGTH_SHORT).show();
                        }
                       else{
                            Toast.makeText(getApplicationContext(), "Something went wrong", Toast.LENGTH_SHORT).show();
                        }

                    }
                };
                asyncHTTPPost.execute();

            }

        });

    }



}
