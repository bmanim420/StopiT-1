package com.example.hackathonapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Button1 extends AppCompatActivity {
    PDFView pdf1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button1);

        pdf1 = (PDFView) findViewById(R.id.pdf1);
        pdf1.fromAsset("1.pdf").load();

    }
}
