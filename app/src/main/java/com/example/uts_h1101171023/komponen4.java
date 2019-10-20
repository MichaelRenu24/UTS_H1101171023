package com.example.uts_h1101171023;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class komponen4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_komponen4);
    }

    public void Back4(View view){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

    public void ClickMateriSintax(View view){
        Intent intent = new Intent(this,sintaxmateri.class);
        startActivity(intent);
    }

    public void ClickMateriLink(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://developer.android.com/guide/topics/providers/content-providers?hl=ID"));
        startActivity(intent);}
}

