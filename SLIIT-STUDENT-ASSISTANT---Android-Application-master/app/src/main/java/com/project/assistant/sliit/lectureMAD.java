package com.project.assistant.sliit;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class lectureMAD extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lecture_mad);
        setOnclickListener();
        setOnclickListener2();
        setOnclickListener3();
        setOnclickListener4();
        setOnclickListener5();
        setOnclickListener6();
        setOnclickListener7();
    }

    Button btn_lec1;
    Button btn_lec2;
    Button btn_lec3;
    Button btn_lec4;
    Button btn_lec5;
    Button btn_lec6;
    Button btn_lec7;
    Button btn_lec8;

    public void setOnclickListener(){
        btn_lec1 = (Button) findViewById(R.id.lec1);
        btn_lec1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(lectureMAD.this,lec1MAD.class);
                        intent.putExtra("pdf","Lecture 01 - Mobile Mindset.pdf");
                        startActivity(intent);
                    }
                }

        );

    }

    public void setOnclickListener2(){
        btn_lec2 = (Button) findViewById(R.id.lec2);
        btn_lec2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent2 = new Intent(lectureMAD.this,lec1MAD.class);
                        intent2.putExtra("pdf","Lecture 02 - Mobile Platforms and Application Development fundamentals.pdf");
                        startActivity(intent2);
                    }
                }

        );

    }

    public void setOnclickListener3(){
        btn_lec3 = (Button) findViewById(R.id.lec3);
        btn_lec3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent3 = new Intent(lectureMAD.this,lec1MAD.class);
                        intent3.putExtra("pdf","Lecture 03 - Introduction to Android Operating System.pdf");
                        startActivity(intent3);
                    }
                }

        );

    }

    public void setOnclickListener4(){
        btn_lec4 = (Button) findViewById(R.id.lec4);
        btn_lec4.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent4 = new Intent(lectureMAD.this,lec1MAD.class);
                        intent4.putExtra("pdf","Lecture 04 - Mobile Interface Design Concepts and UIUX Design Fundamentals.pdf");
                        startActivity(intent4);
                    }
                }

        );

    }

    public void setOnclickListener5(){
        btn_lec5 = (Button) findViewById(R.id.lec5);
        btn_lec5.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent5 = new Intent(lectureMAD.this,lec1MAD.class);
                        intent5.putExtra("pdf","Lecture 05 - Main Components of Android Application.pdf");
                        startActivity(intent5);
                    }
                }

        );

    }

    public void setOnclickListener6(){
        btn_lec6 = (Button) findViewById(R.id.lec6);
        btn_lec6.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent6 = new Intent(lectureMAD.this,lec1MAD.class);
                        intent6.putExtra("pdf","Lecture 06 - Data Handling in Mobile Platforms.pdf");
                        startActivity(intent6);
                    }
                }

        );

    }

    public void setOnclickListener7(){
        btn_lec7 = (Button) findViewById(R.id.lec7);
        btn_lec7.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent7 = new Intent(lectureMAD.this,lec1MAD.class);
                        intent7.putExtra("pdf","Lecture 07 - Media Handling Process in Android.pdf");
                        startActivity(intent7);
                    }
                }

        );

    }
}
