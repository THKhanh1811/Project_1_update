package com.khanh.project;

import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Activity_menu extends AppCompatActivity {

    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle actionBarDrawerToggle;


    String item_drawer[] ={"Menu","About","Cart","Contact","Login"};
    List<DTO> list;
    ListView list_menu;
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        toolbar = findViewById(R.id.custom_Toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationIcon(R.drawable.icons_menu);





//        Đổ dữ liệu vào listview
        list = new ArrayList<DTO>();
        for (int i=0;i<item_drawer.length;i++){
            DTO dto = new DTO();
            dto.setText_item(item_drawer[i]);
            list.add(dto);
        }
        list_menu= (ListView) findViewById(R.id.navigation_list);
        Adapter_listview_drawer arrayAdapter = new Adapter_listview_drawer(this,R.layout.item_drawer,list);
        list_menu.setAdapter(arrayAdapter);




        drawerLayout =  findViewById(R.id.drawer_layout);
        actionBarDrawerToggle = new ActionBarDrawerToggle(Activity_menu.this, drawerLayout,R.string.text_open, R.string.text_close);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();


    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(actionBarDrawerToggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
