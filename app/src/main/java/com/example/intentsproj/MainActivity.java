package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btn1;
    EditText edtext1, edtext2;
    String v1, v2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn1 = findViewById(R.id.btn1);
        edtext1 = findViewById(R.id.editText1);
        edtext2 = findViewById(R.id.editText2);

    }

    @Override
    protected void onResume() {
        super.onResume();

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               v1 = edtext1.getText().toString();
               v2 = edtext2.getText().toString();

               Intent intent = new Intent(MainActivity.this, SecondActivity.class);
               intent.putExtra("Value1", v1);
               intent.putExtra("Value2", v2);

               startActivity(intent);
            }
        });
    }
}
