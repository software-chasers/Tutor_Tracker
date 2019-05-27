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
//public class QR_CodeTest {
//
//    @Rule
//    public ActivityTestRule<QR_Code> activityTestRule = new ActivityTestRule<QR_Code>(QR_Code.class);
//    private QR_Code qr_code = null;
//
//    @Before
//    public void setUp() throws Exception {
//        qr_code = activityTestRule.getActivity();
//    }
//
//    @Test
//    public void qrCodeLaunched()
//    {
//        View view = qr_code.findViewById(R.id.etqr);
//        assertNotNull(view);
//        View views = qr_code.findViewById(R.id.btn);
//        assertNotNull(views);
//        View views1 = qr_code.findViewById(R.id.imag);
//        assertNotNull(views1);
//        View views2 = qr_code.findViewById(R.id.progressBar);
//        assertNotNull(views2);
//    }
//
//    @After
//    public void tearDown() throws Exception {
//        qr_code = null;
//    }
//}