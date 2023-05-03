package com.example.applicationdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class FoodActivity extends AppCompatActivity {
    Button btnBack,btnOrder;
    CheckBox chk1,chk2,chk3,chk4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);


        chk1 = findViewById(R.id.chk1);
        chk2 = findViewById(R.id.chk2);
        chk3 = findViewById(R.id.chk3);
        chk4 = findViewById(R.id.chk4);

        btnOrder = findViewById(R.id.btnOrder);
        btnBack = findViewById(R.id.btnBack);

        btnOrder.setOnClickListener(new View.OnClickListener() {
            StringBuilder result = new StringBuilder();
            @Override
            public void onClick(View v) {
                result.append("The Order included : ");
                 if(chk1.isChecked())
                 {
                     result.append("\n" + chk1.getText().toString());

                 }
                 if(chk2.isChecked())
                 {
                     result.append("\n" + chk2.getText().toString());
                 }
                 if(chk3.isChecked())
                 {
                     result.append("\n" + chk3.getText().toString());
                 }
                 if(chk4.isChecked())
                 {
                     result.append("\n" + chk4.getText().toString());
                 }

                Toast.makeText(getApplicationContext(),result.toString(), Toast.LENGTH_SHORT ).show();

            }
        });


        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FoodActivity.super.onBackPressed();
            }
        });
    }
}