package com.example.software_chasers.tutor_tracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Create_Profile extends AppCompatActivity {
    EditText FullNames, Username, Email, Password, ConfirmPassword, PhoneNumber, Degree, YOS;
    Button Submit;
    DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create__profile);
        FullNames=(EditText)findViewById(R.id.fullnames) ;
        Username=(EditText)findViewById(R.id.username) ;
        Password=(EditText)findViewById(R.id.password) ;
        ConfirmPassword=(EditText)findViewById(R.id.confirmpassword) ;
        Email=(EditText)findViewById(R.id.email) ;
        PhoneNumber=(EditText)findViewById(R.id.phonenumber) ;
        Degree=(EditText)findViewById(R.id.degree) ;
        YOS=(EditText)findViewById(R.id.yos) ;
        Submit=(Button)findViewById(R.id.submit);

        db = new DatabaseHelper(this);
        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Intent intent = new Intent(Create_Profile.this, MainActivity.class);
                //startActivity(intent);
                String s1 = FullNames.getText().toString();
                String s2 = Username.getText().toString();
                String s3 = Email.getText().toString();
                String s4 = Password.getText().toString();
                String s5 = ConfirmPassword.getText().toString();
                String s6 = PhoneNumber.getText().toString();
                String s7 = Degree.getText().toString();
                String s8 = YOS.getText().toString();
                if(s1.equals("")||s2.equals("")||s3.equals("")||s4.equals("")||s5.equals("")||s6.equals("")||s7.equals("")||s8.equals("")){
                   // Toast.makeText(getApplicationContext(), "Some fields are empty", Toast.LENGTH_SHORT).show();
                    FullNames.setError("Fill all fields");
                }
                else{
                    if(!(s4.equals(s5))){
                        Password.setError("Passwords don't match");

                        //Toast.makeText(getApplicationContext(),"PasswordS do not match",Toast.LENGTH_SHORT).show();
                    }
                    else {
                        //if(s4.equals(s5)){
                            boolean chkemail = db.chkemail(s3);
                            if(chkemail){
                                boolean insert = db.insert(s3,s4);
                                if(insert){

                                    Intent intent = new Intent(Create_Profile.this, View_profile.class);
                                    intent.putExtra("full_names",s1);
                                    intent.putExtra("username",s2);
                                    intent.putExtra("email",s3);
                                    intent.putExtra("phone_number",s6);
                                    intent.putExtra("degree",s7);
                                    intent.putExtra("yos",s8);
                                    startActivity(intent);
                                    Toast.makeText(getApplicationContext(),"Sign up successfully",Toast.LENGTH_SHORT).show();
                                }
                                else{
//                                   // Toast.makeText(getApplicationContext(),"Email already exists",Toast.LENGTH_SHORT).show();
                                    Email.setError("Email Already exists");
                                }
                            }

                        //}

                    }

                }

            }
        });
    }
}
