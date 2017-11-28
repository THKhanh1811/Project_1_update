package com.khanh.project;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by ASUS on 11/10/2017.
 */

public class Adapter_tablayout_food extends FragmentStatePagerAdapter {

    private String listTab[]={"Humberger", "Chicken", "Rice"};
    private Fragment_chicken mFragment_chicken;
    private Fragment_humberger mFragment_humberger;
    private Fragment_rice mFragment_rice;

    public Adapter_tablayout_food(FragmentManager fm) {
        super(fm);
        mFragment_chicken = new Fragment_chicken();
        mFragment_humberger = new Fragment_humberger();
        mFragment_rice = new Fragment_rice();
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return mFragment_humberger;
        }else if(position==1){
            return mFragment_chicken;
        }else if(position==2) {
            return mFragment_rice;
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
