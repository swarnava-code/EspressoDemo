package com.example.testapplication.screenpages;

import static androidx.test.espresso.Espresso.closeSoftKeyboard;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import com.example.testapplication.viewinteractions.EtBtnTvViewInteraction;

public class EtBtnTvScreenPage {
    EtBtnTvViewInteraction viewInteraction = new EtBtnTvViewInteraction();
    String name = "Swarna";

    public void submitEtBtnTvScreenPage(){
        onView(withId(viewInteraction.getNameId())).perform(typeText(name));
        closeSoftKeyboard();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        onView(withId(viewInteraction.getEmailId())).perform(typeText("swarnava@gmail.com"));
        closeSoftKeyboard();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        onView(withId(viewInteraction.getPhoneId())).perform(typeText("8697458785"));
        closeSoftKeyboard();
        onView(withId(viewInteraction.getAddressId())).perform(typeText("A1, R nagar kol-18"));
        closeSoftKeyboard();
        onView(withId(viewInteraction.getNameId())).check(matches(withText(name)));
        onView(withId(viewInteraction.getEmailId())).check(matches(withText("swarnava@gmail.com")));
        onView(withId(viewInteraction.getPhoneId())).check(matches(withText("8697458785")));
        onView(withId(viewInteraction.getAddressId())).check(matches(withText("A1, R nagar kol-18")));
        onView(withText(viewInteraction.getSubmitBtnTxt())).perform(click());
        onView(withId(viewInteraction.getStatusId())).check(matches(withText("submitted")));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
