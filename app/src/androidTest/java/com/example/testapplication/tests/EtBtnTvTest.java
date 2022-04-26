package com.example.testapplication.tests;

import static org.junit.Assert.assertEquals;
import android.content.Context;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.rule.ActivityTestRule;
import com.example.testapplication.EditTextButtonTextViewActivity;
import com.example.testapplication.screenpages.EtBtnTvScreenPage;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class EtBtnTvTest {

    @Rule
    public ActivityTestRule<EditTextButtonTextViewActivity> mActivityTestRule = new ActivityTestRule<>(EditTextButtonTextViewActivity.class);

    private EditTextButtonTextViewActivity targetActivity;

    @Before
    public void setup() {
        targetActivity = mActivityTestRule.getActivity();
    }

    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        assertEquals("com.example.testapplication", appContext.getPackageName());
    }

    @Test
    public void testEditText(){
        EtBtnTvScreenPage etBtnTvScreenPage = new EtBtnTvScreenPage();
        etBtnTvScreenPage.submitEtBtnTvScreenPage();
    }

}
