package com.example.firstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText name;
    private EditText cls;
    private EditText roll;
    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.name);
        cls = findViewById(R.id.cls);
        roll = findViewById(R.id.roll);
        btn = findViewById(R.id.saveBtn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                String name1 = name.getText().toString();
                String cls1 = cls.getText().toString();
                String roll1 = roll.getText().toString();
                intent.putExtra("name",name1);
                intent.putExtra("class",cls1);
                intent.putExtra("roll",roll1);
                startActivity(intent);
            }
        });

    }
}