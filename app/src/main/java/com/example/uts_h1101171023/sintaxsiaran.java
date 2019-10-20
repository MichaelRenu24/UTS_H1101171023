package com.example.uts_h1101171023;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class sintaxsiaran extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sintaxsiaran);
    }

    public void ClickHomeSiaran(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
