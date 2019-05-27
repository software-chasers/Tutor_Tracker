package com.example.software_chasers.tutor_tracker;

import android.view.View;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import androidx.test.espresso.ViewInteraction;
import androidx.test.rule.ActivityTestRule;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.*;

public class LectureHomePageTest {

    @Rule
    public ActivityTestRule<LectureHomePage> activityTestRule = new ActivityTestRule<LectureHomePage>(LectureHomePage.class);
    public LectureHomePage lectureHomePage = null;

    @Before
    public void setUp() throws Exception {
        lectureHomePage = activityTestRule.getActivity();
    }

    @Test
    public void lectureHomePageLaunched()
    {
        View view = lectureHomePage.findViewById(R.id.nav_view);
        assertNotNull(view);
    }
    @Test
    public void LewctureHome()
    {
       // ViewInteraction view = onView(withId(R.id.nav_view));
       // view.perform(click());
    }

    @After
    public void tearDown() throws Exception {
        lectureHomePage = null;
    }
}