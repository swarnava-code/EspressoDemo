package com.example.testapplication.tests;

import androidx.test.ext.junit.rules.ActivityScenarioRule;

import com.example.testapplication.AdapterViewActivity;
import com.example.testapplication.screenpages.AdapterViewScreenView;

import org.junit.Rule;
import org.junit.Test;

public class AdapterViewTest {
    AdapterViewScreenView screenView = new AdapterViewScreenView();

    @Rule
    public ActivityScenarioRule<AdapterViewActivity> rule = new ActivityScenarioRule<>(AdapterViewActivity.class);

    @Test
    public void elementNotDisplayed(){
        screenView.elementNotDisplayed();
    }

    @Test
    public void clickLastElementXTHL(){
        screenView.clickLastElementXTHL();
    }

    @Test
    public void clickElementAddA(){
        screenView.clickElementAddA();
    }

    @Test
    public void test(){
        screenView.test();
    }

}
