package com.example.temelkomutlarunite_3;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg10Activty extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int x=5;
        int y=8;
        System.out.println("x 10 dan büyük ve y 10 dan küçük mü"  + (x > 20 && y < 20));
        System.out.println("x 10 dan büyük ve y 10 dan küçük mü tersi"  + !(x > 20 && y < 20));
        System.out.println("x 10 dan büyük veya y 10 dan küçük mü : " + (x > 20 || y <20));
        System.out.println("x 10 dan büyük veya y 10 dan küçük mü tersi: " + !(x > 20 || y <20));

    }
}
