package com.example.uts_h1101171023;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Komponen3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_komponen3);
    }

    public void Back3(View view){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

    public void ClickSintaxSiaran(View view){
        Intent intent = new Intent(this,sintaxsiaran.class);
        startActivity(intent);
    }

    public void ClickLinkSiaran(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://developer.android.com/reference/android/content/BroadcastReceiver.html?hl=id"));
        startActivity(intent);}
}
