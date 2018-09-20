package com.example.santhoshkumar.splashscreenwithprogessdialog;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;

public class SplashActivity extends AppCompatActivity {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        //hidding the Action Bar

        getSupportActionBar().hide();

        //intiating the Progress Bar

        ProgressBar progressBar = (ProgressBar)findViewById(R.id.progressBar);

        //setting the color

        int colorCodeDark = Color.parseColor("#1f66e5");

        progressBar.setIndeterminateTintList(ColorStateList.valueOf(colorCodeDark));

        //setting the timer

        progressBar.setProgress(4);

        //Initating new thread for showing splash screen

        Thread thread = new Thread() {

            @Override
            public void run() {

                try {
                    sleep(4000);
                    startActivity(new Intent(getApplicationContext(), MainActivity.class));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        };
        thread.start();
    }

}