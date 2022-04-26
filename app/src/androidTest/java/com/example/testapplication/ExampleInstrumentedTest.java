package com.example.testapplication;

import static androidx.test.espresso.Espresso.closeSoftKeyboard;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import android.content.Context;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    private MainActivity mainActivity;

    @Before
    public void setup() {
        mainActivity = mActivityTestRule.getActivity();
    }

    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        assertEquals("com.example.testapplication", appContext.getPackageName());
    }

    @Test
    public void testEditText(){

        onView(withId(R.id.name)).perform(typeText("Swarnava"));
        closeSoftKeyboard();
        onView(withId(R.id.email)).perform(typeText("swarnava@gmail.com"));
        closeSoftKeyboard();
        onView(withId(R.id.phone)).perform(typeText("8697458785"));
        closeSoftKeyboard();
        onView(withId(R.id.address)).perform(typeText("A1, R nagar kol-18"));
        closeSoftKeyboard();
        onView(withId(R.id.name)).check(matches(withText("Swarnava")));
        onView(withId(R.id.email)).check(matches(withText("swarnava@gmail.com")));
        onView(withId(R.id.phone)).check(matches(withText("8697458785")));
        onView(withId(R.id.address)).check(matches(withText("A1, R nagar kol-18")));

        onView(withText("Submit")).perform(click());
        onView(withId(R.id.statusTV)).check(matches(withText("submitted")));

    }

}