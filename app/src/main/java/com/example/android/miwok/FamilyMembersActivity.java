package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyMembersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //create new array list object
        ArrayList<Word> words = new ArrayList<>();
        //add word objects to array list
        words.add(new Word("father", "әpә"));
        words.add(new Word("mother","әṭa"));
        words.add(new Word("son","angsi"));
        words.add(new Word("daughter","tune"));
        words.add(new Word("older brother", "taachi"));
        words.add(new Word("younger brother", "chalitti"));
        words.add(new Word("older sister", "teṭe"));
        words.add(new Word("younger sister", "kolliti"));
        words.add(new Word("grandmother", "ama"));
        words.add(new Word("grandfather", "paapa"));
        //finds the list view in the view hierarchy
        ListView rootView = findViewById(R.id.list);
        //creates an word adapter object to iterate through the array list and set each item to a layout holding two text views
        WordAdapter wordAdapter = new WordAdapter(this, words);
        //set the word adapter object to the list view
        rootView.setAdapter(wordAdapter);
    }
}
