package com.example.applicationdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Activity1 extends AppCompatActivity {
    TextView txtUser;
    Button btnBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);

        txtUser = findViewById(R.id.txtUser);
        btnBack = findViewById(R.id.btnBack);

        Intent act1 = getIntent();
        String username = act1.getStringExtra("username");

        txtUser.setText("Welcome " + username + " to Activity one");


        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Activity1.super.onBackPressed();
            }
        });

    }
}