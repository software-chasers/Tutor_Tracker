package com.example.software_chasers.tutor_tracker;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.zip.Inflater;

public class InformationAdapter extends RecyclerView.Adapter<InformationAdapter.InformationViewHolder> {

    private Context context;
    private List<Course> courses;

    public InformationAdapter(Context context, List<Course> courses) {
        this.context = context;
        this.courses = courses;
    }


    @Override
    public InformationViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view =  layoutInflater.inflate(R.layout.information_layout,null);
        return new InformationViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final InformationViewHolder holder, int position) {
    Course course = courses.get(position);
    String s = course.getType();
    holder.popmenu.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            PopupMenu popupMenu = new PopupMenu(context, holder.popmenu);
            popupMenu.inflate(R.menu.pop_up);
            popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                @Override
                public boolean onMenuItemClick(MenuItem menuItem) {
                    switch(menuItem.getItemId()){
                        case R.id.gen:
                         String day1= holder.day.getText().toString();
                         String type1= holder.type.getText().toString();
                         String code1= holder.code.getText().toString();
                         String time1= holder.time.getText().toString();
                         String venue1= holder.venue.getText().toString();
                         String date =  new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).format(new Date());

                            Intent intent = new Intent(context,QR_Code.class);
                            intent.putExtra("Code",code1);
                            intent.putExtra("Day",day1);
                            intent.putExtra("Type",type1);
                            intent.putExtra("Time",time1);
                            intent.putExtra("Venue",venue1);
                            intent.putExtra("Date",date);
                            context.startActivity(intent);
                            break;
                    }
                    return false;
                }
            });
            popupMenu.show();
        }
    });
        switch (s) {
            case "TUTORIAL":
                holder.code.setText(course.getId());
                holder.type.setText(course.getType());
                holder.day.setText(course.getTutorial_day());
                holder.time.setText(course.gettTime());
                holder.venue.setText(course.getT_venue());
                break;
            case "LAB":
                holder.code.setText(course.getId());
                holder.type.setText(course.getType());
                holder.day.setText(course.getLab_day());
                holder.time.setText(course.getLTime());
                holder.venue.setText(course.getLvenue());
                break;
            default:

                break;
        }


    }


    @Override
    public int getItemCount() {
        return courses.size();
    }

    class InformationViewHolder extends RecyclerView.ViewHolder{

        TextView type,day,time,venue,code;
        ImageView popmenu;

        public InformationViewHolder(View itemView) {
            super(itemView);
            code =itemView.findViewById(R.id.aCode);
            type = itemView.findViewById(R.id.aType);
            day =itemView.findViewById(R.id.aDay);
            time =itemView.findViewById(R.id.aTime);
            venue =itemView.findViewById(R.id.aVenue);
            popmenu = itemView.findViewById(R.id.iv_menu);
        }
    }
}
