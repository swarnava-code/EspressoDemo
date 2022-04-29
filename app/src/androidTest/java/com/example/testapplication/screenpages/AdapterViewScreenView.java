package com.example.testapplication.screenpages;

import static androidx.test.espresso.Espresso.onData;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.doesNotExist;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.hamcrest.Matchers.hasToString;

import androidx.test.espresso.contrib.RecyclerViewActions;

import com.example.testapplication.R;

import java.util.regex.Matcher;

public class AdapterViewScreenView {

    public void elementNotDisplayed(){
        onView(withText("XTHL")).check(doesNotExist());
    }

    public void clickLastElementXTHL(){
        onData(hasToString(startsWith("XTHL")))
                .inAdapterView(withId(R.id.lvItems))
                .perform(click());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void clickElementAddA(){
        onData(hasToString(startsWith("ADD A")))
                .inAdapterView(withId(R.id.lvItems))
                .perform(click());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void test(){
        onView(withId(R.id.lvItems)).perform(RecyclerViewActions.actionOnItemAtPosition(5, click()));
        onView(withText("")).check(matches(isDisplayed()));

    }

}
