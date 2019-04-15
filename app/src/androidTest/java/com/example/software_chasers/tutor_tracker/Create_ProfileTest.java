package com.example.software_chasers.tutor_tracker;

import android.widget.Button;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import androidx.test.espresso.ViewInteraction;
import androidx.test.rule.ActivityTestRule;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

public class Create_ProfileTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Rule
    public ActivityTestRule<Create_Profile> activityTestRule = new ActivityTestRule<>( Create_Profile.class );

    @Test
    public void visibity(){
        ViewInteraction text = onView(withId(R.id.creatprofile));
        text.check( matches(isDisplayed()) );
        ViewInteraction Fnames = onView( withId(R.id.fname ) );
        Fnames.check( matches( isDisplayed() ) );
        ViewInteraction Lnames = onView( withId( R.id.lname ) );
        Lnames.check( matches( isDisplayed() ) );
        ViewInteraction userid = onView( withId( R.id.userid ) );
        userid.check( matches( isDisplayed() ) );
        ViewInteraction email = onView( withId( R.id.email ) );
        email.check( matches( isDisplayed() ) );
        ViewInteraction password = onView( withId( R.id.password ) );
        password.check( matches( isDisplayed() ) );
        ViewInteraction c_password =  onView( withId( R.id.confirmpassword ) );
        c_password.check( matches( isDisplayed() ) );
        ViewInteraction phone_no = onView( withId( R.id.phonenumber ) );
        phone_no.check( matches( isDisplayed() ) );
        ViewInteraction lecture = onView( withId( R.id.radiobutton) );
        lecture.check( matches( isDisplayed() ) );
        ViewInteraction student = onView( withId( R.id.radiobutton2 ) );
        student.check( matches( isDisplayed() ) );
        ViewInteraction submit = onView( withId( R.id.submit ) );
        submit.check( matches( isDisplayed() ) );

    }
}