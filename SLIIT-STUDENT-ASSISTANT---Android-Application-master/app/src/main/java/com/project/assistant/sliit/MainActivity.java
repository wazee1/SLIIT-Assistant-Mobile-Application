package com.project.assistant.sliit;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    private static int SPLASH_TIME_OUT =2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent wel = new  Intent(MainActivity.this,activity_login.class);

                startActivity(wel);
                finish();
            }
        },SPLASH_TIME_OUT);


    }
}
