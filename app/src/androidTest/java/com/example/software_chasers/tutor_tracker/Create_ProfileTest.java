package com.example.software_chasers.tutor_tracker;

import android.view.View;
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

    @Rule
    public ActivityTestRule<Create_Profile> activityTestRule = new ActivityTestRule<>( Create_Profile.class );
    private Create_Profile create_profile = null;

    @Before
    public void setUp() throws Exception {
        create_profile = activityTestRule.getActivity();
    }

    @Test
    public void visibility(){
        View creat = create_profile.findViewById(R.id.creatprofile);
        assertNotNull(creat);
        View names = create_profile.findViewById(R.id.fname);
        assertNotNull(names);
        View lnames = create_profile.findViewById(R.id.lname);
        assertNotNull(lnames);
        View user = create_profile.findViewById(R.id.userid);
        assertNotNull(user);
        View emails = create_profile.findViewById(R.id.email);
        assertNotNull(emails);
        View passwords = create_profile.findViewById(R.id.password);
        assertNotNull(passwords);
        View cpassword = create_profile.findViewById(R.id.confirmpassword);
        assertNotNull(cpassword);
        View phonenumbers = create_profile.findViewById(R.id.phonenumber);
        assertNotNull(phonenumbers);
        View rbutton = create_profile.findViewById(R.id.radiobutton);
        assertNotNull(rbutton);
        View rbutton2 = create_profile.findViewById(R.id.radiobutton2);
        assertNotNull(rbutton2);
        View submits = create_profile.findViewById(R.id.submit);
        assertNotNull(submits);

//        ViewInteraction text = onView(withId(R.id.creatprofile));
//        text.check( matches(isDisplayed()) );
//        ViewInteraction Fnames = onView( withId(R.id.fname ) );
//        Fnames.check( matches( isDisplayed() ) );
//        ViewInteraction Lnames = onView( withId( R.id.lname ) );
//        Lnames.check( matches( isDisplayed() ) );
//        ViewInteraction userid = onView( withId( R.id.userid ) );
//        userid.check( matches( isDisplayed() ) );
//        ViewInteraction email = onView( withId( R.id.email ) );
//        email.check( matches( isDisplayed() ) );
//        ViewInteraction password = onView( withId( R.id.password ) );
//        password.check( matches( isDisplayed() ) );
//        ViewInteraction c_password =  onView( withId( R.id.confirmpassword ) );
//        c_password.check( matches( isDisplayed() ) );
//        ViewInteraction phone_no = onView( withId( R.id.phonenumber ) );
//        phone_no.check( matches( isDisplayed() ) );
//        ViewInteraction lecture = onView( withId( R.id.radiobutton) );
//        lecture.check( matches( isDisplayed() ) );
//        ViewInteraction student = onView( withId( R.id.radiobutton2 ) );
//        student.check( matches( isDisplayed() ) );
//        ViewInteraction submit = onView( withId( R.id.submit ) );
//        submit.check( matches( isDisplayed() ) );

    }

    @After
    public void tearDown() throws Exception {
        create_profile = null;
    }



}