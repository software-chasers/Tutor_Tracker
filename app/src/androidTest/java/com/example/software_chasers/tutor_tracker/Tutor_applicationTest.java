package com.example.software_chasers.tutor_tracker;

import android.view.View;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import androidx.test.rule.ActivityTestRule;

import static org.junit.Assert.*;

public class Tutor_applicationTest {

    @Rule
    public ActivityTestRule<Tutor_application> activityTestRule = new ActivityTestRule<>( Tutor_application.class);
    private Tutor_application tutor_application = null;

    @Before
    public void setUp() throws Exception {
        tutor_application = activityTestRule.getActivity();

    }

    @Test
    public void Tutor_applicationLaunched(){
        View text = tutor_application.findViewById( R.id.textView );
        assertNotNull( text );
    }

    @After
    public void tearDown() throws Exception {
        tutor_application = null;
    }
}