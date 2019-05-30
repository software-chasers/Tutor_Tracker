package com.example.software_chasers.tutor_tracker;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button;
    Button button2;
    EditText editText;
    EditText editText2;
    String r;
    private CheckBox mCheckBoxRemember;
    private SharedPreferences mPrefs;
    private static final String PREFS_NAME = "PrefsFile";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

        button = (Button) findViewById(R.id.signup);
        button2 = (Button) findViewById(R.id.signIn);
        editText = (EditText) findViewById(R.id.editpassword);
        editText2 = (EditText)findViewById( R.id.edituserid);
        mPrefs = getSharedPreferences(PREFS_NAME, MODE_PRIVATE);

        mCheckBoxRemember = (CheckBox) findViewById(R.id.checkBox);
        getPreferencesData();


       // editText2.addTextChangedListener( loginWatcher );
        //editText.addTextChangedListener( loginWatcher );

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               final String Userid = editText2.getText().toString();
                String Pass = editText.getText().toString();
                ContentValues params = new ContentValues();
                params.put("userid", Userid);
                params.put("password", Pass);
                if (editText2.equals("") || editText.equals("")) {
                    editText2.setError("Fill all fields");
                }
                if(mCheckBoxRemember.isChecked()){
                    Boolean boolIsChecked = mCheckBoxRemember.isChecked();
                    SharedPreferences.Editor editor = mPrefs.edit();
                    editor.putString("pref_name",editText2.getText().toString());
                    editor.putString("pref_pass",editText.getText().toString());
                    editor.putBoolean("pref_check",boolIsChecked);
                    editor.apply();


                }
                else {
                    mPrefs.edit().clear();
                }

                Context context = getApplicationContext();
                @SuppressLint("StaticFieldLeak") AsyncHTTPPost asyncHTTPPost = new AsyncHTTPPost("http://lamp.ms.wits.ac.za/~s1741606/loginfirst.php",params) {
                    @Override
                    protected void onPostExecute(String output) {
                        switch (output) {
                            case "Student": {
                                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                                System.out.println("UserId sent : "+Userid);
                                intent.putExtra("UserId", Userid);
                                System.out.print( "Passed Userid is: "+ Userid );
                                System.out.print( " " );
                                startActivity(intent);
                                Toast.makeText(getApplicationContext(), "Sign in successfully", Toast.LENGTH_SHORT).show();
                                break;
                            }
                            case "Lecturer": {
                                Intent intent = new Intent(MainActivity.this, LectureHomePage.class);
                                intent.putExtra("UserId", Userid);
                                startActivity(intent);
                                Toast.makeText(getApplicationContext(), "Sign in successfully", Toast.LENGTH_SHORT).show();
                                break;
                            }
                            case "Admin": {
//                                Intent intent = new Intent(MainActivity.this, AdminHomePage.class);
//                                intent.putExtra("UserId", Userid);
//                                startActivity(intent);
////                                Toast.makeText(getApplicationContext(), "Sign in successfully", Toast.LENGTH_SHORT).show();
//                                break;
                            }
                            default:
                                Toast.makeText(getApplicationContext(), "Sign in Unsuccessful", Toast.LENGTH_SHORT).show();
                                break;
                        }

                    }
                };
               asyncHTTPPost.execute();
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Create_Profile.class);
                startActivity(intent);
            }
        });
    }

    private void getPreferencesData() {
        SharedPreferences sp = getSharedPreferences(PREFS_NAME, MODE_PRIVATE);
        if (sp.contains("pref_name")) {
            String u = sp.getString("pref_name", "not found.");
            editText2.setText((u.toString()));

        }
        if (sp.contains("pref_pass")) {
            String p = sp.getString("pref_pass", "not_found.");
            editText.setText((p.toString()));

        }
        if (sp.contains("pref_check")) {
            Boolean b = sp.getBoolean("pref_check", false);
            mCheckBoxRemember.setChecked(b);
        }
       // return sp;
    }

   /* private TextWatcher loginWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            String Userid = editText.getText().toString().trim();
            String  Pass = editText2.getText().toString().trim();
            button2.setEnabled( !Userid.isEmpty() && !Pass.isEmpty() );

        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };*/

    public void goHomeLecturer(View view) {
        Intent i = new Intent(getApplicationContext(), LectureHomePage.class);
        startActivity(i);
    }
}
