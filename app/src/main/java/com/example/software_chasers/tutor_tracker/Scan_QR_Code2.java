package com.example.software_chasers.tutor_tracker;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.google.zxing.Result;

import me.dm7.barcodescanner.zxing.ZXingScannerView;

public class Scan_QR_Code2 extends AppCompatActivity implements ZXingScannerView.ResultHandler{

    private ZXingScannerView mScannerView;
    String userid;


    @Override
    public void onCreate(Bundle state) {
        super.onCreate(state);
        mScannerView = new ZXingScannerView(this);   // Programmatically initialize the scanner view
        setContentView(mScannerView);
        SharedPreferences preferences = getSharedPreferences("myPref",0);
        userid = preferences.getString("userid",null);// Set the scanner view as the content view
    }

    @Override
    public void onResume() {
        super.onResume();
        mScannerView.setResultHandler(this); // Register ourselves as a handler for scan results.
        mScannerView.startCamera();          // Start camera on resume
    }

    @Override
    public void onPause() {
        super.onPause();
        mScannerView.stopCamera();           // Stop camera on pause
    }

    @Override
    public void handleResult(Result rawResult) {
        // Do something with the result here
        // Log.v("tag", rawResult.getText()); // Prints scan results
        // Log.v("tag", rawResult.getBarcodeFormat().toString()); // Prints the scan format (qrcode, pdf417 etc.)
        final String[] result = rawResult.getText().split(" ");
        Scan_QR_Code.tvresult.setText(rawResult.getText());
        Scan_QR_Code.verify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String[] d = result[3].split("-");
                String[] d2 = d[0].split(":");
                String[] d3 = d[1].split(":");

                //duration in minutes
                int dur = ((Integer.parseInt(d3[0]) - Integer.parseInt(d2[0]))*60
                        + (Integer.parseInt(d3[1])-Integer.parseInt(d2[1])));
                String duration =Integer.toString(dur);
                ContentValues params = new ContentValues();
                params.put("userid",result[1]);
                params.put("date",result[5]);
                params.put("task",result[7]);
                params.put("duration",duration);
                params.put("supervisor",userid);
                @SuppressLint("StaticFieldLeak") AsyncHTTPPost asyncHTTPPost = new AsyncHTTPPost(
                        "http://lamp.ms.wits.ac.za/~s1741606/recordTask.php",params) {
                    @Override
                    protected void onPostExecute(String output) {
                    if (output.contains("true")){
                        Toast.makeText(getApplicationContext(),"Task verified",Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(getApplicationContext(),LectureHomePage.class);
                        startActivity(intent);
                    }

                    }
                };
                asyncHTTPPost.execute();
            }
        });
        onBackPressed();

        // If you would like to resume scanning, call this method below:
        //mScannerView.resumeCameraPreview(this);
    }
}