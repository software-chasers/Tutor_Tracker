//package com.example.software_chasers.tutor_tracker;
//
//import android.app.Activity;
//import android.app.Instrumentation;
//import android.content.Intent;
//
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Rule;
//import org.junit.Test;
//
//import androidx.test.platform.app.InstrumentationRegistry;
//import androidx.test.rule.ActivityTestRule;
//
//import static androidx.test.espresso.Espresso.onView;
//import static androidx.test.espresso.action.ViewActions.click;
//import static androidx.test.espresso.matcher.ViewMatchers.withId;
//import static androidx.test.platform.app.InstrumentationRegistry.getInstrumentation;
//import static org.junit.Assert.*;
//
//public class MainActivityLaunchTest {
//    @Rule
//    public ActivityTestRule<MainActivity> mainActivityTestRule = new ActivityTestRule<MainActivity>(MainActivity.class);
//    private MainActivity mActivity = null;
//
//    @Before
//    public void setUp() throws Exception {
//        mActivity = mainActivityTestRule.getActivity();
//    }
//
////    @Test
////    public void activitylaunchtest()
////    {
//////        Instrumentation.ActivityResult  result = new Instrumentation.ActivityResult( Activity.RESULT_OK,null );
//////        assertNotNull( result );
////        Instrumentation.ActivityMonitor monitor =  getInstrumentation().addMonitor(Create_Profile.class.getName(),null,false);
////        assertNotNull(mActivity.findViewById(R.id.signup));
////        onView(withId(R.id.signup));
////        assertNotNull( monitor );
////        Activity Create_Profile =  getInstrumentation().waitForMonitorWithTimeout(monitor,10000);
////        assertNotNull(Create_Profile);
////        Create_Profile.finish();
////
////        //intending(hasComponent(Create_Profile.class.getName())).respondWith(new Instrumentation.ActivityResult(Activity.RESULT_OK, null));
////       // rule.getActivity().startActivityForResult(new Intent(context,Create_Profile.class));
////    }
//
//    @After
//    public void tearDown() throws Exception {
//        mActivity = null;
//    }
//}