package com.example.software_chasers.tutor_tracker;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Create_Profile extends AppCompatActivity {
    EditText FName,LName, UserID, Email, Password, ConfirmPassword, PhoneNumber;
    Button Submit;
    RadioButton radioButton1,radioButton2,radioButton3;
    RadioGroup radioGroup;
    DatabaseHelper db;
    private boolean isNetworkAvailable() {
        ConnectivityManager connectivityManager
                = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create__profile);;
        FName=(EditText)findViewById(R.id.fname) ;
        LName=(EditText)findViewById(R.id.lname) ;
        UserID=(EditText)findViewById(R.id.userid) ;
        Password=(EditText)findViewById(R.id.password) ;
        ConfirmPassword=(EditText)findViewById(R.id.confirmpassword) ;
        Email=(EditText)findViewById(R.id.email) ;
        PhoneNumber=(EditText)findViewById(R.id.phonenumber) ;
        Submit=(Button)findViewById(R.id.submit);
        radioButton1 = findViewById(R.id.radiobutton);
        radioGroup = findViewById(R.id.user_type);
        final  int id1 = radioButton1.getId();
        radioButton2 = findViewById(R.id.radiobutton2);
        final int id2 = radioButton2.getId();
        radioButton3 = findViewById(R.id.radioButton);
        final int id3 = radioButton3.getId();



        db = new DatabaseHelper(this);
        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent intent = new Intent(Create_Profile.this, MainActivity.class);
                //startActivity(intent);
                if (isNetworkAvailable()) {
                    String fname = FName.getText().toString();
                    String lname = LName.getText().toString();
                    final String userid = UserID.getText().toString();
                    String email = Email.getText().toString();
                    String password = Password.getText().toString();
                    String password2 = ConfirmPassword.getText().toString();
                    String phoneNo = PhoneNumber.getText().toString();

                    final  int id = radioGroup.getCheckedRadioButtonId();
                    if (fname.equals("") || userid.equals("") || email.equals("") || password.equals("") || password2.equals("")
                            || phoneNo.equals("")) {
                        FName.setError("Fill all fields");
                    } else {
                        if (!(password.equals(password2))) {
                            Password.setError("Passwords don't match");

                            //Toast.makeText(getApplicationContext(),"PasswordS do not match",Toast.LENGTH_SHORT).show();
                        }
                        else if(!isValidEmail( email )){
                            Email.setError( "Please enter a valid Wits email" );
                        }
                    }
                    ContentValues params = new ContentValues();
                    params.put("userfname", fname);
                    params.put("userlname", lname);
                    params.put("userid", userid);
                    params.put("email", email);
                    params.put("password", password2);
                    params.put("phonNo", phoneNo);
                    if(id == -1){
                        Toast.makeText(getApplicationContext(), "Please select user type", Toast.LENGTH_SHORT).show();
                    } else if (id == id1) {
                        params.put("usertype","Lecturer");

                    }else  if (id == id2){
                            params.put("usertype", "Student");

                    }
                    else{
                        if (id == id3) {

                            params.put("usertype", "Admin");
                        }
                    }


                    @SuppressLint("StaticFieldLeak") AsyncHTTPPost asyncHTTPPost = new AsyncHTTPPost("http://lamp.ms.wits.ac.za/~s1741606/signUp.php", params) {
                        @Override
                        protected void onPostExecute(String output) {
                            if (output.contains("true")) {
                                if (id == id2) {
                                    Toast.makeText(getApplicationContext(), "you are a student", Toast.LENGTH_SHORT).show();
                                    Intent intent = new Intent(Create_Profile.this, StudentSignUp.class);
                                    intent.putExtra("userId", userid);
                                    startActivity(intent);
                                } else if(id == id1) {
                                    Toast.makeText(getApplicationContext(), "you are a lecturer", Toast.LENGTH_SHORT).show();
                                    Intent intent = new Intent(Create_Profile.this, MainActivity.class);
                                    intent.putExtra("userId", userid);
                                    startActivity(intent);

                                    Toast.makeText(getApplicationContext(), "Sign up successfully", Toast.LENGTH_SHORT).show();
                                }else if (id == id3) {
                                    Toast.makeText(getApplicationContext(), "you are an admin", Toast.LENGTH_SHORT).show();
                                    Intent intent = new Intent(Create_Profile.this, MainActivity.class);
                                    intent.putExtra("userId", userid);
                                    startActivity(intent);
                                }

                            }
                            else Toast.makeText(getApplicationContext(),"could register you", Toast.LENGTH_SHORT).show();
                        }
                    };
                    asyncHTTPPost.execute();

                }
                else {
                    Toast.makeText(getApplicationContext(), "You are not connected to the internet", Toast.LENGTH_SHORT).show();
                }
            }

        });
    }

    public boolean isValidEmail(String email){
        if(email != null && Patterns.EMAIL_ADDRESS.matcher( email ).matches()){
            int i = email.indexOf( '@' );
            int n = email.length();
            String sub_string = email.substring( i+1, n );
            //System.out.println( "THE SUB EMAIL IS: " + sub_string );
            if (sub_string.equals( "students.wits.ac.za" ) || sub_string.equals( "STUDENTS.WITS.AC.ZA" ) ){
                return true;
            }
        }
        return false;
    }

}
