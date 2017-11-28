package com.khanh.project;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by ASUS on 11/10/2017.
 */

public class Adapter_tablayout_Drink extends FragmentStatePagerAdapter {

    private String listTab[]={"Peach tea", "Milk tea", "Soda"};
    private Fragment_Peach_tea mFragment_Peach_tea;
    private Fragment_Milk_tea mFragment_Milk_tea;
    private Fragment_soda_tea mFragment_soda_tea;

    public Adapter_tablayout_Drink(FragmentManager fm) {
        super(fm);
        mFragment_Peach_tea = new Fragment_Peach_tea();
        mFragment_Milk_tea = new Fragment_Milk_tea();
        mFragment_soda_tea = new Fragment_soda_tea();
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return mFragment_Peach_tea;
        }else if(position==1){
            return mFragment_Milk_tea;
        }else if(position==2) {
            return mFragment_soda_tea;
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
