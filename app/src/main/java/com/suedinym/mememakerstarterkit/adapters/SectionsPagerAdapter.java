package com.suedinym.mememakerstarterkit.adapters;


import android.support.v4.app.FragmentPagerAdapter;


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
        if (position == 0) {
            return "Images";
        } else {
            return "Memes";
        }
    }

    @Override
    public int getCount() {
        return 2;
    }


}