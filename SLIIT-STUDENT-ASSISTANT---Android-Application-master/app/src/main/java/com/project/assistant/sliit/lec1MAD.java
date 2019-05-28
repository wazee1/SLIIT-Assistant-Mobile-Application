package com.project.assistant.sliit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class lec1MAD extends AppCompatActivity {

    PDFView lec1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lec1_mad);

        String pdf = getIntent().getStringExtra("pdf");

        lec1 = (PDFView) findViewById(R.id.pdfLec1);
        lec1.fromAsset(pdf).load();
    }
}
