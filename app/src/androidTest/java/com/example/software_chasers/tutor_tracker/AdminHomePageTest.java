package com.example.software_chasers.tutor_tracker;

import android.view.View;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import androidx.test.rule.ActivityTestRule;

import static org.junit.Assert.*;

public class AdminHomePageTest {

    @Rule
    public ActivityTestRule<AdminHomePage> activityTestRule = new ActivityTestRule<>( AdminHomePage.class );
    private AdminHomePage adminHomePage = null;

    @Before
    public void setUp() throws Exception {
        adminHomePage = activityTestRule.getActivity();
    }

    @Test
    public void AdminHomePageLaunched(){
        View nav = adminHomePage.findViewById( R.id.nav_view );
        assertNotNull( nav );
    }

    @After
    public void tearDown() throws Exception {
        adminHomePage = null;
    }
}