package com.example.software_chasers.tutor_tracker;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.ContentValues;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

public class AddAssessment extends AppCompatActivity implements View.OnClickListener{


    Button btnDatePicker, btnTimePicker,done;
    EditText txtDate, txtTime,duration,code,Atype;
    String cCode,date,time,dur,type;
    private int mYear, mMonth, mDay, mHour, mMinute;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_courses);
        btnDatePicker = (Button) findViewById(R.id.btn_date);
        btnTimePicker=(Button)findViewById(R.id.btn_time);
        done = findViewById(R.id.done);
        txtDate=(EditText)findViewById(R.id.in_date);
        txtTime=(EditText)findViewById(R.id.in_time);
        duration = findViewById(R.id.duration);
        code = findViewById(R.id.course);
        Atype = findViewById(R.id.asstype);

        btnDatePicker.setOnClickListener(this);
        btnTimePicker.setOnClickListener(this);

        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               cCode = code.getText().toString();
               date = txtDate.getText().toString();
               time= txtTime.getText().toString();
               dur = duration.getText().toString();
               type = Atype.getText().toString();

                ContentValues params = new  ContentValues();
                params.put("code",cCode);
                params.put("date",date);
                params.put("time",time);
                params.put("dur",dur);
                params.put("type",type);

                @SuppressLint("StaticFieldLeak") AsyncHTTPPost asyncHTTPPost = new AsyncHTTPPost("http://lamp.ms.wits.ac.za/~s1741606/insertAssessment.php",params) {
                    @Override
                    protected void onPostExecute(String output) {
                        if (output.contains("true")) {
                            Toast.makeText(getApplicationContext(), "ADDED ASSESSMENT TASK!!", Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(getApplicationContext(), LectureHomePage.class);
                            startActivity(intent);
                        } else {
                            Toast.makeText(getApplicationContext(), "UNSUCCESSFUL", Toast.LENGTH_SHORT).show();
                        }
                    }
                };
                asyncHTTPPost.execute();

            }
        });

    }

    @Override
    public void onClick(View v) {

        if (v == btnDatePicker) {

            // Get Current Date
            final Calendar c = Calendar.getInstance();
            mYear = c.get(Calendar.YEAR);
            mMonth = c.get(Calendar.MONTH);
            mDay = c.get(Calendar.DAY_OF_MONTH);
        String s = "me";

            DatePickerDialog datePickerDialog = new DatePickerDialog(this,
                    new DatePickerDialog.OnDateSetListener() {

                        @Override
                        public void onDateSet(DatePicker view, int year,
                                              int monthOfYear, int dayOfMonth) {

                            txtDate.setText( year + "-" + (monthOfYear + 1) + "-" + dayOfMonth);

                        }
                    }, mYear, mMonth, mDay);
            datePickerDialog.show();
        }
        if (v == btnTimePicker) {

            // Get Current Time
            final Calendar c = Calendar.getInstance();
            mHour = c.get(Calendar.HOUR_OF_DAY);
            mMinute = c.get(Calendar.MINUTE);

            // Launch Time Picker Dialog
            TimePickerDialog timePickerDialog = new TimePickerDialog(this,
                    new TimePickerDialog.OnTimeSetListener() {

                        @Override
                        public void onTimeSet(TimePicker view, int hourOfDay,
                                              int minute) {

                            txtTime.setText(hourOfDay + ":" + minute);
                        }
                    }, mHour, mMinute, false);
            timePickerDialog.show();
        }
    }


}
