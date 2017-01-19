package com.example.android.learnmarathi;

/**
 * Created by Tapan on 11/22/2016.
 */

public class Word{

    private String mMarathiTranslation;

    private String mDefaultTranslation;

    private int mNumberImages=NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED=-1;

    private int mAudioManager;


    public Word(String marathi, String english, int image, int audioManager){
        mMarathiTranslation=marathi;

        mDefaultTranslation=english;

        mNumberImages=image;

        mAudioManager=audioManager;

    }
    public Word(String marathi,String english,int audioManager){
        mMarathiTranslation=marathi;

        mDefaultTranslation=english;

        mAudioManager=audioManager;

    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMarathiTranslation() {
        return mMarathiTranslation;
    }

    public int getNumberImages() {
        return mNumberImages;
    }

    public int getAudioManager() {return mAudioManager;}
    public boolean hasImage(){
        return mNumberImages!=NO_IMAGE_PROVIDED;
    }

}
