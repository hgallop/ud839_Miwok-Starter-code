package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //create new array list object
        ArrayList<Word> words = new ArrayList<>();
        //add word objects to array list
        words.add(new Word("Where are you going?", "minto wuksus"));
        words.add(new Word("What is your name?","tinnә oyaase'nә"));
        words.add(new Word("My name is...","oyaaset..."));
        words.add(new Word("How are you feeling?","michәksәs?"));
        words.add(new Word("I'm feeling good.", "kuchi achit"));
        words.add(new Word("are you coming?", "әәnәs'aa?"));
        words.add(new Word("Yes, I'm coming.", "hәә’ әәnәm"));
        words.add(new Word("I'm coming.", "әәnәm"));
        words.add(new Word("Let's go", "yoowutis"));
        words.add(new Word("Come here.", "әnni'nem"));
        //finds the list view in the view hierarchy
        ListView rootView = findViewById(R.id.list);
        //creates an word adapter object to iterate through the array list and set each item to a layout holding two text views
        WordAdapter wordAdapter = new WordAdapter(this, words);
        //set the word adapter object to the list view
        rootView.setAdapter(wordAdapter);
    }
}
