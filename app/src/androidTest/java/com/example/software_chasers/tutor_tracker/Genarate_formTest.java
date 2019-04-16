package com.example.software_chasers.tutor_tracker;

import android.view.View;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import androidx.test.rule.ActivityTestRule;

import static org.junit.Assert.*;

public class Genarate_formTest {

    @Rule
    public ActivityTestRule<Genarate_form> genarate_formActivityTestRule = new ActivityTestRule<Genarate_form>(Genarate_form.class);
    public Genarate_form genarate_form = null;

    @Before
    public void setUp() throws Exception {
        genarate_form = genarate_formActivityTestRule.getActivity();
    }

    @Test
    public void genarateformLaunched()
    {
        View view = genarate_form.findViewById(R.id.textView2);
        assertNotNull(view);
    }

    @After
    public void tearDown() throws Exception {
        genarate_form = null;
    }
}