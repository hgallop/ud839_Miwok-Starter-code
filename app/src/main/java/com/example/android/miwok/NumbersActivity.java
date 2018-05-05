package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        //create new arry list object
        ArrayList<String> words = new ArrayList<>();
        //add english words to array list
        words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");
        words.add("six");
        words.add("seven");
        words.add("eight");
        words.add("nine");
        words.add("ten");
        //finds the linear layout in the view hierarchy
        LinearLayout rootView = findViewById(R.id.rootView);
        //creates a new text view
        TextView wordView = new TextView(this);
        //sets text of the text view to the contents of the array list at index 0
        wordView.setText(words.get(0));
        //adds text view to the linear layout
        rootView.addView(wordView);
        //creates a new text view
        TextView wordView2 = new TextView(this);
        //sets text of the text view to the contents of the array list at index 1
        wordView2.setText(words.get(1));
        //adds text view to the linear layout
        rootView.addView(wordView2);
        //creates a new text view
        TextView wordView3 = new TextView(this);
        //sets text of the text view to the contents of the array list at index 2
        wordView3.setText(words.get(2));
        //adds text view to the linear layout
        rootView.addView(wordView3);
    }
}
