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
    private StudentSignUp studentSignUp = null;

    @Before
    public void setUp() throws Exception {
        studentSignUp = activityTestRule.getActivity();
    }

    @Test
    public void LaunchingStudentSignUp()
    {
        View view = studentSignUp.findViewById(R.id.faculty);
        assertNotNull(view);
        View views = studentSignUp.findViewById(R.id.yos);
        assertNotNull(views);
        View viewss = studentSignUp.findViewById(R.id.degree);
        assertNotNull(viewss);
    }

    @After
    public void tearDown() throws Exception {
        studentSignUp = null;
    }
}