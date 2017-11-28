package com.khanh.project;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by ACER on 24-11-2017.
 */

public class Adapter_listview_drawer extends ArrayAdapter<DTO> {

    Context context;
    int resID;
    List<DTO> object;
    public Adapter_listview_drawer(@NonNull Context context, int resID, List<DTO> object) {

        super(context,resID,object);
        this.context = context;
        this.resID = resID;
        this.object = object;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View view = View.inflate(context,resID,null);
        TextView textView = view.findViewById(R.id.text_item_drawer);
        DTO item = object.get(position);

        textView.setText(item.getText_item());



        return view;
    }
}
