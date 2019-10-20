package com.example.uts_h1101171023;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Komponen1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_komponen1);
    }

    public void Back1(View view){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

    public void ClickSintaxActivty(View view){
        Intent intent = new Intent(this,sintaxactiviti.class);
        startActivity(intent);
    }

    public void ClickLinkActivity(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://developer.android.com/guide/components/activities/?hl=id"));
        startActivity(intent);
    }
}
