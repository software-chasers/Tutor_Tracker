package com.example.software_chasers.tutor_tracker;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button;
    Button button2;
    EditText editText;
    EditText editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

        button = (Button) findViewById(R.id.signup);
        button2 = (Button) findViewById(R.id.signIn);
        editText = (EditText) findViewById(R.id.editpassword);
        editText2 = (EditText)findViewById( R.id.edituserid);



        editText2.addTextChangedListener( loginWatcher );
        editText.addTextChangedListener( loginWatcher );

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               final String Userid = editText2.getText().toString();
                String Pass = editText.getText().toString();
                ContentValues params = new ContentValues();
                params.put("userid", Userid);
                params.put("password", Pass);
                @SuppressLint("StaticFieldLeak") AsyncHTTPPost asyncHTTPPost = new AsyncHTTPPost("http://lamp.ms.wits.ac.za/~s1741606/loginfirst.php",params) {
                    @Override
                    protected void onPostExecute(String output) {
                    if(strcmp(output,"Student") ) {
                        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                        intent.putExtra("UserId",Userid);
                        startActivity(intent);
                        Toast.makeText(getApplicationContext(), "Sign in successfully", Toast.LENGTH_SHORT).show();
                    }else if(strcmp(output,"Lecturer") ) {
                        Intent intent = new Intent(MainActivity.this,LectureHomePage.class);
                        intent.putExtra("UserId",Userid);
                        startActivity(intent);
                        Toast.makeText(getApplicationContext(), "Sign in successfully", Toast.LENGTH_SHORT).show();
                    }
                    else {
                        Toast.makeText(getApplicationContext(), "Sign in Unsuccessful", Toast.LENGTH_SHORT).show();
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

    public boolean strcmp(String key1, String key2){
        boolean answ = false;
        if(key1==null || key2 == null){
            answ = false;
        } else if(key1.equals( key2 )){
            answ = true;
        }else if(!key1.equals( key2 )) {
            answ = false;
        }
        return answ;
    }

    private TextWatcher loginWatcher = new TextWatcher() {
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
    };
}
