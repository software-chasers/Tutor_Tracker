package com.example.software_chasers.tutor_tracker;

import android.view.View;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import androidx.test.rule.ActivityTestRule;

import static org.junit.Assert.*;

public class Scan_QR_CodeTest {

    @Rule
    public ActivityTestRule<Scan_QR_Code> activityTestRule = new ActivityTestRule<>( Scan_QR_Code.class );
    private Scan_QR_Code scan_qr_code = null;

    @Before
    public void setUp() throws Exception {
        scan_qr_code = activityTestRule.getActivity();
    }

    @Test
    public void Scan_QR_CodeLaunched(){
        View results = scan_qr_code.findViewById( R.id.tvresult );
        assertNotNull( results );
        View button = scan_qr_code.findViewById( R.id.btn );
        assertNotNull( button );
        View image = scan_qr_code.findViewById( R.id.imageView3 );
        assertNotNull( image );
    }

    @After
    public void tearDown() throws Exception {
    }
}