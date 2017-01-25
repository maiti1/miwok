package com.example.android.miwok;

/**
 * Created by Admin on 2017/01/19.
 */

public class word {

    //state of the class
    private String mDefaultTransalation;
    private String mMiwokTranslation;
    private int mResourceID = NO_IMAGE;
    private static  final int NO_IMAGE = -1;

    //constructor of the class
    public word(String defaultTranslation,String miwokTranslation)
    {
        mDefaultTransalation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    public word(String defaultTranslation,String miwokTranslation,int resourceId)
    {
        mDefaultTransalation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mResourceID = resourceId;
    }



    //methods of the class

    //return the default translation
    public String getDefaultTransalation()
    {
        return mDefaultTransalation;
    }

    //return the miwok translation
    public String getMiwokTranslation()
    {
        return mMiwokTranslation;
    }

    //show the image
    public int getmResourceID()
    {
        return  mResourceID;
    }

    //boolean method to show wheather the is image or not
    public boolean hasImage()
    {
        return mResourceID != NO_IMAGE;
    }


}
