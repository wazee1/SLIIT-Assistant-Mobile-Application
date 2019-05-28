package com.project.assistant.sliit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class lab1MAD extends AppCompatActivity {

    PDFView lab1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab1_mad);


        String pdf = getIntent().getStringExtra("pdf");

        lab1 = (PDFView) findViewById(R.id.pdfLab1);
        lab1.fromAsset(pdf).load();
    }
}
