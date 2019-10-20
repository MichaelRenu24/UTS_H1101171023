package com.example.uts_h1101171023;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Komponen5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_komponen5);
    }

    public void Back5(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void ClickManifestSintax(View view){
        Intent intent = new Intent(this,sintaxmanifest.class);
        startActivity(intent);
    }

    public void ClickManifestLink(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://developer.android.com/guide/topics/manifest/manifest-intro?hl=ID"));
        startActivity(intent);}
}
