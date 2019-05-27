//package com.example.software_chasers.tutor_tracker;
//
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Rule;
//import org.junit.Test;
//
//import androidx.test.rule.ActivityTestRule;
//
//import static org.junit.Assert.*;
//
//public class CourseTest {
//    @Before
//    public void setUp() throws Exception {
//    }
//
//
//    @Test
//    public void get_id(){
//        Course test = new Course( "id","tutorial_day","lab_day", "t_venue","lvene","tTime","type" );
//        assertEquals( "id",test.getId() );
//    }
//
//    @Test
//    public void get_tutorial(){
//        Course test = new Course( "id","tutorial_day","lab_day", "t_venue","lvene","tTime","type" );
//        assertEquals( "tutorial_day",test.getTutorial_day() );
//    }
//
//    @Test
//    public void get_labday(){
//        Course test = new Course( "id","tutorial_day","lab_day", "t_venue","lvene","tTime","type" );
//        assertEquals( "lab_day",test.getLab_day() );
//    }
//
//    @Test
//    public void  get_tVenue(){
//        Course test = new Course( "id","tutorial_day","lab_day", "t_venue","lvene","tTime","type" );
//        assertEquals( "t_venue",test.getT_venue() );
//    }
//
//    @Test
//    public void get_lvenue(){
//        Course test = new Course( "id","tutorial_day","lab_day", "t_venue","lvene","tTime","type" );
//        assertEquals( "lvene",test.getLvenue() );
//    }
//
//    @Test
//    public void get_tTime(){
//        Course test = new Course( "id","tutorial_day","lab_day", "t_venue","lvene","tTime","type" );
//        assertEquals( "tTime",test.gettTime() );
//    }
//
//    @Test
//    public void get(){
//        Course test = new Course( "id","tutorial_day","lab_day", "t_venue","lvene","tTime","iTime" );
//        Course test1 = new Course( "id","None","lab_day", "t_venue","lvene","tTime","iTime" );
//        Course test2 = new Course( "id","tutorial_day","None", "t_venue","lvene","tTime","iTime" );
//        assertEquals( "BOTH",test.getType() );
//        assertEquals( "LAB",test1.getType() );
//        assertEquals( "TUTORIAL",test2.getType() );
//    }
//
//    @After
//    public void tearDown() throws Exception {
//    }
//}