package com.example.software_chasers.tutor_tracker;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
//import UploadService Package;
import net.gotev.uploadservice.MultipartUploadRequest;
import net.gotev.uploadservice.UploadNotificationConfig;

import java.util.UUID;

public class Tutor_application extends AppCompatActivity {
    // Creating Buttons.
    Button  UploadButton, SubmitApplication;

    // Creating URI .
    Uri uri;
    // Server URL.
    public static final String PDF_UPLOAD_HTTP_URL = "http://lamp.ms.wits.ac.za/~s1741606/uploadTranscript.php";
    Bitmap bitmap;
    private ImageView imageView;

    // Creating TextView.
    TextView PDF_Name_EditText_ID;
        ImageView SelectButton;

    // Pdf upload request code.
    public int PDF_REQ_CODE = 1;

    // Define strings to hold given pdf name, path and ID.
    String PdfNameHolder, PdfPathHolder, PdfID, userid;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutor_application);
        // Method to enable runtime permission.
        AllowRunTimePermission();

        // imageView = (ImageView) findViewById(R.id.iv);
        // Assign ID'S to button and EditText.
        userid = getIntent().getStringExtra("UserId");
        SubmitApplication = (Button) findViewById(R.id.button2);
        SelectButton = (ImageView) findViewById(R.id.Button_Select_PDF_ID);
        UploadButton = (Button) findViewById(R.id.Button_Upload_PDF_ID);
        PDF_Name_EditText_ID = (TextView) findViewById(R.id.editText);
        PDF_Name_EditText_ID.setText("Transcript Name: "+userid);
        SelectButton.setBackgroundResource(R.drawable.ic_attachment_black_24dp);
        SelectButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                // PDF selection code start from here .
                Intent intent = new Intent();

                intent.setType("application/pdf");

                intent.setAction(Intent.ACTION_GET_CONTENT);

                startActivityForResult(Intent.createChooser(intent, "Select Pdf"), PDF_REQ_CODE);

            }
        });
        SubmitApplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PdfPathHolder == null || PDF_Name_EditText_ID == null) {

                    Toast.makeText(Tutor_application.this, "Please Upload Transcript.", Toast.LENGTH_LONG).show();

                }
                else {

                    Intent intent = new Intent(Tutor_application.this, Main2Activity.class);
                    startActivity(intent);
                    Toast.makeText(Tutor_application.this, "Application Submitted.", Toast.LENGTH_LONG).show();

                }
            }
        });

        UploadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                PdfUploadFunction();

            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == PDF_REQ_CODE && resultCode == RESULT_OK && data != null && data.getData() != null) {

            uri = data.getData();
            SelectButton.setBackgroundResource(R.drawable.rr);


//            Bitmap scaledBitmap = Bitmap.createScaledBitmap(bitmap, 400, 400, false); //set the w x h as you want
//            BitmapDrawable bit_background = new BitmapDrawable(getResources(), scaledBitmap);
//            PdfID.setVisibility(View.VISIBLE);
//            PdfID.setBackground(bit_background);
        }
    }

    public void PdfUploadFunction() {

       PdfNameHolder =  PDF_Name_EditText_ID.getText().toString().trim();

        PdfPathHolder = Pdf_FilePath.getPath(this, uri);

        if (PdfPathHolder == null) {

            Toast.makeText(this, "Please move your PDF file to internal storage & try again.", Toast.LENGTH_LONG).show();

        } else {

            try {

                PdfID = UUID.randomUUID().toString();

                new MultipartUploadRequest(this, PdfID, PDF_UPLOAD_HTTP_URL)
                        .addFileToUpload(PdfPathHolder, "pdf")
                        .addParameter("name", PdfNameHolder)
                        .setNotificationConfig(new UploadNotificationConfig())
                        .setMaxRetries(5)
                        .startUpload();
                Toast.makeText(this, "Upload successful", Toast.LENGTH_SHORT).show();

            } catch (Exception exception) {

                Toast.makeText(this, exception.getMessage(), Toast.LENGTH_SHORT).show();
            }
        }
    }


    public void AllowRunTimePermission(){

        if (ActivityCompat.shouldShowRequestPermissionRationale(Tutor_application.this, Manifest.permission.READ_EXTERNAL_STORAGE))
        {

            Toast.makeText(Tutor_application.this,"READ_EXTERNAL_STORAGE permission Access Dialog", Toast.LENGTH_LONG).show();

        } else {

            ActivityCompat.requestPermissions(Tutor_application.this,new String[]{ Manifest.permission.READ_EXTERNAL_STORAGE}, 1);

        }
    }

    @Override
    public void onRequestPermissionsResult(int RC, String per[], int[] Result) {

        switch (RC) {

            case 1:

                if (Result.length > 0 && Result[0] == PackageManager.PERMISSION_GRANTED) {

                    Toast.makeText(Tutor_application.this,"Permission Granted", Toast.LENGTH_LONG).show();

                } else {

                    Toast.makeText(Tutor_application.this,"Permission Canceled", Toast.LENGTH_LONG).show();

                }
                break;
        }
    }


}