package com.example.godeep.Adapter;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.godeep.Fragment.Notify2Frag;
import com.example.godeep.Fragment.RequestFrag;

public class ViewPageAdapter extends FragmentPagerAdapter {
    public ViewPageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: return new Notify2Frag();
            case 1: return new RequestFrag();
            default: return new Notify2Frag();

        }
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        String title = null;
        if (position == 0){
            title = "NOTIFICATION";
        }else if (position == 1){
            title = "REQUEST";
        }

        return title;
    }
}
