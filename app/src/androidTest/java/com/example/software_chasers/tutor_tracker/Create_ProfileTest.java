package com.example.software_chasers.tutor_tracker;

import android.view.View;
import android.widget.Button;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import androidx.test.espresso.ViewInteraction;
import androidx.test.espresso.action.ViewActions;
import androidx.test.rule.ActivityTestRule;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
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
    public void Create_ProfileLaunched(){
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
    }

    @Test
    public void checkEmail(){
        assertFalse( create_profile.isValidEmail( null ) );
        assertFalse( create_profile.isValidEmail( "" ) );
        assertTrue(create_profile.isValidEmail( "1661233@students.wits.ac.za" )  );
    }

    @Test
    public void createUser()
    {
        ViewInteraction userid = onView( withId( R.id.fname ) );
        userid.perform( ViewActions.typeText( "Maccauley" ) ,closeSoftKeyboard());
        ViewInteraction Lname = onView( withId( R.id.lname ) );
        Lname.perform( ViewActions.typeText( "Marota" ) ,closeSoftKeyboard());
        ViewInteraction Userid = onView( withId( R.id.userid ) );
        Userid.perform( ViewActions.typeText( "123" ) ,closeSoftKeyboard());
        ViewInteraction Email = onView( withId( R.id.email ) );
        Email.perform( ViewActions.typeText( "maccauleymakgonye@gmail.com" ) ,closeSoftKeyboard());
        ViewInteraction Pass = onView( withId( R.id.password ) );
        Pass.perform( ViewActions.typeText( "mmmm" ) ,closeSoftKeyboard());
        ViewInteraction ConPass = onView( withId( R.id.confirmpassword ) );
        ConPass.perform( ViewActions.typeText( "mmmm" ) ,closeSoftKeyboard());
        ViewInteraction Phone = onView( withId( R.id.phonenumber ) );
        Phone.perform( ViewActions.typeText( "0794511580" ) ,closeSoftKeyboard());
        ViewInteraction Radiobutton = onView( withId( R.id.radiobutton ) );
        Radiobutton.perform( click() );
        ViewInteraction button = onView( withId( R.id.submit ) );
        button.perform( click() );
    }

    @After
    public void tearDown() throws Exception {
        create_profile = null;
    }

}