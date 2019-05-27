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
//public class ViewApplicationStatusTest {
//    @Rule
//    public ActivityTestRule<ViewApplicationStatus> activityTestRule = new ActivityTestRule<ViewApplicationStatus>(ViewApplicationStatus.class);
//    private ViewApplicationStatus StatusApplication = null;
//
//    @Before
//    public void setUp() throws Exception {
//        StatusApplication = activityTestRule.getActivity();
//    }
//
//    @Test
//    public void ViewApplicationTest()
//    {
//        View view = StatusApplication.findViewById(R.id.viewapp);
//        assertNotNull(view);
//        View view1 = StatusApplication.findViewById(R.id.textView55);
//        assertNotNull(view1);
//    }
//
//    @After
//    public void tearDown() throws Exception {
//        StatusApplication = null;
//    }
//}