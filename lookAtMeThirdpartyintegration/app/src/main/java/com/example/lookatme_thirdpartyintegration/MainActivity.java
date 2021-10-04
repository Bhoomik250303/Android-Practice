package com.example.lookatme_thirdpartyintegration;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.pd.lookatme.LookAtMe;

public class MainActivity extends AppCompatActivity {
    private LookAtMe lookAtMe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();
        lookAtMe = findViewById(R.id.lookme);
        lookAtMe.init(this);
        //lookAtMe.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.videoplayback));
         lookAtMe.setVideoPath("https://drive.google.com/file/d/1tltiVl4n-NZSXV4EJ7ktMT-SLqoR7P6P/view?usp=sharing"); // to use video from a url

        lookAtMe.start();
        lookAtMe.setLookMe();
    }
}