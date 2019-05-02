package com.example.software_chasers.tutor_tracker;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;
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
    public void onBindViewHolder(InformationViewHolder holder, int position) {
    Course course = courses.get(position);
    String s = course.getType();
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

        public InformationViewHolder(View itemView) {
            super(itemView);
            code =itemView.findViewById(R.id.aCode);
            type = itemView.findViewById(R.id.aType);
            day =itemView.findViewById(R.id.aDay);
            time =itemView.findViewById(R.id.aTime);
            venue =itemView.findViewById(R.id.aVenue);
        }
    }
}
