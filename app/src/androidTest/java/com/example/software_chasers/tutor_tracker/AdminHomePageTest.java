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
        View im = adminHomePage.findViewById(R.id.textView);
        assertNotNull(im);
        //View text = adminHomePage.findViewById(R.id.textView15);
        //assertNotNull(text);
        //View adm = adminHomePage.findViewById(R.id.textView17);
        //assertNotNull(adm);

    }

    @After
    public void tearDown() throws Exception {
        adminHomePage = null;
    }
}