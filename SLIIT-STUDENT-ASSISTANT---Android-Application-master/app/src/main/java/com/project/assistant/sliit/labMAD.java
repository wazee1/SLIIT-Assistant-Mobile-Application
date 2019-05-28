package com.project.assistant.sliit;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class labMAD extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab_mad);
        setOnclickListener();
        setOnclickListener2();
        setOnclickListener3();
        setOnclickListener4();
        setOnclickListener5();
        setOnclickListener6();
        setOnclickListener7();

    }

    Button btn_lab1;
    Button btn_lab2;
    Button btn_lab3;
    Button btn_lab4;
    Button btn_lab5;
    Button btn_lab6;
    Button btn_lab7;


    public void setOnclickListener(){
        btn_lab1 = (Button) findViewById(R.id.lab1);
        btn_lab1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(labMAD.this,lab1MAD.class);
                        intent.putExtra("pdf","Lab 01MAD.pdf");
                        startActivity(intent);
                    }
                }
        );
    }

    public void setOnclickListener2(){
        btn_lab2 = (Button) findViewById(R.id.lab2);
        btn_lab2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(labMAD.this,lab1MAD.class);
                        intent.putExtra("pdf","Lab 02MAD.pdf");
                        startActivity(intent);
                    }
                }
        );
    }

    public void setOnclickListener3(){
        btn_lab3 = (Button) findViewById(R.id.lab3);
        btn_lab3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(labMAD.this,lab1MAD.class);
                        intent.putExtra("pdf","Lab 03MAD.pdf");
                        startActivity(intent);
                    }
                }
        );
    }

    public void setOnclickListener4(){
        btn_lab4 = (Button) findViewById(R.id.lab4);
        btn_lab4.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(labMAD.this,lab1MAD.class);
                        intent.putExtra("pdf","Lab 05MAD.pdf");
                        startActivity(intent);
                    }
                }
        );
    }

    public void setOnclickListener5(){
        btn_lab5 = (Button) findViewById(R.id.lab5);
        btn_lab5.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(labMAD.this,lab1MAD.class);
                        intent.putExtra("pdf","Lab 06MAD.pdf");
                        startActivity(intent);
                    }
                }
        );
    }

    public void setOnclickListener6(){
        btn_lab6 = (Button) findViewById(R.id.lab6);
        btn_lab6.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(labMAD.this,lab1MAD.class);
                        intent.putExtra("pdf","Lab 07MAD.pdf");
                        startActivity(intent);
                    }
                }
        );
    }


    public void setOnclickListener7(){
        btn_lab7 = (Button) findViewById(R.id.lab7);
        btn_lab7.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(labMAD.this,lab1MAD.class);
                        intent.putExtra("pdf","Lab 08MAD.pdf");
                        startActivity(intent);
                    }
                }
        );
    }
}
