package com.example.software_chasers.tutor_tracker;

import android.view.View;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import androidx.test.espresso.ViewAction;
import androidx.test.espresso.ViewInteraction;
import androidx.test.espresso.action.ViewActions;
import androidx.test.rule.ActivityTestRule;

import static androidx.test.espresso.Espresso.closeSoftKeyboard;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
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

    @Test
    public void StudentSignUp()
    {
        ViewInteraction fac = onView(withId(R.id.faculty));
        fac.perform( ViewActions.typeText( "Science" ) , ViewActions.closeSoftKeyboard());
        ViewInteraction ys = onView(withId(R.id.yos));
        ys.perform(ViewActions.typeText("3"),ViewActions.closeSoftKeyboard());
        ViewInteraction de = onView(withId(R.id.degree));
        de.perform(ViewActions.typeText("Computer Science"),ViewActions.closeSoftKeyboard());
        ViewInteraction pr = onView(withId(R.id.proceed));
        pr.perform(click());

    }

    @After
    public void tearDown() throws Exception {
        studentSignUp = null;
    }
}