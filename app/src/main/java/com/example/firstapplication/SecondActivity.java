package com.example.firstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;


import org.w3c.dom.Text;

public class SecondActivity extends AppCompatActivity {

    private TextView nameTxt;
    private TextView clsTxt;
    private TextView rollTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        nameTxt = findViewById(R.id.nameTxt);
        clsTxt = findViewById(R.id.classTxt);
        rollTxt = findViewById(R.id.rollTxt);

        Intent intent = getIntent();

        String name = intent.getStringExtra("name");
        String cls = intent.getStringExtra("class");
        String roll = intent.getStringExtra("roll");

        nameTxt.setText("Welcome : " + name.toUpperCase() + " !");
        clsTxt.setText("your Class : " + cls.toUpperCase() + " !");
        rollTxt.setText("Your Roll Number : " + roll + " !");

    }
}