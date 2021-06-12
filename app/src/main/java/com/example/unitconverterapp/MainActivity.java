package com.example.unitconverterapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView2;
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        textView2=findViewById((R.id.textView2));
        editText=findViewById(R.id.editText);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Hi! Click Listener worked", Toast.LENGTH_SHORT).show();
                String kg = editText.getText().toString();
                int a = Integer.parseInt(kg);
                double pound = 2.205 * a;
                textView2.setText("The corresponding Value in pound is " + pound);


            }
        });
    }
}