package com.example.software_chasers.tutor_tracker;

public class Course {
    private String  id,tutorial_day,lab_day,t_venue,lvenue,tTime,lTime,type;

    public Course(String id, String tutorial_day, String lab_day, String t_venue, String lvenue, String tTime,String lTime) {
        this.id = id;
        this.tutorial_day = tutorial_day;
        this.lab_day = lab_day;
        this.t_venue = t_venue;
        this.lvenue = lvenue;
        this.tTime = tTime;
        this.lTime = lTime;
       // this.type = type;
    }

    public String getId() {
        return id;
    }

    public String getTutorial_day() {
        return tutorial_day;
    }

    public String getLab_day() {
        return lab_day;
    }

    public String getT_venue() {
        return t_venue;
    }

    public String getLvenue() {
        return lvenue;
    }

    public String gettTime() {
        return tTime;
    }

    public String getType() {
        if(this.tutorial_day.equals("None")){
            this.type = "LAB";
        }else if(this.lab_day.equals("None")){
            this.type = "TUTORIAL";
        }else this.type = "BOTH";
        return type;
    }

    public String getLTime() {
        return lTime;
    }
}
