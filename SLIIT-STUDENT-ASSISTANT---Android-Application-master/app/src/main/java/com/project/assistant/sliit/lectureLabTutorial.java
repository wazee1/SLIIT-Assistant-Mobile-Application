package com.project.assistant.sliit;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class lectureLabTutorial extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lecture_lab_tutorial);
        setOnClickListener();
        setOnClickListener2();
        setOnclickListener3();
    }


    Button btn_lec;
    Button btn_lab;
    Button btn_tute;

    public void setOnClickListener(){
        btn_lec = (Button) findViewById(R.id.lec);
        btn_lec.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(lectureLabTutorial.this,lectureMAD.class);
                        startActivity(intent);
                    }
                }


        );
    }


    public void setOnClickListener2(){
        btn_lab = (Button) findViewById(R.id.lab);
        btn_lab.setOnClickListener(
                new View.OnClickListener(){

                    @Override
                    public void onClick(View view) {
                        Intent intent2 = new Intent(lectureLabTutorial.this,labMAD.class);
                        startActivity(intent2);
                    }
                }

        );
    }


    public void setOnclickListener3(){
        btn_tute = (Button) findViewById(R.id.tute);
        btn_tute.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick(View view){
                        Intent intent3 = new Intent(lectureLabTutorial.this,tuteMAD.class);
                        startActivity(intent3);
                    }
                }

        );
    }

}
