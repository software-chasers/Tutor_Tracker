package com.example.software_chasers.tutor_tracker;

import android.view.View;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.experimental.theories.Theory;

import androidx.test.rule.ActivityTestRule;

import static org.junit.Assert.*;

public class View_profileTest {

    @Rule
    public ActivityTestRule<View_profile> activityTestRule = new ActivityTestRule<>( View_profile.class );
    private View_profile view_profile = null;

    @Before
    public void setUp() throws Exception {
        view_profile = activityTestRule.getActivity();
    }

    @Test
    public void view_profileLaunched(){
        View image = view_profile.findViewById( R.id.imageView2 );
        assertNotNull( image );
        View text = view_profile.findViewById( R.id.textView3 );
        assertNotNull( text );
        View text1 = view_profile.findViewById( R.id.textView4 );
        assertNotNull( text1 );
        View text2 = view_profile.findViewById( R.id.textView5 );
        assertNotNull( text2 );
        View text3 = view_profile.findViewById( R.id.textView8 );
        assertNotNull( text3 );
        View text4 = view_profile.findViewById( R.id.textView11 );
        assertNotNull( text4 );
    }

    @After
    public void tearDown() throws Exception {
        view_profile = null;
    }
}