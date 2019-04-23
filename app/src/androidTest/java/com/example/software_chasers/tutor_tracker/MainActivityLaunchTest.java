package com.example.software_chasers.tutor_tracker;

import android.app.Activity;
import android.app.Instrumentation;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.rule.ActivityTestRule;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.platform.app.InstrumentationRegistry.getInstrumentation;
import static org.junit.Assert.*;

public class MainActivityLaunchTest {
//    @Rule
//    public ActivityTestRule<MainActivity> mainActivityTestRule = new ActivityTestRule<MainActivity>(MainActivity.class);
//    private MainActivity mActivity = null;
//    Instrumentation.ActivityMonitor monitor = getInstrumentation().addMonitor(Create_Profile.class.getName(),null,false);
//
//    @Before
//    public void setUp() throws Exception {
//        mActivity = mainActivityTestRule.getActivity();
//    }
//
//    @Test
//    public void activitylaunchtest()
//    {
//        assertNotNull(mActivity.findViewById(R.id.signup));
//        onView(withId(R.id.signup));
//        Activity Create_Profile =  getInstrumentation().waitForMonitorWithTimeout(monitor,5000);
//        assertNotNull(Create_Profile);
//        Create_Profile.finish();
//    }
//
//    @After
//    public void tearDown() throws Exception {
//        mActivity = null;
//    }
}