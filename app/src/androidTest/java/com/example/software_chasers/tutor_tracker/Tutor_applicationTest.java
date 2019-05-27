//package com.example.software_chasers.tutor_tracker;
//
//import android.view.View;
//
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Rule;
//import org.junit.Test;
//
//import androidx.test.rule.ActivityTestRule;
//
//import static org.junit.Assert.*;
//
//public class Tutor_applicationTest {
//    @Rule
//    public ActivityTestRule<Tutor_application> activityTestRule = new ActivityTestRule<Tutor_application>(Tutor_application.class);
//    private Tutor_application tutor_application = null;
//
//    @Before
//    public void setUp() throws Exception {
//        tutor_application = activityTestRule.getActivity();
//    }
//
//    @Test
//    public void LaunchingTutorApplication()
//    {
//        View view = tutor_application.findViewById(R.id.PDF_Name_EditText_ID);
//        assertNotNull(view);
//        View view1 = tutor_application.findViewById(R.id.textView10);
//        assertNotNull(view1);
//        View view2 = tutor_application.findViewById(R.id.COMS1015);
//        assertNotNull(view2);
//        View view3 = tutor_application.findViewById(R.id.COMS3003);
//        assertNotNull(view3);
//        View view4 = tutor_application.findViewById(R.id.COMS1016);
//        assertNotNull(view4);
//        View view5 = tutor_application.findViewById(R.id.COMS3005);
//        assertNotNull(view5);
//        View view6 = tutor_application.findViewById(R.id.COMS3006);
//        assertNotNull(view6);
//        View view7 = tutor_application.findViewById(R.id.COMS1017);
//        assertNotNull(view7);
//        View view8 = tutor_application.findViewById(R.id.COMS2002);
//        assertNotNull(view8);
//        View view9 = tutor_application.findViewById(R.id.COMS3007);
//        assertNotNull(view9);
//        View view0 = tutor_application.findViewById(R.id.COMS1018);
//        assertNotNull(view0);
//        View viewa = tutor_application.findViewById(R.id.COMS3008);
//        assertNotNull(viewa);
//        View viewb = tutor_application.findViewById(R.id.COMS2014);
//        assertNotNull(viewb);
//        View viewc = tutor_application.findViewById(R.id.COMS3009);
//        assertNotNull(viewc);
//        View viewd = tutor_application.findViewById(R.id.COMS2013);
//        assertNotNull(viewd);
//        View viewe = tutor_application.findViewById(R.id.COMS3010);
//        assertNotNull(viewe);
//        View viewf = tutor_application.findViewById(R.id.COMS2015);
//        assertNotNull(viewf);
//        View viewg = tutor_application.findViewById(R.id.COMS3011);
//        assertNotNull(viewg);
//        View viewh = tutor_application.findViewById(R.id.editText);
//        assertNotNull(viewh);
//        View viewi = tutor_application.findViewById(R.id.Button_Select_PDF_ID);
//        assertNotNull(viewi);
//        View viewj = tutor_application.findViewById(R.id.Button_Upload_PDF_ID);
//        assertNotNull(viewj);
//        View viewk = tutor_application.findViewById(R.id.button2);
//        assertNotNull(viewk);
//    }
//
//    @After
//    public void tearDown() throws Exception {
//        tutor_application = null;
//    }
//}