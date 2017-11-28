package com.khanh.project;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class FoodActivity extends AppCompatActivity {
    private ViewPager mViewPager;


    ListView listViewFragment_activity_main;

    TextView txttitle_actionbar,txtbuy_activity_main,txtmoney_activi_main;

    NavigationView navigationView;



    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle actionBarDrawerToggle;


    String item_drawer[] ={"Menu","About","Cart","Contact","Login"};
    List<DTO> list;
    ListView list_menu;
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initdisplay();
        initaddcontroll();
        changeStatusbar();
        actionbar();
        addfonts();
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
        actionBarDrawerToggle = new ActionBarDrawerToggle(FoodActivity.this, drawerLayout,R.string.text_open, R.string.text_close);
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


    private void addfonts() {
        Typeface customFont_actionbar=Typeface.createFromAsset(getAssets(),"fonts/Bambino Black.otf");
        txttitle_actionbar.setTypeface(customFont_actionbar);
    }

    private void actionbar() {
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationIcon(R.drawable.icons_menu);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawerLayout.openDrawer(Gravity.START);

            }
        });
    }

    private void changeStatusbar() {
        Window window = this.getWindow();

// clear FLAG_TRANSLUCENT_STATUS flag:
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);

// add FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS flag to the window
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);

// finally change the color
        window.setStatusBarColor(ContextCompat.getColor(this,R.color.color_statusbar));
    }

    private void initaddcontroll() {
        mViewPager= (ViewPager) findViewById(R.id.viewpager_activity_main);
        mViewPager.setAdapter(new Adapter_tablayout_food(getSupportFragmentManager()));
        TabLayout tablayout= (TabLayout) findViewById(R.id.tablayout_activity_main);
        tablayout.setupWithViewPager(mViewPager);

        toolbar= (Toolbar) findViewById(R.id.toolbar);
        navigationView= (NavigationView) findViewById(R.id.NavigationView_activity_main);

        drawerLayout= (DrawerLayout) findViewById(R.id.drawer_layout);

        txttitle_actionbar=(TextView)findViewById(R.id.txttitle_actionbar);
        txtbuy_activity_main=(TextView)findViewById(R.id.txtbuy_activity_main);
        txtmoney_activi_main=(TextView)findViewById(R.id.txtmoney_activi_main);
    }

    private void initdisplay() {
    }
}
