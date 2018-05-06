package com.example.android.miwok;

//class that create objects to hold two translations for a single word

public class Word {

    //variables for miwok and default words
    private String mMiwokTranslation;
    private String mDefaultTranslation;

    //constructor for the object
    Word(String miwok, String def) {
        mMiwokTranslation = miwok;
        mDefaultTranslation = def;
    }

    //getter method for miwok word
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    //getter method for default word
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }
}
