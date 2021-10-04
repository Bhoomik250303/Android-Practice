package com.example.toast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toast toast = Toast.makeText(MainActivity.this,"Hiiiii",Toast.LENGTH_SHORT);
        toast.setGravity(10,0,0);
        toast.show();
    }
}