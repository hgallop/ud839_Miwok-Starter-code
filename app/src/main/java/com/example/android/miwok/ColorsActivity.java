package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //create new array list object
        ArrayList<Word> words = new ArrayList<>();
        //add word objects to array list
        words.add(new Word("red", "weṭeṭṭi", R.drawable.color_red));
        words.add(new Word("green","chokokki", R.drawable.color_green));
        words.add(new Word("brown","ṭakaakki", R.drawable.color_brown));
        words.add(new Word("gray","ṭopoppi", R.drawable.color_gray));
        words.add(new Word("black", "kululli", R.drawable.color_black));
        words.add(new Word("white", "kelelli", R.drawable.color_white));
        words.add(new Word("dusty yellow", "ṭopiisә", R.drawable.color_dusty_yellow));
        words.add(new Word("mustard yellow", "chiwiiṭә", R.drawable.color_mustard_yellow));
        //finds the list view in the view hierarchy
        ListView rootView = findViewById(R.id.list);
        //creates an word adapter object to iterate through the array list and set each item to a layout holding two text views
        WordAdapter wordAdapter = new WordAdapter(this, words, R.color.category_colors);
        //set the word adapter object to the list view
        rootView.setAdapter(wordAdapter);
    }
}
