package com.example.applicationdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    private EditText txtEmail,txtPwd;
    private Button btnSignin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        txtEmail = findViewById(R.id.txtEmail);
        txtPwd = findViewById(R.id.txtPwd);
        btnSignin = findViewById(R.id.btnSignin);





        btnSignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               Intent i = new Intent(getApplicationContext(),MainActivity.class);
               i.putExtra("username", txtEmail.getText().toString());
               startActivity(i);
//                Toast.makeText(LoginActivity.this,"Email ID : " +  txtEmail.getText().toString() +
//                                " Password: " +txtPwd.getText().toString()
//                        , Toast.LENGTH_SHORT).show();
            }
        });



    }
}