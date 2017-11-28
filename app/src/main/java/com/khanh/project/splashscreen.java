package com.khanh.project;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import static com.khanh.project.R.anim.fade_in_text;

public class splashscreen extends AppCompatActivity {
    Animation fadelogo,fadetext;
    ImageView logo;
    TextView vercode, textlogo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
        anhxa();
        getversionapp();

        //hidden status bar
        View decorView = getWindow().getDecorView();
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);

        //font
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/AVANTN.ttf");
        textlogo.setTypeface(typeface);
        Typeface typefacecode = Typeface.createFromAsset(getAssets(), "fonts/AVANTN.ttf");
        vercode.setTypeface(typefacecode);

        // animation
        fadelogo = AnimationUtils.loadAnimation(this,R.anim.fade_in);
        fadetext = AnimationUtils.loadAnimation(this,fade_in_text);
        up();
        Thread timerThread = new Thread(){
            public void run(){
                try{
                    sleep (2200);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }finally{
                    Intent intent = new Intent(splashscreen.this,Activity_menu.class);
                    startActivity(intent);

                }
            }
        };
        timerThread.start();
    }
    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }


    protected void up(){
        logo.startAnimation(fadelogo);
        textlogo.startAnimation(fadetext);
        vercode.startAnimation(fadetext);
    }

    public void getversionapp(){
        String verCode = BuildConfig.VERSION_NAME;
        vercode.setText("Version "+verCode);
    }
    public void anhxa(){
        textlogo = (TextView) findViewById(R.id.txtlogo);
        vercode = (TextView) findViewById(R.id.versioncode);
        logo = (ImageView)findViewById(R.id.logo);
    }

}
