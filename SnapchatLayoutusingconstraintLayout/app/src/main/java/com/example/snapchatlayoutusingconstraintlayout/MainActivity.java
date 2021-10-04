package com.example.snapchatlayoutusingconstraintlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button log,sign;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        log = findViewById(R.id.LogIn);
        sign = findViewById(R.id.SignUp);

        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Going to Login Page",Toast.LENGTH_SHORT).show();
                Intent login = new Intent(MainActivity.this , loginPage.class);
                startActivity(login);
            }
        });

        sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Going to Registration Page",Toast.LENGTH_SHORT).show();
                Intent signup = new Intent(MainActivity.this , SigninPage.class);
                startActivity(signup);
            }
        });
    }
}