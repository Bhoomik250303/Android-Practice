package com.example.fullfledgeapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    TextView Email,Password;
    Button SubmitAfterLogin;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Thread thread = new Thread() {

            @Override
            public void run() {
                super.run();

                Intent LogintoMain = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(LogintoMain);
            }

        };
        SubmitAfterLogin = findViewById(R.id.submitLogin);
        SubmitAfterLogin.setOnClickListener();


    }
}