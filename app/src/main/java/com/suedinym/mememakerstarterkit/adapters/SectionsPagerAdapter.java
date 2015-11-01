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
                return new ImageGridFragment();
            case 1:
                return new MemeItemFragment();
        }
        return null;
    }



    /*In the original starter kit, the code below is extracted to strings
        but every time I have tried extracting it to strings, it returns a
        null pointer exception. The other notes with regard to the
        context are part of this. I think the problem is choosing
        the correct context, so it's hard coded, but it works. sj*/
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