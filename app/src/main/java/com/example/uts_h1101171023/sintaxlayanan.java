package com.example.uts_h1101171023;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class sintaxlayanan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sintaxlayanan);
    }

    public void ClickHomeLayanan(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
