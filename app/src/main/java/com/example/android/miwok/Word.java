package com.example.android.miwok;

//class that create objects to hold two translations for a single word

public class Word {

    //variables for miwok and default words
    private String mMiwokTranslation;
    private String mDefaultTranslation;
    private int mListImage;

    //constructor for the object
    Word(String def, String miwok) {
        mMiwokTranslation = miwok;
        mDefaultTranslation = def;
    }

    //constructor for the object
    Word(String def, String miwok, int image) {
        mMiwokTranslation = miwok;
        mDefaultTranslation = def;
        mListImage = image;
    }

    //getter method for miwok word
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    //getter method for default word
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public int getListImage() {
        return mListImage;
    }
}
