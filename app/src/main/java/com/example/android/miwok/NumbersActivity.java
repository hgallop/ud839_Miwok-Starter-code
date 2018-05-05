package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        String [] numbers = new String[10];
        numbers[0] = "one";
        numbers[1] = "two";
        numbers[2] = "three";
        numbers[3] = "four";
        numbers[4] = "five";
        numbers[5] = "six";
        numbers[6] = "seven";
        numbers[7] = "eight";
        numbers[8] = "nine";
        numbers[9] = "ten";
        //alternate array declaration
        //String [] numbers2 = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};

    }
}
