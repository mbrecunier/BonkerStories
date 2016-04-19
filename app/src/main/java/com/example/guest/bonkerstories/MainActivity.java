package com.example.guest.bonkerstories;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button mSubmitButton;
    public static final String TAG = MainActivity.class.getSimpleName();
    private EditText mNoun1EditText;
    private EditText mPlace1EditText;
    private EditText mPluralNoun1EditText;
    private EditText mAdj1EditText;
    private EditText mNoun2EditText;
    private EditText mPastVerb1EditText;
    private EditText mHoliday1EditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNoun1EditText = (EditText) findViewById(R.id.noun1EditText);
        mPlace1EditText = (EditText) findViewById(R.id.place1EditText);
        mPluralNoun1EditText = (EditText) findViewById(R.id.pluralNoun1EditText);
        mAdj1EditText = (EditText) findViewById(R.id.adj1EditText);
        mNoun2EditText = (EditText) findViewById(R.id.noun2EditText);
        mPastVerb1EditText = (EditText) findViewById(R.id.pastVerb1EditText);
        mHoliday1EditText = (EditText) findViewById(R.id.holiday1EditText);

        mSubmitButton = (Button) findViewById(R.id.submitButton);
            mSubmitButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String noun1 = mNoun1EditText.getText().toString();
                    String place1 = mPlace1EditText.getText().toString();
                    String pluralNoun1 = mPluralNoun1EditText.getText().toString();
                    String adj1 = mAdj1EditText.getText().toString();
                    String noun2 = mNoun2EditText.getText().toString();
                    String pastVerb1 = mPastVerb1EditText.getText().toString();
                    String holiday1 = mHoliday1EditText.getText().toString();
                    Log.d(TAG, noun1 + place1 + pluralNoun1 + adj1 + noun2 + pastVerb1 + holiday1);
                    Intent intent = new Intent(MainActivity.this, StoryActivity.class);
                    intent.putExtra("noun1", noun1);
                    intent.putExtra("place1", place1);
                    intent.putExtra("pluralNoun1", pluralNoun1);
                    intent.putExtra("adj1", adj1);
                    intent.putExtra("noun2", noun2);
                    intent.putExtra("pastVerb1", pastVerb1);
                    intent.putExtra("holiday1", holiday1);
                    startActivity(intent);
                }
            });
    }
}
