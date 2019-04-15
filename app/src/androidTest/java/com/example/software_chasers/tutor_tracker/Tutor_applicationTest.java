package com.example.software_chasers.tutor_tracker;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;

import androidx.test.rule.ActivityTestRule;

import static org.junit.Assert.*;

public class Tutor_applicationTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Rule
    public ActivityTestRule<Tutor_application> activityTestRule = new ActivityTestRule<>( Tutor_application.class );
}