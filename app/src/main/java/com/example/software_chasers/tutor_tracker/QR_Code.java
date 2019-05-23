package com.example.software_chasers.tutor_tracker;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.opengl.Visibility;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;

import static android.view.View.VISIBLE;

public class QR_Code extends AppCompatActivity {

    public final static int QRcodeWidth = 500 ;
    //private static final String IMAGE_DIRECTORY = "";
    Bitmap bitmap ;
    private TextView etqr;
    //private  EditText etqr2;
    //private  EditText etqr3;
    private ImageView imag;
    private Button btn;
    String userid;
    String completed,togenerate;
    ProgressBar proBar;
    private int progressStatus;
    private Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qr__code);

        getSupportActionBar().setDisplayHomeAsUpEnabled( true );
        SharedPreferences preferences = getSharedPreferences("myPref",0);
        userid = preferences.getString("userid",null);

       // userid = "456";
        //completed = getIntent().getStringExtra("Completed");
        final String code = getIntent().getStringExtra("Code");
        final String type = getIntent().getStringExtra("Type");
        final String time = getIntent().getStringExtra("Time");
        final String date = getIntent().getStringExtra("Date");

        //Create the text View
       // TextView textView = new EditText(this);
      //  textView.setTextSize(40);
        //textView.setText(message);
        //setContentView(textView);
        //userid = getIntent().getStringExtra("userid");

        imag = (ImageView) findViewById(R.id.imag);

        etqr = (TextView) findViewById(R.id.etqr);
       // etqr2 = (EditText) findViewById(R.id.etqr);
        togenerate = "PayrollNo: " + "12345"+ " UserId: "+userid + " Time: " + time + " Date: "
                + date + " Task: " + type + " CourseCode: " + code;
        etqr.setText(togenerate);
        //etqr3.setText(completed);
        btn = (Button) findViewById(R.id.btn);
        proBar = findViewById(R.id.progressBar);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                if(etqr.getText().toString().trim().length() == 0){
//                    Toast.makeText(QR_Code.this, "Enter Text!", Toast.LENGTH_SHORT).show();
//                }else {
//
//                }
              /*  ProgressDialog progress;

                progress = new ProgressDialog(QR_Code.this);
                progress.setTitle("Please Wait!!");
                progress.setMessage("Wait!!");
                progress.setCancelable(true);
                progress.setProgressStyle(ProgressDialog.STYLE_SPINNER);
                progress.show();*/
                try {
                    proBar.setVisibility(ProgressBar.VISIBLE);
                    bitmap = TextToImageEncode(userid);
                   //bitmap = TextToImageEncode();
                    /*progressStatus=0;
                    progressBar.setVisibility(View.VISIBLE);
                    new Thread(new Runnable() {
                        public void run() {
                            while (progressStatus < 100) {
                                progressStatus += 1;
                                // Update the progress bar and display the
                                //current value in the text view
                                handler.post(new Runnable() {
                                    public void run() {
                                        progressBar.setProgress(progressStatus);
                                    }
                                });
                                try {
                                    // Sleep for 200 milliseconds.
                                    Thread.sleep(200);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                            }
                        }
                    }).start();*/
                    imag.setImageBitmap(bitmap);



                   // String path = saveImage(bitmap);  //give read write permission
                  //  Toast.makeText(QR_Code.this, "QRCode Saved "+path, Toast.LENGTH_SHORT).show();


                } catch (WriterException e) {
                    e.printStackTrace();
                }
                proBar.setVisibility(ProgressBar.INVISIBLE);
            }
        });



    }


//the following method is responsible for saving the generated qr code image into the device
   /* public String saveImage(Bitmap myBitmap) {
        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        myBitmap.compress(Bitmap.CompressFormat.JPEG, 90, bytes);
        File wallpaperDirectory = new File(
                Environment.getExternalStorageDirectory() + IMAGE_DIRECTORY);
        // have the object build the directory structure, if needed.

        if (!wallpaperDirectory.exists()) {
            Log.d("dirrrrrr", "" + wallpaperDirectory.mkdirs());
            wallpaperDirectory.mkdirs();
        }

        try {
            File f = new File(wallpaperDirectory, Calendar.getInstance()
                    .getTimeInMillis() + ".jpg");
            f.createNewFile();   //give read write permission
            FileOutputStream fo = new FileOutputStream(f);
            fo.write(bytes.toByteArray());
            MediaScannerConnection.scanFile(this,
                    new String[]{f.getPath()},
                    new String[]{"image/jpeg"}, null);
            fo.close();
            Log.d("TAG", "File Saved" + f.getAbsolutePath());

            return f.getAbsolutePath();
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        return "";

    }*/
    //the following method is responsible for QR Code generation from the given string
    private Bitmap TextToImageEncode(String Value) throws WriterException {
        BitMatrix bitMatrix;
        try {
            bitMatrix = new MultiFormatWriter().encode(
                    Value,
                    BarcodeFormat.DATA_MATRIX.QR_CODE,
                    QRcodeWidth, QRcodeWidth, null
            );


        } catch (IllegalArgumentException Illegalargumentexception) {

            return null;
        }
        int bitMatrixWidth = bitMatrix.getWidth();

        int bitMatrixHeight = bitMatrix.getHeight();

        int[] pixels = new int[bitMatrixWidth * bitMatrixHeight];

        for (int y = 0; y < bitMatrixHeight; y++) {
            int offset = y * bitMatrixWidth;

            for (int x = 0; x < bitMatrixWidth; x++) {

                pixels[offset + x] = bitMatrix.get(x, y) ?
                        getResources().getColor(R.color.black):getResources().getColor(R.color.white);
            }
        }
        Bitmap bitmap = Bitmap.createBitmap(bitMatrixWidth, bitMatrixHeight, Bitmap.Config.ARGB_4444);

        bitmap.setPixels(pixels, 0, 500, 0, 0, bitMatrixWidth, bitMatrixHeight);
        return bitmap;
    }

}