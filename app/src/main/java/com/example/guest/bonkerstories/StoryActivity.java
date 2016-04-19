package com.example.guest.bonkerstories;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class StoryActivity extends AppCompatActivity {
    public static final String TAG = StoryActivity.class.getSimpleName();
    private TextView mStoryTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);

        mStoryTextView = (TextView) findViewById(R.id.storyTextView);

        Intent intent = getIntent();
        String noun1 = intent.getStringExtra("noun1");
        String place1 = intent.getStringExtra("place1");
        String pluralNoun1 = intent.getStringExtra("pluralNoun1");
        String adj1 = intent.getStringExtra("adj1");
        String noun2 = intent.getStringExtra("noun2");
        String pastVerb1 = intent.getStringExtra("pastVerb1");
        String holiday1 = intent.getStringExtra("holiday1");
        mStoryTextView.setText("A long time ago, before the time of the " + noun1 + ", the " + place1 + " was ruled by " + pluralNoun1 + ". " + pluralNoun1 + " were " + adj1 + " beings, but one " + noun2 + " changed everything. The " + noun2 + " " + pastVerb1 + " the " + pluralNoun1 + " and took over the " + place1 + ". That is why we now celebrate " + holiday1 + ". ");
    }
}
