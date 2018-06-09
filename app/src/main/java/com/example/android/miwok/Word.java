package com.example.android.miwok;

//class that create objects to hold two translations for a single word

public class Word {

    private static final int NO_IMAGE_PROVIDED = -1;

    //variables for miwok and default words
    private String mMiwokTranslation;
    private String mDefaultTranslation;
    private int mAudio;
    private int mListImage = NO_IMAGE_PROVIDED;

    //constructor for the object
    Word(String def, String miwok, int audio) {
        mMiwokTranslation = miwok;
        mDefaultTranslation = def;
        mAudio = audio;
    }

    //constructor for the object
    Word(String def, String miwok, int image, int audio) {
        mMiwokTranslation = miwok;
        mDefaultTranslation = def;
        mListImage = image;
        mAudio = audio;
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

    public int getAudio() {
        return mAudio;
    }

    public boolean hasImage() {
        return mListImage != NO_IMAGE_PROVIDED;
    }
}
