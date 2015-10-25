package com.suedinym.mememakerstarterkit;

import com.suedinym.mememakerstarterkit.utils.FileUtilities;

/**
 * Created by Evan Anger on 7/28/14. modified by Sue Jensen 10/25/2015
 * Because who doesn't need wonka and philosoraptor?
 * */
public class MemeMakerApplication extends android.app.Application {
    @Override
    public void onCreate() {
        super.onCreate();

        FileUtilities.saveAssetImage(this, "dogmess.jpg");
        FileUtilities.saveAssetImage(this, "excitedcat.jpg");
        FileUtilities.saveAssetImage(this, "guiltypup.jpg");
        FileUtilities.saveAssetImage(this, "philosoraptor.jpg");
        FileUtilities.saveAssetImage(this, "wonka.jpg");
    }
}

