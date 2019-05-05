package com.example.software_chasers.tutor_tracker;

import android.view.View;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import androidx.test.rule.ActivityTestRule;

import static org.junit.Assert.*;

public class AddAssessmentTest {

    @Rule
    public ActivityTestRule<AddAssessment> addAssessmentActivityTestRule = new ActivityTestRule<>( AddAssessment.class );
    private AddAssessment addAssessment = null;

    @Before
    public void setUp() throws Exception {
        addAssessment = addAssessmentActivityTestRule.getActivity();
    }

    @Test
    public void AddAssessmentLaunched(){

        View text = addAssessment.findViewById( R.id.course );
        assertNotNull( text );
        View text1 = addAssessment.findViewById( R.id.in_date );
        assertNotNull( text1 );
        View text2 = addAssessment.findViewById( R.id.in_time );
        assertNotNull( text2 );
        View text3 = addAssessment.findViewById( R.id.duration );
        assertNotNull( text3 );
        View button = addAssessment.findViewById( R.id.btn_date);
        assertNotNull( button );
        View button1 = addAssessment.findViewById( R.id.btn_time);
        assertNotNull( button1);
        View button2 = addAssessment.findViewById( R.id.done);
        assertNotNull( button2);
    }
    @After
    public void tearDown() throws Exception {
        addAssessment = null;
    }
}