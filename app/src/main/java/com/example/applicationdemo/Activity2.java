package com.example.applicationdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {
    CheckBox chkFemale,chkMale,chkOther;
    Button btnGender,btnBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        btnGender = findViewById(R.id.btnGender);
        btnBack = findViewById(R.id.btnBack);
        chkFemale = findViewById(R.id.chkFemale);
        chkMale = findViewById(R.id.chkMale);
        chkOther = findViewById(R.id.chkOther);

        btnGender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 if(chkFemale.isChecked())
                 {
                     Toast.makeText(getApplicationContext(),"I am female", Toast.LENGTH_SHORT ).show();
                 }
                 if(chkMale.isChecked())
                 {
                     Toast.makeText(getApplicationContext(),"I am male", Toast.LENGTH_SHORT ).show();
                 }
                 if(chkOther.isChecked())
                 {
                     Toast.makeText(getApplicationContext(),"I have other gender", Toast.LENGTH_SHORT ).show();
                 }

            }
        });
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Activity2.super.onBackPressed();
            }
        });



    }



}