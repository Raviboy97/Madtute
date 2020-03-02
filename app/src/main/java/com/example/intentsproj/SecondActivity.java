package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    Button btn2,btn3,btn4,btn5;
    EditText edText3,edText4;
    String v3,v4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent myIntent = new Intent(SecondActivity.this,MainActivity.class);
        myIntent.getAction(v1);
        myIntent.getAction(v2);
    }

}
