//package com.example.software_chasers.tutor_tracker;
//
//import android.view.View;
//
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Rule;
//import org.junit.Test;
//
//import androidx.test.espresso.ViewInteraction;
//import androidx.test.rule.ActivityTestRule;
//
//import static androidx.test.espresso.Espresso.onView;
//import static androidx.test.espresso.action.ViewActions.click;
//import static androidx.test.espresso.matcher.ViewMatchers.withId;
//import static org.junit.Assert.*;
//
//public class AdminHomePageTest {
//
//    @Rule
//    public ActivityTestRule<AdminHomePage> activityTestRule = new ActivityTestRule<>( AdminHomePage.class );
//    private AdminHomePage adminHomePage = null;
//
//    @Before
//    public void setUp() throws Exception {
//        adminHomePage = activityTestRule.getActivity();
//    }
//
//    @Test
//    public void AdminHomePageLaunched(){
//        View nav = adminHomePage.findViewById( R.id.nav_view );
//        assertNotNull( nav );
//        View im = adminHomePage.findViewById(R.id.textView);
//        assertNotNull(im);
//        View ic = adminHomePage.findViewById(R.id.textView15);
//        assertNotNull(ic);
//        View imrr = adminHomePage.findViewById(R.id.textView17);
//        assertNotNull(imrr);
//        View imww = adminHomePage.findViewById(R.id.textView18);
//        assertNotNull(imww);
//        View imaa = adminHomePage.findViewById(R.id.textView19);
//        assertNotNull(imaa);
//        View ima = adminHomePage.findViewById(R.id.textView20);
//        assertNotNull(ima);
//        View imxx = adminHomePage.findViewById(R.id.textView21);
//        assertNotNull(imxx);
//        View imx = adminHomePage.findViewById(R.id.textView22);
//        assertNotNull(imx);
//        View imss = adminHomePage.findViewById(R.id.textView23);
//        assertNotNull(imss);
//        View ims = adminHomePage.findViewById(R.id.textView24);
//        assertNotNull(ims);
//        View imyy = adminHomePage.findViewById(R.id.textView25);
//        assertNotNull(imyy);
//        View imy = adminHomePage.findViewById(R.id.textView26);
//        assertNotNull(imy);
//        View imhh = adminHomePage.findViewById(R.id.textView27);
//        assertNotNull(imhh);
//        View imgg = adminHomePage.findViewById(R.id.textView28);
//        assertNotNull(imgg);
//        View imvv = adminHomePage.findViewById(R.id.textView29);
//        assertNotNull(imvv);
//        View imv = adminHomePage.findViewById(R.id.textView30);
//        assertNotNull(imv);
//        View imff = adminHomePage.findViewById(R.id.textView31);
//        assertNotNull(imff);
//        View imdd = adminHomePage.findViewById(R.id.textView32);
//        assertNotNull(imdd);
//        View imzz = adminHomePage.findViewById(R.id.textView33);
//        assertNotNull(imzz);
//        View imz = adminHomePage.findViewById(R.id.textView34);
//        assertNotNull(imz);
//        View imf = adminHomePage.findViewById(R.id.textView35);
//        assertNotNull(imf);
//        View ime = adminHomePage.findViewById(R.id.textView36);
//        assertNotNull(ime);
//        View imc = adminHomePage.findViewById(R.id.textView37);
//        assertNotNull(imc);
//        View imn = adminHomePage.findViewById(R.id.textView38);
//        assertNotNull(imn);
//        View imb = adminHomePage.findViewById(R.id.textView39);
//        assertNotNull(imb);
//        View imh = adminHomePage.findViewById(R.id.textView40);
//        assertNotNull(imh);
//        View img = adminHomePage.findViewById(R.id.textView41);
//        assertNotNull(img);
//        View imt = adminHomePage.findViewById(R.id.textView42);
//        assertNotNull(imt);
//        View imi = adminHomePage.findViewById(R.id.textView43);
//        assertNotNull(imi);
//        View imu = adminHomePage.findViewById(R.id.textView44);
//        assertNotNull(imu);
//        View imk = adminHomePage.findViewById(R.id.textView45);
//        assertNotNull(imk);
//        View imj = adminHomePage.findViewById(R.id.textView46);
//        assertNotNull(imj);
//        View iml = adminHomePage.findViewById(R.id.textView47);
//        assertNotNull(iml);
//        View imq = adminHomePage.findViewById(R.id.textView48);
//        assertNotNull(imq);
//        View imqq = adminHomePage.findViewById(R.id.textView49);
//        assertNotNull(imqq);
//
//
//
//        //View text = adminHomePage.findViewById(R.id.textView15);
//        //assertNotNull(text);
//        //View adm = adminHomePage.findViewById(R.id.textView17);
//        //assertNotNull(adm);
//
//    }
//    /*@Test
//    public void presstest()
//    {
//        ViewInteraction view = onView(withId(R.id.nav_view));
//        view.perform(click());
//    }*/
//
//    @After
//    public void tearDown() throws Exception {
//        adminHomePage = null;
//    }
//}