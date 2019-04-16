package com.example.software_chasers.tutor_tracker;

import android.view.View;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import androidx.test.rule.ActivityTestRule;

import static org.junit.Assert.*;

public class AddCoursesTest {

    @Rule
    public ActivityTestRule<AddCourses> activityTestRule = new ActivityTestRule<AddCourses>(AddCourses.class);
    public AddCourses addCourses = null;

    @Before
    public void setUp() throws Exception {
        addCourses = activityTestRule.getActivity();
    }

    @Test
    public void addCoursesLaunched()
    {
        View view = addCourses.findViewById(R.id.textView9);
        assertNotNull(view);
        View views = addCourses.findViewById(R.id.button);
        assertNotNull(views);
    }

    @After
    public void tearDown() throws Exception {
       addCourses = null;
    }
}