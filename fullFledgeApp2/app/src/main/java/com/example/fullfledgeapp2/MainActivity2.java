package com.example.fullfledgeapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        getSupportActionBar().hide(); // hides the top Bar

        Thread thread = new Thread() {

            public void run() {
                try {
                    sleep(1000);
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    Intent splashtoLogin = new Intent(MainActivity2.this, LoginActivity.class);
                    startActivity(splashtoLogin);

                }

            }

        };
        thread.start();

    }
}