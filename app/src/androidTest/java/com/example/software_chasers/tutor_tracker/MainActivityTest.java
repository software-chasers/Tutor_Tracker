package com.example.software_chasers.tutor_tracker;

import android.view.View;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import java.nio.channels.AcceptPendingException;

import androidx.test.espresso.ViewInteraction;
import androidx.test.espresso.action.ViewActions;
import androidx.test.rule.ActivityTestRule;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.*;

public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> activityActivityTestRule = new ActivityTestRule<>(MainActivity.class);
    private MainActivity mainActivity = null;

    @Before
    public void setUp() throws Exception {
        mainActivity = activityActivityTestRule.getActivity();
    }

    @Test
    public void MainActivityLaunched(){
        View button2 = mainActivity.findViewById(R.id.signup);
        assertNotNull( button2 );
        View button = mainActivity.findViewById(R.id.signIn);
        assertNotNull( button );
        View image = mainActivity.findViewById(R.id.imageView);
        assertNotNull( image );
        View userName = mainActivity.findViewById(R.id.edituserid);
        assertNotNull( userName );
        View Password = mainActivity.findViewById(R.id.editpassword);
        assertNotNull( Password );
        View checkbox = mainActivity.findViewById( R.id.checkBox );
        assertNotNull( checkbox );
    }

//    @Test
//    public void stringcheck(){
//        assertFalse(mainActivity.strcmp("someString" ,null ));
//        assertFalse( mainActivity.strcmp(null ,null ));
//        assertTrue(mainActivity.strcmp("someString" ,"someString"));
//        assertFalse( mainActivity.strcmp( "","someString"  )  );
//    }

    @Test
    public void Sudent_login(){
        ViewInteraction userid = onView( withId( R.id.edituserid ) );
        userid.perform( ViewActions.typeText( "456" ) ,closeSoftKeyboard());
        ViewInteraction Pass = onView( withId( R.id.editpassword ) );
        Pass.perform( ViewActions.typeText( "0000" ) ,closeSoftKeyboard());
        ViewInteraction button = onView( withId( R.id.signIn ) );
        button.perform( click() );
    }

    @Test
    public void Lecture_login(){
        ViewInteraction userid = onView( withId( R.id.edituserid ) );
        userid.perform( ViewActions.typeText( "11" ) ,closeSoftKeyboard());
        ViewInteraction Pass = onView( withId( R.id.editpassword ) );
        Pass.perform( ViewActions.typeText( "1111" ) ,closeSoftKeyboard());
        ViewInteraction button = onView( withId( R.id.signIn ) );
        button.perform( click() );
    }

    @Test
    public void Admin_login(){
        ViewInteraction userid = onView( withId( R.id.edituserid ) );
        userid.perform( ViewActions.typeText( "33" ) ,closeSoftKeyboard());
        ViewInteraction Pass = onView( withId( R.id.editpassword ) );
        Pass.perform( ViewActions.typeText( "33" ) ,closeSoftKeyboard());
        ViewInteraction button = onView( withId( R.id.signIn ) );
        button.perform( click() );
    }


    @After
    public void tearDown() throws Exception {
        mainActivity = null;
    }
}