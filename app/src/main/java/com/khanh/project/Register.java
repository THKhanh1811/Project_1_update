package com.khanh.project;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class Register extends AppCompatActivity {
    TextView signup, txtusername , txtpass, txtcomfirm, txtfullname, txtmail, txtphone,txt,login;
    Button btncreate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        anhxa();
        fonttext();

        Window window = this.getWindow();

// clear FLAG_TRANSLUCENT_STATUS flag:
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);

// add FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS flag to the window
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);

// finally change the color
        window.setStatusBarColor(ContextCompat.getColor(this,R.color.statusbar_color_change));

    }
    public void fonttext(){
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/Bauhaus_Medium.ttf");
        signup.setTypeface(typeface);
        Typeface typeface1 = Typeface.createFromAsset(getAssets(), "fonts/Bambino Light.ttf");
        txtusername.setTypeface(typeface1);
        txtpass.setTypeface(typeface1);
        txtcomfirm.setTypeface(typeface1);
        txtfullname.setTypeface(typeface1);
        txtmail.setTypeface(typeface1);
        txtphone.setTypeface(typeface1);
        btncreate.setTypeface(typeface1);
        login.setTypeface(typeface1);
        txt.setTypeface(typeface1);

    }
    public void anhxa(){
        signup = (TextView)findViewById(R.id.SignUp);
        txtusername = (TextView)findViewById(R.id.txtuser);
        txtpass = (TextView)findViewById(R.id.txtpass);
        txtcomfirm = (TextView)findViewById(R.id.txtcomfirm);
        txtfullname = (TextView)findViewById(R.id.txtname);
        txtmail = (TextView)findViewById(R.id.txtmail);
        txtphone = (TextView)findViewById(R.id.txtphone);
        txt = (TextView)findViewById(R.id.txt);
        login = (TextView)findViewById(R.id.login);
        btncreate = (Button)findViewById(R.id.create);
    }
}
