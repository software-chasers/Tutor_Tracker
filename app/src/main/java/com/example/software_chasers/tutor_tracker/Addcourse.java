package com.example.software_chasers.tutor_tracker;

import java.util.ArrayList;
import java.util.List;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class Addcourse extends Activity {

    private Spinner spinner1;
    private Button btnSubmit;

//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_addcourse);
//        spinner1 = (Spinner) findViewById(R.id.spinner1);
//        addListenerOnButton();
//
///*        spinner1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//               // addListenerOnSpinnerItemSelection(spinner1);
//            }
//        });*/
//       addListenerOnSpinnerItemSelection(spinner1);
//    }
//
//    public void addListenerOnSpinnerItemSelection(Spinner spinner) {
//        spinner.setOnItemSelectedListener(new CustomOnItemSelectedListener());
//    }



    // get the selected dropdown list value
    public void addListenerOnButton() {

        spinner1 = (Spinner) findViewById(R.id.spinner1);
        btnSubmit = (Button) findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                Toast.makeText(Addcourse.this,
                        "Added all Courses  ",
                        Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), LectureHomePage.class);
                startActivity(intent);
            }

        });
    }
}
