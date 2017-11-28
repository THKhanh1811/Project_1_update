package com.khanh.project;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by ASUS on 11/10/2017.
 */

public class Adapter_tablayout_Snack extends FragmentStatePagerAdapter {

    private String listTab[]={"French fries", "Pancake"};
    private Fragment_French_fries mFragment_French_fries;
    private Fragment_Pancake mFragment_Pancake;


    public Adapter_tablayout_Snack(FragmentManager fm) {
        super(fm);
        mFragment_French_fries = new Fragment_French_fries();
        mFragment_Pancake = new Fragment_Pancake();

    }

    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return mFragment_French_fries;
        }else if(position==1){
            return mFragment_Pancake;
        }
        return null;
    }

    @Override
    public int getCount() {
        return listTab.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return listTab[position];
    }
}
