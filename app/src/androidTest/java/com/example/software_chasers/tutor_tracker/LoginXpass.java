package com.example.software_chasers.tutor_tracker;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import androidx.test.espresso.ViewInteraction;
import androidx.test.rule.ActivityTestRule;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.doesNotExist;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

public class LoginXpass {
    private String user,pass;

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Before
    public void intStrings(){
        user = "1661233";
        pass = "jgbfgbjbvbjsjgjsf2188";
    }

    @Test
    public void login(){

        ViewInteraction username = onView(withId(R.id.editText2));
        username.perform(typeText(user),closeSoftKeyboard());
        ViewInteraction password = onView(withId(R.id.editText));
        password.perform(typeText(pass),closeSoftKeyboard());
        ViewInteraction button = onView(withId(R.id.button2));
        button.perform(click());
        button.check(doesNotExist());

    }
}
