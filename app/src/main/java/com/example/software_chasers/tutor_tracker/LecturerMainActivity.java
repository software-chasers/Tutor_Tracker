package com.example.software_chasers.tutor_tracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LecturerMainActivity extends AppCompatActivity {
   Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lecturer_main);
    }
        //@Override
        public void goScanQR(View view){
            Intent intent = new Intent(LecturerMainActivity.this,Scan_QR_Code.class);
            startActivity(intent);

        }

}
