package com.example.software_chasers.tutor_tracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Scan_QR_Code extends AppCompatActivity {
    public static TextView tvresult;
    private Button btn;
    public static Button verify;
   // private TextView tvresult;
    //private var btn = Button ? = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scan__qr__code);
        btn = (Button) findViewById(R.id.btn);
        verify = (Button) findViewById(R.id.verify);
        tvresult = (TextView) findViewById(R.id.tvresult);


        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Scan_QR_Code.this, Scan_QR_Code2.class);
                startActivity(intent);

            }
        });

    }
}
