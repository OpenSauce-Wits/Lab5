package com.example.lab_5;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static androidx.test.platform.app.InstrumentationRegistry.getInstrumentation;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void checkGetButton () throws InterruptedException {

        onView(withId(R.id.getButton)).perform(click());
        Thread.sleep(1500);
        onView(withId(R.id.txtMsg)).check(matches(withText("Hello from pravesh")));
    }

    @Test
    public void checkPostButton () throws InterruptedException {

        onView(withId(R.id.postButton)).perform(click());
        Thread.sleep(1500);
        onView(withId(R.id.txtMsg)).check(matches(withText("Your username is pravesh")));
    }

}
