package com.example.temelkomutlarunite_3;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg9Activty extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int x=15;
        int y=8;
        System.out.println("x ile y eşit mi :" +(x == y));
        System.out.println("X ile y farklı mı :" +(x != y));
        System.out.println("x, y den büyük mü :" + (x > y));
        System.out.println("x, y den küçük mü :" + (x < y ));
        System.out.println("X, y den büyük veya eşitmi :"+ (x  >= y));
        System.out.println("x, y den küçük veya eşitmi:" + (x <= y));



    }
}
