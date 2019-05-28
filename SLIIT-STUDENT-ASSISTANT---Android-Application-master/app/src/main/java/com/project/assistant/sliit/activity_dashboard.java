package com.project.assistant.sliit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class activity_dashboard extends AppCompatActivity {

    private Date lecture1,lecture2,lecture3,lecture4;
    private String subject1,subject2,subject3,subject4,subjectNXT;
    private SimpleDateFormat dateFormat;
    private TextView subject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        subject = findViewById(R.id.subject);

        try {
            Calendar calendar = Calendar.getInstance();
            int day = calendar.get(Calendar.DAY_OF_WEEK);
            dateFormat = new SimpleDateFormat("hh:mm a");

            if(day == 1){
                Sunday();
            } else if(day == 2){
                Monday();
            } else if(day == 3){
                Tuesday();
            } else if(day == 4){
                Wednesday();
            } else if(day == 5){
                Thursday();
            } else if(day == 6){
                Friday();
            } else if(day == 7){
                Saturday();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void Monday(){
        try {
            lecture1 = dateFormat.parse("8:30 AM");
            lecture2 = dateFormat.parse("10:30 AM");
            lecture3 = dateFormat.parse("1:30 PM");
            lecture4 = dateFormat.parse("3:30 PM");
        } catch (ParseException e) {
            e.printStackTrace();
        }

        subject1 = "ITP";
        subject2 = "ITP tute";
        subject3 = "null";
        subject4 = "null";
        subjectNXT = "Next CN";
        Next_Lecture();
    }
    private void Tuesday(){
        try {
            lecture1 = dateFormat.parse("8:30 AM");
            lecture2 = dateFormat.parse("10:30 AM");
            lecture3 = dateFormat.parse("1:30 PM");
            lecture4 = dateFormat.parse("3:30 PM");
        } catch (ParseException e) {
            e.printStackTrace();
        }

        subject1 = "CN";
        subject2 = "CN tute";
        subject3 = "null";
        subject4 = "ESD";
        subjectNXT = "MAD";
        Next_Lecture();
    }
    private void Wednesday(){
        try {
            lecture1 = dateFormat.parse("8:30 AM");
            lecture2 = dateFormat.parse("10:30 AM");
            lecture3 = dateFormat.parse("1:30 PM");
            lecture4 = dateFormat.parse("3:30 PM");
        } catch (ParseException e) {
            e.printStackTrace();
        }

        subject1 = "MAD";
        subject2 = "MAD tute";
        subject3 = "MAD lab 2.1";
        subject4 = "MAD lab 2.2";
        subjectNXT = "DSA";
        Next_Lecture();
    }
    private void Thursday(){
        try {
            lecture1 = dateFormat.parse("8:30 AM");
            lecture2 = dateFormat.parse("10:30 AM");
            lecture3 = dateFormat.parse("1:30 PM");
            lecture4 = dateFormat.parse("3:30 PM");
        } catch (ParseException e) {
            e.printStackTrace();
        }

        subject1 = "DSA lab 2.1";
        subject2 = "DSA lab 2.2";
        subject3 = "DSA tute";
        subject4 = "null";
        subjectNXT = "CN lab 2.1";
        Next_Lecture();
    }
    private void Friday(){
        try {
            lecture1 = dateFormat.parse("8:30 AM");
            lecture2 = dateFormat.parse("10:30 AM");
            lecture3 = dateFormat.parse("1:30 PM");
            lecture4 = dateFormat.parse("3:30 PM");
        } catch (ParseException e) {
            e.printStackTrace();
        }

        subject1 = "CN lab 2.1";
        subject2 = "CN lab 2.2";
        subject3 = "DSA";
        subject4 = "PS";
        subjectNXT = "ITP";
        Next_Lecture();
    }
    private void Saturday(){
        try {
            lecture1 = dateFormat.parse("8:30 AM");
            lecture2 = dateFormat.parse("10:30 AM");
            lecture3 = dateFormat.parse("1:30 PM");
            lecture4 = dateFormat.parse("3:30 PM");
        } catch (ParseException e) {
            e.printStackTrace();
        }

        subject1 = "ITP";
        subject2 = "ITP";
        subject3 = "ITP";
        subject4 = "ITP";
        subjectNXT = "ITP";
        Next_Lecture();
    }
    private void Sunday(){
        try {
            lecture1 = dateFormat.parse("8:30 AM");
            lecture2 = dateFormat.parse("10:30 AM");
            lecture3 = dateFormat.parse("1:30 PM");
            lecture4 = dateFormat.parse("3:30 PM");
        } catch (ParseException e) {
            e.printStackTrace();
        }

        subject1 = "ITP";
        subject2 = "ITP";
        subject3 = "ITP";
        subject4 = "ITP";
        subjectNXT = "ITP";
        Next_Lecture();
    }

    private void Next_Lecture(){
        try {
            Date CurrentTime = null;
            CurrentTime = dateFormat.parse(dateFormat.format(new Date()));

            if (CurrentTime.equals(lecture1) || CurrentTime.before(lecture1)) {
                if (subject1.equals("null")){
                    subject1 = subject2;
                }
                Toast.makeText(this, subject1, Toast.LENGTH_SHORT).show();
                subject.setText(subject1);
            } else if (CurrentTime.equals(lecture2) || CurrentTime.after(lecture1) && CurrentTime.before(lecture2)) {
                if (subject2.equals("null")){
                    subject2 = subject3;
                }
                Toast.makeText(this, subject2, Toast.LENGTH_SHORT).show();
                subject.setText(subject2);
            } else if (CurrentTime.equals(lecture3) || CurrentTime.after(lecture2) && CurrentTime.before(lecture3)) {
                if (subject3.equals("null")){
                    subject3 = subject4;
                }
                Toast.makeText(this, subject3, Toast.LENGTH_SHORT).show();
                subject.setText(subject3);
            } else if (CurrentTime.equals(lecture4) || CurrentTime.after(lecture3) && CurrentTime.before(lecture4)) {
                if (subject4.equals("null")){
                    subject4 = subjectNXT;
                }
                Toast.makeText(this, subject4, Toast.LENGTH_SHORT).show();
                subject.setText(subject4);
            } else if (CurrentTime.after(lecture4)) {
                Toast.makeText(this, subjectNXT, Toast.LENGTH_SHORT).show();
                subject.setText(subjectNXT);
            }

        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

    public void year1 (View view){
        Intent intent = new Intent(this,firstYearActivity.class);
        startActivity(intent);
    }

    public void year2 (View view){
        Intent intent = new Intent(this,SecondActivity.class);
        startActivity(intent);
    }

}
