package com.project.assistant.sliit;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Y2S1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_y2_s1);
        onClickButtonListner1();
        onClickButtonListner2();
    }
    public static Button dsa;
    public static Button mad;

    public void onClickButtonListner1(){
        dsa = (Button)findViewById(R.id.dsa);
        dsa.setOnClickListener(
                new View.OnClickListener(){

                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(Y2S1.this,listItemDSA.class);
                        startActivity(intent);
                    }
                }

        );
    }


    public void onClickButtonListner2(){
        mad = (Button)findViewById(R.id.mad);
        mad.setOnClickListener(
                new View.OnClickListener(){

                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(Y2S1.this,lectureLabTutorial.class);
                        startActivity(intent);
                    }
                }

        );
    }

}
