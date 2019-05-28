package com.project.assistant.sliit;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Y1S11 extends AppCompatActivity {
    private static Button ics;
    private static Button ip;
    private static Button cs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_y1_s11);
        onClickButtonListner();
        onClickButtonListner1();
        onClickButtonListner2();
    }


    public void onClickButtonListner(){
        ics = (Button)findViewById(R.id.ics);
        ics.setOnClickListener(
                new View.OnClickListener(){

                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(Y1S11.this,listItemICS.class);
                        startActivity(intent);
                    }
                }

        );
    }

    public void onClickButtonListner1(){
        ip = (Button)findViewById(R.id.ip);
        ip.setOnClickListener(
                new View.OnClickListener(){

                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(Y1S11.this,listItemIP.class);
                        startActivity(intent);
                    }
                }

        );
    }


    public void onClickButtonListner2(){
        cs = (Button)findViewById(R.id.cs);
        cs.setOnClickListener(
                new View.OnClickListener(){

                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(Y1S11.this,listItemCS.class);
                        startActivity(intent);
                    }
                }

        );
    }

}
