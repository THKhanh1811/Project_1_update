package com.khanh.project;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by ASUS on 11/10/2017.
 */

public class Adapter_tablayout_Sweet extends FragmentStatePagerAdapter {

    private String listTab[]={"Cream", "Sundaes"};
    private Fragment_Cream mFragment_Cream;
    private Fragment_Sundaes mFragment_Sundaes;


    public Adapter_tablayout_Sweet(FragmentManager fm) {
        super(fm);
        mFragment_Cream = new Fragment_Cream();
        mFragment_Sundaes = new Fragment_Sundaes();

    }

    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return mFragment_Cream;
        }else if(position==1){
            return mFragment_Sundaes;
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
