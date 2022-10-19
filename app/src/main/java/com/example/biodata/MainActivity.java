package com.example.biodata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void maps(View v){
        Intent it = new Intent(Intent.ACTION_VIEW);
        String url = "https://www.google.co.id/maps/place/Jl.+Taman+Tirtoyoso,+Rejosari,+Kec.+Semarang+Tim.,+Kota+Semarang,+Jawa+Tengah+50125/@-6.9848268,110.4381255,15z/data=!4m5!3m4!1s0x2e708cb3040b209b:0xdc270c081d7fbfb1!8m2!3d-6.9766327!4d110.4407734?hl=id&authuser=0";
        it.setData(Uri.parse(url));
        startActivity(it);
    }

    public void panggil(View v){
        String nomor = "085155402248";
        Intent memanggil = new Intent(Intent.ACTION_DIAL);
        memanggil.setData(Uri.fromParts("tel: ", nomor, null));
        startActivity(memanggil);
    }

    public void email(View v){
        Intent it = new Intent(Intent.ACTION_VIEW);
        String url = "111202013030.dinus.ac.id";
        it.setData(Uri.parse(url));
        startActivity(it);
    }

}