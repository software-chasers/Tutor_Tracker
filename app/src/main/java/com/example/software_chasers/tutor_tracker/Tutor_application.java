package com.example.software_chasers.tutor_tracker;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
//Importing UploadService Package.
import net.gotev.uploadservice.MultipartUploadRequest;
import net.gotev.uploadservice.UploadNotificationConfig;


import java.io.IOException;
import java.util.UUID;
public class Tutor_application extends AppCompatActivity {
    // Creating Buttons.
    Button SelectButton, UploadButton;
    // Creating URI .
    Uri uri;
    // Server URL.
    public static final String PDF_UPLOAD_HTTP_URL = "";

    private ImageView imageView;

    // Creating EditText.
    EditText PDF_Name_EditText_ID ;

    // Pdf upload request code.
    public int PDF_REQ_CODE = 1;

    // Define strings to hold given pdf name, path and ID.
    String PdfNameHolder, PdfPathHolder, PdfID;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutor_application);
        // Method to enable runtime permission.
        RequestRunTimePermission();
        // imageView = (ImageView) findViewById(R.id.iv);
        // Assign ID'S to button and EditText.
        SelectButton = (Button) findViewById(R.id.Button_Select_PDF_ID);
        UploadButton = (Button) findViewById(R.id.Button_Upload_PDF_ID);

        // Adding click listener to Button.
        SelectButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // PDF selection code start from here .
                // Creating intent object.
                Intent intent = new Intent();

                // Setting up default file pickup time as PDF.
                intent.setType("application/pdf");

                intent.setAction(Intent.ACTION_GET_CONTENT);

                startActivityForResult(Intent.createChooser(intent, "Select Pdf"), PDF_REQ_CODE);

            }
        });

        // Adding click listener to Upload PDF button.
        UploadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Calling method to upload PDF on server.
                //PdfUploadFunction();

            }
        });

    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == PDF_REQ_CODE && resultCode == RESULT_OK && data != null && data.getData() != null) {

            // Uri contentURI = data.getData();
           /* try {

                Bitmap bitmap = MediaStore.Images.Media.getBitmap(this.getContentResolver(), contentURI);
                imageView.setImageBitmap(bitmap);
                PdfUploadFunction();

            }catch (IOException e) {
                e.printStackTrace();
                Toast.makeText(Tutor_application.this, "Failed!", Toast.LENGTH_SHORT).show();
            } */

            // After selecting the PDF set PDF is Selected text inside Button.
            SelectButton.setText("PDF is Selected");
        }
    }

    // PDF upload function starts from here.
    public void PdfUploadFunction() {

        // Getting pdf name from EditText.
        PdfNameHolder = PDF_Name_EditText_ID.getText().toString().trim();

        // Getting file path using Filepath class.
        PdfPathHolder = Pdf_FilePath.getPath(this, uri);

        // If file path object is null then showing toast message to move file into internal storage.
        if (PdfPathHolder == null) {

            Toast.makeText(this, "Please move your PDF file to internal storage & try again.", Toast.LENGTH_LONG).show();

        }
        // If file path is not null then PDF uploading file process will starts.
        else {

            try {

                PdfID = UUID.randomUUID().toString();

                new MultipartUploadRequest(this, PdfID, PDF_UPLOAD_HTTP_URL)
                        .addFileToUpload(PdfPathHolder, "pdf")
                        .addParameter("name", PdfNameHolder)
                        .setNotificationConfig(new UploadNotificationConfig())
                        .setMaxRetries(5)
                        .startUpload();

            } catch (Exception exception) {

                Toast.makeText(this, exception.getMessage(), Toast.LENGTH_SHORT).show();
            }
        }
    }


    // Requesting run time permission method starts from here.
    public void RequestRunTimePermission(){

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

