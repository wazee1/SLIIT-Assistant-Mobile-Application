package com.project.assistant.sliit;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Y1S1ref extends AppCompatActivity {
    private static Button se;
    private static Button se2;
    private static Button c;
    private static Button java;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_y1_s1ref);
        onClickButtonListner();
        onClickButtonListner2();
        onClickButtonListner3();
        onClickButtonListner4();
    }

    public void onClickButtonListner(){
        se = (Button)findViewById(R.id.se);
        se.setOnClickListener(
                new View.OnClickListener(){

                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(Y1S1ref.this,listItemOne.class);
                        startActivity(intent);
                    }
                }

        );
    }

    public void onClickButtonListner2(){
        se2 = (Button)findViewById(R.id.se2);
        se2.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(Y1S1ref.this,listItemTwo.class);
                        startActivity(intent);
                    }
                }
        );
    }

    public void onClickButtonListner3(){
        c = (Button)findViewById(R.id.c);
        c.setOnClickListener(
                new View.OnClickListener(){

                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(Y1S1ref.this,listItemThree.class);
                        startActivity(intent);
                    }
                }
        );

    }

    public void onClickButtonListner4(){
        java = (Button)findViewById(R.id.java);
        java.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(Y1S1ref.this,listItemFour.class);
                        startActivity(intent);
                    }
                }
        );
    }
}
