package com.example.software_chasers.tutor_tracker;

import android.annotation.SuppressLint;
import android.content.ActivityNotFoundException;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.pdf.PdfDocument;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class generateform extends AppCompatActivity {
    private Button btn ;//btnScroll;
    private ScrollView LLPdf;
    private Bitmap bitmap;
    private TextView textView106,textView107,textView103,textView111;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_generateform);

        String useid = getIntent().getStringExtra( "UserId" );
        textView106 = (TextView)findViewById(R.id.textView106); //student no
        textView107 = (TextView)findViewById( R.id.textView107 ); //tful names
        textView103 = (TextView)findViewById( R.id.textView103 ); //email address
        textView111 = (TextView)findViewById( R.id.textView111 ); //phone number
        textView106.setText( useid );
        ContentValues params = new ContentValues( );
        params.put( "userId",useid );

        @SuppressLint("StaticFieldLeak") AsyncHTTPPost asyncHTTPPost = new AsyncHTTPPost( "http://lamp.ms.wits.ac.za/~s1741606/viewStudent.php",params ) {
            @Override
            protected void onPostExecute(String output){
                try {
                    JSONArray ja = new JSONArray( output );
                    JSONObject jo = (JSONObject)ja.get(0);
                    textView107.setText(jo.getString( "UserFname" ));
                    textView103.setText( jo.getString( "Email" ) );
                    textView111.setText( jo.getString( "PhonNo" ) );
                    //textView4.setText("Last Name: "+jo.getString( "UserLname" ));
                    } catch (Exception e){
                    e.printStackTrace();
                }

            }

        };
        asyncHTTPPost.execute( );


        @SuppressLint("StaticFieldLeak") AsyncHTTPPost asyncHTTPPost1 = new AsyncHTTPPost( "http://lamp.ms.wits.ac.za/~s1741606/viewStudent.php",params ) {
            @Override
            protected void onPostExecute(String output){
                try {
                    JSONArray ja = new JSONArray( output );
                    JSONObject jo = (JSONObject)ja.get(0);
                    //textView4.setText("Last Name: "+jo.getString( "UserLname" ));
                } catch (Exception e){
                    e.printStackTrace();
                }

            }

        };
        asyncHTTPPost1.execute( );

        btn = findViewById(R.id.btn);
      //  btnScroll = findViewById(R.id.btnScroll);
        LLPdf = findViewById(R.id.LLPDF);

//        btnScroll.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this,ScrollActivity.class);
//                startActivity(intent);
//            }
//        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn.setText("School of Computer Science & Applied Maths" +
                        " Tutors Claim form");
                Log.d("size"," "+LLPdf.getWidth() +"  "+LLPdf.getWidth());
                bitmap = loadBitmapFromView(LLPdf, LLPdf.getWidth(), LLPdf.getHeight());
                createPdf();
            }
        });

    }

    public static Bitmap loadBitmapFromView(View v, int width, int height) {
        Bitmap b = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas c = new Canvas(b);
        v.draw(c);

        return b;
    }

    private void createPdf(){
        WindowManager wm = (WindowManager) getSystemService(Context.WINDOW_SERVICE);
        //  Display display = wm.getDefaultDisplay();
        DisplayMetrics displaymetrics = new DisplayMetrics();
        this.getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);
        float hight = displaymetrics.heightPixels ;
        float width = displaymetrics.widthPixels ;

        int convertHighet = (int) hight, convertWidth = (int) width;

//        Resources mResources = getResources();
//        Bitmap bitmap = BitmapFactory.decodeResource(mResources, R.drawable.screenshot);

        PdfDocument document = new PdfDocument();
        PdfDocument.PageInfo pageInfo = new PdfDocument.PageInfo.Builder(convertWidth, convertHighet, 1).create();
        PdfDocument.Page page = document.startPage(pageInfo);

        Canvas canvas = page.getCanvas();

        Paint paint = new Paint();
        canvas.drawPaint(paint);

        bitmap = Bitmap.createScaledBitmap(bitmap, convertWidth, convertHighet, true);

        paint.setColor(Color.BLUE);
        canvas.drawBitmap(bitmap, 0, 0 , null);
        document.finishPage(page);

        // write the document content
        String targetPdf = "/sdcard/TutorClaimForm.pdf";
        File filePath;
        filePath = new File(targetPdf);
        try {
            document.writeTo(new FileOutputStream(filePath));

        } catch (IOException e) {
            e.printStackTrace();
            Toast.makeText(this, "Something wrong: " + e.toString(), Toast.LENGTH_LONG).show();
        }

        // close the document
        document.close();
        Toast.makeText(this, "PDF Saved As 'TutorClaimForm.pdf' In The Internal Storage", Toast.LENGTH_SHORT).show();

        openGeneratedPDF();

    }

    private void openGeneratedPDF(){
        File file = new File("/sdcard/TutorClaimForm.pdf");
        if (file.exists())
        {
            Intent intent=new Intent(Intent.ACTION_VIEW);
            Uri uri = Uri.fromFile(file);
            intent.setDataAndType(uri, "application/pdf");
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

            try
            {
                startActivity(intent);
            }
            catch(ActivityNotFoundException e)
            {
                Toast.makeText(generateform.this, "No Application available to view pdf", Toast.LENGTH_LONG).show();
            }
        }
    }

}