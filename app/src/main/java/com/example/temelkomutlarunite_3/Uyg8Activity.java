package com.example.temelkomutlarunite_3;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg8Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int x=15;
        System.out.println("x="+x);
        x += 3;
        System.out.println("x += 3:"+x);
        x -= 2;
        System.out.println("x -=2 :" +x);
        x *= 2;
        System.out.println("x *=2:+"+x);
        x /=4;
        System.out.println("x /=4:" +x);
        x %= 2;
        System.out.println("x %=2" +x);


    }
}
