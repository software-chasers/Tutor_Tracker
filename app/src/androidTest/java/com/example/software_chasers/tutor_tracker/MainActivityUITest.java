package com.example.software_chasers.tutor_tracker;

import android.support.test.espresso.ViewAssertion;
import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

public class MainActivityUITest {

    @Test
    public void testButton(){
        onView(withId(R.id.button)).perform(click());
    }
}
