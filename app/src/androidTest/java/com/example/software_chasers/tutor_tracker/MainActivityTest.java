package com.example.software_chasers.tutor_tracker;

import android.app.Activity;
import android.app.Instrumentation;
import android.content.Intent;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import androidx.test.espresso.ViewInteraction;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isClickable;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.isEnabled;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class MainActivityTest{

//    @Test
//    public void testsignUpbutton(){
//        //Intents.init();
//        Intent resultData = new Intent(  );
//        Instrumentation.ActivityResult result = new Instrumentation.ActivityResult( Activity.RESULT_OK,resultData );
//        intending(toPackage("com.example.software_chasers.tutor_tracker")).repondWith(result);
//        onView( withId( R.id.signup ) ).perform( click() );
//    }

    @Rule
    public ActivityTestRule<MainActivity> mainActivityActivityRule = new ActivityTestRule<>( MainActivity.class );

    @Test
    public void Visibility(){

        ViewInteraction button2 = onView(withId(R.id.signup));
        button2.check(matches( isDisplayed() ));
        ViewInteraction button = onView(withId(R.id.signIn));
        button.check(matches( isDisplayed() ));
//        button.check(matches( isEnabled() ) );
        ViewInteraction image = onView(withId(R.id.imageView));
        image.check(matches(isDisplayed()));
        ViewInteraction userName = onView(withId(R.id.edituserid));
        userName.check(matches(isDisplayed()));
        ViewInteraction Password = onView(withId(R.id.editpassword));
        Password.check(matches(isDisplayed()));
        ViewInteraction checkbox = onView( withId( R.id.checkBox ) );
        checkbox.perform( click() );
        checkbox.check( matches( isDisplayed() ) );
    }
//
//    @Rule
//    public IntentsTestRule<MainActivity> intentsTestRule = new IntentsTestRule<>(MainActivity.class);
//    private String user,pass;
//
//    @Rule
//    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);
//
//    @Before
//    public void intStrings(){
//        user = "SiphoSpontaneousNkosi";
//        pass = "spontaneous";
//    }
//
//    @Test
//    public void login(){
//
//        ViewInteraction username = onView(withId(R.id.editText2));
//        username.perform(typeText(user),closeSoftKeyboard());
//        ViewInteraction password = onView(withId(R.id.editText));
//        password.perform(typeText(pass),closeSoftKeyboard());
////        ViewInteraction button = onView(withId(R.id.button2));
////        button.perform(click());
////        button.check(doesNotExist());
////        assertThat( ,example_menu);
//    }
}

