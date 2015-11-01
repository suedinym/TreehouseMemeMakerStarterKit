package com.suedinym.mememakerstarterkit.adapters;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


import com.suedinym.mememakerstarterkit.R;
import com.suedinym.mememakerstarterkit.ui.activities.MainActivity;
import com.suedinym.mememakerstarterkit.ui.fragments.ImageGridFragment;
import com.suedinym.mememakerstarterkit.ui.fragments.MemeItemFragment;

/**
 * Created by sue on 10/25/15.
 */


public class SectionsPagerAdapter extends FragmentPagerAdapter {
    //below is in original starter kit code, but AS doesn't like it sj
   // Context mContext;

    public SectionsPagerAdapter(android.support.v4.app.FragmentManager fm) {
        super(fm);
        //below is in original starter kit code, but AS doesn't like it sj
     // mContext = context;
    }

/*    @Override
    public android.support.v4.app.Fragment getItem(int position) {
        Fragment fragment;
        if(position == 0) {
            fragment = new ImageGridFragment();
        } else {
            fragment = new MemeItemFragment();
        }
        return fragment;
    }*/

    public android.support.v4.app.Fragment getItem(int position) {

        switch (position) {
            case 0:

                ImageGridFragment tab1 = new ImageGridFragment();
                return tab1;

            case 1:
                MemeItemFragment tab2 = new MemeItemFragment();
                return tab2;
            default:
                return null;


        }
    }
/*In the original starter kit, the code below is extracted to strings
    but every time I have tried extracting it to strings, it returns a
    null pointer exception. The other notes with regard to the
    context are part of this.*/
    @Override
    public CharSequence getPageTitle(int position) {
        if(position == 0) {
            return "Images";
        } else {
            return "Memes";
        }
    }

    @Override
    public int getCount() {
        return 2;
    }

  /*  @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        return MainActivity.PlaceholderFragment.newInstance(position + 1);
    }

    @Override
    public int getCount() {
            return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Images";
            case 1:
                return "Memes";

        }
        return null;
    }*/
}