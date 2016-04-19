package com.example.guest.bonkerstories;

import android.support.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by Guest on 4/19/16.
 */
public class MainActivityInstrumentationTest {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void validateEditText() {
        onView(withId(R.id.noun1EditText)).perform(typeText("cheese")).check(matches(withText("cheese")));
    }

    @Test
    public void wordsAreSentToStoryActivity() throws InterruptedException {
        String noun1 = "candy";
        String place1 = "field of gold";
        String pluralNoun1 = "apples";
        String adj1 = "purpley and oniony";
        String noun2 = "sauce";
        String pastVerb1 = "punched";
        String holiday1 = "that time when your 5 year old sister reminded you to brush your teeth";
        onView(withId(R.id.noun1EditText)).perform(typeText(noun1), closeSoftKeyboard());
        Thread.sleep(50);
        onView(withId(R.id.place1EditText)).perform(typeText(place1), closeSoftKeyboard());
        Thread.sleep(50);
        onView(withId(R.id.pluralNoun1EditText)).perform(typeText(pluralNoun1), closeSoftKeyboard());
        Thread.sleep(50);
        onView(withId(R.id.adj1EditText)).perform(typeText(adj1), closeSoftKeyboard());
        Thread.sleep(50);
        onView(withId(R.id.noun2EditText)).perform(typeText(noun2), closeSoftKeyboard());
        Thread.sleep(50);
        onView(withId(R.id.pastVerb1EditText)).perform(typeText(pastVerb1), closeSoftKeyboard());
        Thread.sleep(50);
        onView(withId(R.id.holiday1EditText)).perform(typeText(holiday1), closeSoftKeyboard());
        Thread.sleep(50);
        onView(withId(R.id.submitButton)).perform(click());
        onView(withId(R.id.storyTextView)).check(matches(withText("A long time ago, before the time of the " + noun1 + ", the " + place1 + " was ruled by " + pluralNoun1 + ". " + pluralNoun1 + " were " + adj1 + " beings, but one " + noun2 + " changed everything. The " + noun2 + " " + pastVerb1 + " the " + pluralNoun1 + " and took over the " + place1 + ". That is why we now celebrate " + holiday1 + ". ")));

    }


}