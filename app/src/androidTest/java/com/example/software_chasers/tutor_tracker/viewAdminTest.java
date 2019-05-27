package com.example.software_chasers.tutor_tracker;

import android.view.View;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import androidx.test.rule.ActivityTestRule;

import static org.junit.Assert.*;

public class viewAdminTest {
    @Rule
    public ActivityTestRule<viewAdmin> activityTestRule = new ActivityTestRule<>(viewAdmin.class);
    private viewAdmin Admin = null;

    @Before
    public void setUp() throws Exception {
        Admin = activityTestRule.getActivity();
    }

    @Test
    public void ViewAdminTest()
    {
        View view = Admin.findViewById(R.id.imageView2);
        assertNotNull(view);
        View view1 = Admin.findViewById(R.id.textView3);
        assertNotNull(view1);
        View view2 = Admin.findViewById(R.id.textView4);
        assertNotNull(view2);
        View view3 = Admin.findViewById(R.id.textView5);
        assertNotNull(view3);
        View view4 = Admin.findViewById(R.id.textView8);
        assertNotNull(view4);
        View view5 = Admin.findViewById(R.id.textView11);
        assertNotNull(view5);
    }

    @After
    public void tearDown() throws Exception {
        Admin = null;
    }
}