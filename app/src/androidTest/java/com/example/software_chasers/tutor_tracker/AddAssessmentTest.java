//package com.example.software_chasers.tutor_tracker;
//
//import android.view.View;
//
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Rule;
//import org.junit.Test;
//
//import androidx.test.espresso.ViewInteraction;
//import androidx.test.espresso.action.ViewActions;
//import androidx.test.rule.ActivityTestRule;
//
//import static androidx.test.espresso.Espresso.onView;
//import static androidx.test.espresso.action.ViewActions.click;
//import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
//import static androidx.test.espresso.matcher.ViewMatchers.withId;
//import static org.junit.Assert.*;
//
//public class AddAssessmentTest {
//
//    @Rule
//    public ActivityTestRule<AddAssessment> addAssessmentActivityTestRule = new ActivityTestRule<>( AddAssessment.class );
//    private AddAssessment addAssessment = null;
//
//    @Before
//    public void setUp() throws Exception {
//        addAssessment = addAssessmentActivityTestRule.getActivity();
//    }
//
//    @Test
//    public void AddAssessmentLaunched(){
//
//        View text = addAssessment.findViewById( R.id.course );
//        assertNotNull( text );
//        View text1 = addAssessment.findViewById( R.id.in_date );
//        assertNotNull( text1 );
//        View text2 = addAssessment.findViewById( R.id.in_time );
//        assertNotNull( text2 );
//        View text3 = addAssessment.findViewById( R.id.duration );
//        assertNotNull( text3 );
//        View button = addAssessment.findViewById( R.id.btn_date);
//        assertNotNull( button );
//        View button1 = addAssessment.findViewById( R.id.btn_time);
//        assertNotNull( button1);
//        View button2 = addAssessment.findViewById( R.id.done);
//        assertNotNull( button2);
//    }
//
//    @Test
//    public void AddAssessment()
//    {
//        /*ViewInteraction view = onView(withId(R.id.course));
//        view.perform(ViewActions.typeText("Coms1017"),closeSoftKeyboard());
//        ViewInteraction Din = onView(withId(R.id.btn_date));
//        Din.perform(click());
//        ViewInteraction Tin = onView(withId(R.id.btn_time));
//        Tin.perform(click());
//        ViewInteraction typEv = onView(withId(R.id.asstype));
//        typEv.perform(ViewActions.typeText("Lab"));
//        ViewInteraction Dur = onView(withId(R.id.duration));
//        Dur.perform(ViewActions.typeText("3"),closeSoftKeyboard());
//        ViewInteraction Dn = onView(withId(R.id.done));
//        Dn.perform(click());*/
//    }
//    @After
//    public void tearDown() throws Exception {
//        addAssessment = null;
//    }
//}