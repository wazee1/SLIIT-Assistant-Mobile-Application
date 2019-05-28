package com.project.assistant.sliit;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        OnClickButtonListner2();
        OnClickButtonListner3();
    }

    private static Button img_btn_year2;

    public void OnClickButtonListner2(){
        img_btn_year2 = (Button) findViewById(R.id.y2s1);
        img_btn_year2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(SecondActivity.this,Y2S11.class);
                        startActivity(intent);
                    }
                }
        );
    }


    private static Button img_btn_year22;

    public void OnClickButtonListner3(){
        img_btn_year2 = (Button) findViewById(R.id.y2s11);
        img_btn_year2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(SecondActivity.this,Y2S1.class);
                        startActivity(intent);
                    }
                }
        );
    }
}
