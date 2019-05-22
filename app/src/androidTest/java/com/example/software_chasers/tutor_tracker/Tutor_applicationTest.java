package com.example.software_chasers.tutor_tracker;

import android.view.View;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import androidx.test.rule.ActivityTestRule;

import static org.junit.Assert.*;

public class Tutor_applicationTest {
    @Rule
    public ActivityTestRule<Tutor_application> activityTestRule = new ActivityTestRule<Tutor_application>(Tutor_application.class);
    private Tutor_application tutor_application = null;

    @Before
    public void setUp() throws Exception {
        tutor_application = activityTestRule.getActivity();
    }

    @Test
    public void LaunchingTutorApplication()
    {
        View view = tutor_application.findViewById(R.id.PDF_Name_EditText_ID);
        assertNotNull(view);
        View view1 = tutor_application.findViewById(R.id.textView10);
        assertNotNull(view1);
        View view2 = tutor_application.findViewById(R.id.checkBox3);
        assertNotNull(view2);
        View view3 = tutor_application.findViewById(R.id.checkBox4);
        assertNotNull(view3);
        View view4 = tutor_application.findViewById(R.id.checkBox5);
        assertNotNull(view4);
        View view5 = tutor_application.findViewById(R.id.checkBox6);
        assertNotNull(view5);
        View view6 = tutor_application.findViewById(R.id.checkBox7);
        assertNotNull(view6);
        View view7 = tutor_application.findViewById(R.id.checkBox8);
        assertNotNull(view7);
        View view8 = tutor_application.findViewById(R.id.checkBox9);
        assertNotNull(view8);
        View view9 = tutor_application.findViewById(R.id.checkBox10);
        assertNotNull(view9);
        View view0 = tutor_application.findViewById(R.id.checkBox11);
        assertNotNull(view0);
        View viewa = tutor_application.findViewById(R.id.checkBox12);
        assertNotNull(viewa);
        View viewb = tutor_application.findViewById(R.id.checkBox13);
        assertNotNull(viewb);
        View viewc = tutor_application.findViewById(R.id.checkBox14);
        assertNotNull(viewc);
        View viewd = tutor_application.findViewById(R.id.checkBox15);
        assertNotNull(viewd);
        View viewe = tutor_application.findViewById(R.id.checkBox16);
        assertNotNull(viewe);
        View viewf = tutor_application.findViewById(R.id.checkBox17);
        assertNotNull(viewf);
        View viewg = tutor_application.findViewById(R.id.checkBox18);
        assertNotNull(viewg);
        View viewh = tutor_application.findViewById(R.id.editText);
        assertNotNull(viewh);
        View viewi = tutor_application.findViewById(R.id.Button_Select_PDF_ID);
        assertNotNull(viewi);
        View viewj = tutor_application.findViewById(R.id.Button_Upload_PDF_ID);
        assertNotNull(viewj);
        View viewk = tutor_application.findViewById(R.id.button2);
        assertNotNull(viewk);
    }

    @After
    public void tearDown() throws Exception {
        tutor_application = null;
    }
}