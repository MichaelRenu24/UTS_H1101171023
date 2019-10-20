package com.example.uts_h1101171023;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ClickKomponen1(View view){
        Intent intent = new Intent(this,Komponen1.class);
        startActivity(intent);
    }

    public void ClickKomponen2(View view){
        Intent intent = new Intent(this,Komponen2.class);
        startActivity(intent);
    }

    public void ClickKomponen3(View view){
        Intent intent = new Intent(this,Komponen3.class);
        startActivity(intent);
    }

    public void ClickKomponen4(View view){
        Intent intent = new Intent(this,komponen4.class);
        startActivity(intent);
    }

    public void ClickKomponen5(View view){
        Intent intent = new Intent(this,Komponen5.class);
        startActivity(intent);
    }
}

