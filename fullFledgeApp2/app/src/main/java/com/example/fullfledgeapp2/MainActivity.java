package com.example.fullfledgeapp2;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText num1, num2;
    TextView outputText;
    Button add,sub,multi,div;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      //  getActionBar().setTitle("ApnaCalculator");

        num1 = findViewById(R.id.etFirstNumber);
        num2 = findViewById(R.id.etSecondNumber);

        outputText =   findViewById(R.id.textviewOutputNumber);
        add = findViewById(R.id.addButton);
        sub = findViewById(R.id.subButton);
        multi = findViewById(R.id.multiButton);
        div = findViewById(R.id.divButton);

        add.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                float firstValue,secondValue, ans;

                firstValue = Integer.parseInt(num1.getText().toString());
                secondValue = Integer.parseInt(num2.getText().toString());

                ans = firstValue+secondValue;

                outputText.setText("Answer :- " + ans);

            }
        });

        sub.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                float firstValue,secondValue, ans;

                firstValue = Integer.parseInt(num1.getText().toString());
                secondValue = Integer.parseInt(num2.getText().toString());

                ans = firstValue-secondValue;

                outputText.setText("Answer :- " + ans);

            }
        });

        multi.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                float firstValue,secondValue, ans;

                firstValue = Integer.parseInt(num1.getText().toString());
                secondValue = Integer.parseInt(num2.getText().toString());

                ans = firstValue * secondValue;

                outputText.setText("Answer :- " + ans);

            }
        });

        div.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                float firstValue,secondValue, ans;

                firstValue = Integer.parseInt(num1.getText().toString());
                secondValue = Integer.parseInt(num2.getText().toString());

                ans = firstValue/secondValue;

                outputText.setText("Answer :- " + ans);

            }
        });

      /*  div.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                float firstValue,secondValue, ans;

                firstValue = Integer.parseInt(num1.getText().toString());
                secondValue = Integer.parseInt(num2.getText().toString());

                ans = firstValue % secondValue;

                outputText.setText("Answer :- " + ans);

            }
        });*/
    }


}