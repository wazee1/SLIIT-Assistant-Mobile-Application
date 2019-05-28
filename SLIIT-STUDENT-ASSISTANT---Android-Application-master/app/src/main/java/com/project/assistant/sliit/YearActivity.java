package com.project.assistant.sliit;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class YearActivity extends AppCompatActivity {
    // ImageButton androidImageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_year);






        OnClickButtonListner();
        OnClickButtonListner2();

      /*  androidImageButton = (ImageButton)findViewById(R.id.imageButton);

        androidImageButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, "It works", Toast.LENGTH_LONG).show();
            }

        });*/
    }

    private static ImageButton img_btn_year1;

    public void OnClickButtonListner(){
        img_btn_year1 = (ImageButton) findViewById(R.id.imageButton);
        img_btn_year1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(YearActivity.this,firstYearActivity.class);
                        startActivity(intent);
                    }
                }
        );
    }

    private static ImageButton img_btn_year2;

    public void OnClickButtonListner2(){
        img_btn_year2 = (ImageButton) findViewById(R.id.imageButton3);
        img_btn_year2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(YearActivity.this,SecondActivity.class);
                        startActivity(intent);
                    }
                }
        );
    }

}
