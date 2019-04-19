package com.example.software_chasers.tutor_tracker;

import android.view.View;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import androidx.test.rule.ActivityTestRule;

import static org.junit.Assert.*;

public class StudentSignUpTest {

    @Rule
    public ActivityTestRule<StudentSignUp> activityTestRule = new ActivityTestRule<>(StudentSignUp.class);
    public StudentSignUp studentSignUp = null;

    @Before
    public void setUp() throws Exception {
        studentSignUp = activityTestRule.getActivity();
    }

    @Test
    public void StudentSignUpLaunched(){
        View faculty = studentSignUp.findViewById(R.id.faculty);
        assertNotNull(faculty);
        View yos =  studentSignUp.findViewById(R.id.yos);
        assertNotNull(yos);
        View deg = studentSignUp.findViewById(R.id.degree);
        assertNotNull(deg);
    }

    @After
    public void tearDown() throws Exception {
        studentSignUp = null;
    }
}