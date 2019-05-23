package com.example.software_chasers.tutor_tracker;

import android.view.View;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import androidx.test.rule.ActivityTestRule;

import static org.junit.Assert.*;

public class Main2ActivityTest {

    @Rule
    public ActivityTestRule<Main2Activity> activityActivityTestRule = new ActivityTestRule<>( Main2Activity.class );
    private Main2Activity main2Activity = null;

    @Before
    public void setUp() throws Exception {
        main2Activity = activityActivityTestRule.getActivity();
    }

    @Test
    public void main2ActivityTest(){
        View view = main2Activity.findViewById( R.id.nav_view );
        assertNotNull( view );
    }

    @After
    public void tearDown() throws Exception {
        main2Activity = null;
    }
}