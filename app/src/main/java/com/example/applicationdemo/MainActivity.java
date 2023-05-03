package com.example.applicationdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnAct1,btnAct2,btnAct3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAct1 = findViewById(R.id.btnAct1);
        btnAct2 = findViewById(R.id.btnAct2);
        btnAct3 = findViewById(R.id.btnAct3);



        Intent act1 = getIntent();
        String username = act1.getStringExtra("username");




        btnAct1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 Intent act1 = new Intent(MainActivity.this,Activity1.class);
                 act1.putExtra("username",username);
                 startActivity(act1);
            }
        });
        btnAct2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2 = new Intent(MainActivity.this,Activity2.class);
                startActivity(act2);
            }
        });
        btnAct3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2 = new Intent(MainActivity.this,FoodActivity.class);
                startActivity(act2);
            }
        });
    }
}