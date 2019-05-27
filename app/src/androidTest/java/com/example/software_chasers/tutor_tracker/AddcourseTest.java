//package com.example.software_chasers.tutor_tracker;
//
//import android.view.View;
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
//public class AddcourseTest {
//
//    @Rule
//    public ActivityTestRule<Addcourse> activityTestRule = new ActivityTestRule<>( Addcourse.class );
//    private Addcourse addcourse = null;
//
//    @Before
//    public void setUp() throws Exception {
//        addcourse = activityTestRule.getActivity();
//    }
//
//    @Test
//    public void AddcourseLaunched(){
//        View spinner = addcourse.findViewById( R.id.spinner1 );
//        assertNotNull( spinner );
//        View button = addcourse.findViewById( R.id.btnSubmit );
//        assertNotNull( button );
//        View text = addcourse.findViewById( R.id.textView9 );
//        assertNotNull( text );
//    }
//
//    @After
//    public void tearDown() throws Exception {
//        addcourse = null;
//    }
//}