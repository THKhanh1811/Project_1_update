package com.khanh.project;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by ASUS on 11/10/2017.
 */

public class Fragment_Pancake extends Fragment {
    private View mrootView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mrootView=inflater.inflate(R.layout.fragment_food,container,false);
        return mrootView;
    }
}
