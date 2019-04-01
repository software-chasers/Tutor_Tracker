package com.example.software_chasers.tutor_tracker;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button button;
    Button button2;
    EditText editText;
    EditText editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

        button = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);
        editText = (EditText) findViewById(R.id.editText);
        editText2 = (EditText)findViewById( R.id.editText2 );


        editText2.addTextChangedListener( loginWatcher );
        editText.addTextChangedListener( loginWatcher );

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, HomePage.class);
                startActivity(intent);
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

    private TextWatcher loginWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            String Username = editText.getText().toString().trim();
            String Password = editText2.getText().toString().trim();
            button2.setEnabled( !Username.isEmpty() && !Password.isEmpty() );

        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };
}
