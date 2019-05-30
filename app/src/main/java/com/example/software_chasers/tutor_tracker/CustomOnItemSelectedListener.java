//package com.example.software_chasers.tutor_tracker;
//
//import android.annotation.SuppressLint;
//import android.app.AlertDialog;
//import android.content.ContentValues;
//import android.content.DialogInterface;
//import android.view.View;
//import android.widget.AdapterView;
//import android.widget.AdapterView.OnItemSelectedListener;
//import android.widget.Toast;
//
//public class CustomOnItemSelectedListener implements OnItemSelectedListener {
//
//    public void onItemSelected(final AdapterView<?> parent, View view, final int pos, long id) {
//        if(parent.getItemAtPosition(pos).toString().equals("        ")){
//            Toast.makeText(parent.getContext(),"Select Course",Toast.LENGTH_SHORT).show();
//        }else {
//
//            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(parent.getContext());
//            alertDialogBuilder.setTitle("Comfirm Course");
//            alertDialogBuilder.setCancelable(true);
//            alertDialogBuilder.setMessage("D0 you want to add" + parent.getItemAtPosition(pos).toString() + " to your Courses");
//            alertDialogBuilder.setPositiveButton("yes", new DialogInterface.OnClickListener() {
//                @Override
//                public void onClick(DialogInterface dialogInterface, int i) {
//                    final String cCode = parent.getItemAtPosition(pos).toString();
//
//                    ContentValues params = new ContentValues();
//                    params.put("code",cCode);
//                    params.put("userid","11");
//                    @SuppressLint("StaticFieldLeak") AsyncHTTPPost asyncHTTPPost = new AsyncHTTPPost("http://lamp.ms.wits.ac.za/~s1741606/insertCourseLecturer.php",params) {
//                        @Override
//                        protected void onPostExecute(String output) {
//                            if(output.contains("true")){
//                                Toast.makeText(parent.getContext(),
//                                        "Successfully added : " + cCode,
//                                        Toast.LENGTH_SHORT).show();
//                            }
//                        }
//                    };
//                    asyncHTTPPost.execute();
//                }
//            });
//            alertDialogBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
//                @Override
//                public void onClick(DialogInterface dialogInterface, int i) {
//
//                }
//            });
//            AlertDialog alertDialog = alertDialogBuilder.create();
//            alertDialog.show();
//        }
//    }
//
//    @Override
//    public void onNothingSelected(AdapterView<?> arg0) {
//        // TODO Auto-generated method stub
//    }
//
//}
