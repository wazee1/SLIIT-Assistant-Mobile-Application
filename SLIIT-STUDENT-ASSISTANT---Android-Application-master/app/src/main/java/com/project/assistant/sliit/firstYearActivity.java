package com.project.assistant.sliit;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class firstYearActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_year);
        OnClickButtonListner11();
        OnClickButtonListner12();
    }

    private static Button btn_year11;

    public void OnClickButtonListner11(){
        btn_year11 = (Button) findViewById(R.id.button2);
        btn_year11.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(firstYearActivity.this,Y1S11.class);
                        startActivity(intent);
                    }
                }
        );
    }

    private static Button btn_year12;

    public void OnClickButtonListner12(){
        btn_year12 = (Button) findViewById(R.id.y2s11);
        btn_year12.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(firstYearActivity.this,Y1S1ref.class);
                        startActivity(intent);
                    }
                }
        );
    }
}
