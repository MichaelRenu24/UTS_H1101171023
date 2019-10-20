package com.example.uts_h1101171023;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Komponen2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_komponen2);
    }

    public void Back2(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void ClickSintaxLayanan(View view){
        Intent intent = new Intent(this, sintaxlayanan.class);
        startActivity(intent);
    }

    public void ClickLinkLayanan(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://developer.android.com/guide/components/services?hl=id"));
        startActivity(intent);}
}
