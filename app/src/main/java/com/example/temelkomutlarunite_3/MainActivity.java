package com.example.temelkomutlarunite_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnUyg1;
    Button btnUyg2;
    Button btnUyg3;
    Button btnUyg4;
    Button btnUyg5;
    Button Btnuyg6;
    Button Btn7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnUyg1 = findViewById(R.id.btnUyg1);
        btnUyg2 = findViewById(R.id.btnUyg2);
        btnUyg3 = findViewById(R.id.btnUyg3);
        btnUyg4 = findViewById(R.id.btnUyg4);
        btnUyg5 = findViewById(R.id.btnUyg5);
        Btnuyg6 = findViewById(R.id.Btnuyg6);
        Btn7 = findViewById(R.id.Btn7);

        btnUyg1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Uyg1Activity.class);
                startActivity(i);
            }
        });

        btnUyg2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Uyg2Activity.class);
                startActivity(i);
            }
        });

        btnUyg3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Uyg3Activity.class);
                startActivity(i);
            }
        });

        btnUyg4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Uyg4Activity.class);
                startActivity(i);
            }
        });

        btnUyg5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Uyg5Activity.class);
                startActivity(i);
            }
        });
        Btnuyg6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,Uyg6.class);
                startActivity(i);
            }
        });
        Btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Uyg7Activity.class);
                startActivity(i);
            }
        });
    }
}