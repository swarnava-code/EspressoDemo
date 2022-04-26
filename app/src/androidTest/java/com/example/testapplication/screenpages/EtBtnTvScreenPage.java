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
    String myName = "Swarnava Chakraborty";
    String myEmail = "swarnava@github.com";
    String myPhone = "1111111111";
    String myAddress = "A1, R.nagar, Kol-18";

    public void submitEtBtnTvScreenPage(){
        onView(withId(viewInteraction.getNameId())).perform(typeText(myName));
        closeSoftKeyboard();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        onView(withId(viewInteraction.getEmailId())).perform(typeText(myEmail));
        closeSoftKeyboard();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        onView(withId(viewInteraction.getPhoneId())).perform(typeText(myPhone));
        closeSoftKeyboard();
        onView(withId(viewInteraction.getAddressId())).perform(typeText(myAddress));
        closeSoftKeyboard();
        onView(withId(viewInteraction.getNameId())).check(matches(withText(myName)));
        onView(withId(viewInteraction.getEmailId())).check(matches(withText(myEmail)));
        onView(withId(viewInteraction.getPhoneId())).check(matches(withText(myPhone)));
        onView(withId(viewInteraction.getAddressId())).check(matches(withText(myAddress)));
        onView(withText(viewInteraction.getSubmitBtnTxt())).perform(click());
        onView(withId(viewInteraction.getStatusId())).check(matches(withText("submitted")));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
