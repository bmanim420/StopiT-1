package com.example.hackathonapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class selfdef extends AppCompatActivity {
    PDFView sf_selfdef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selfdef);
        sf_selfdef = (PDFView) findViewById(R.id.selfdef);
        sf_selfdef.fromAsset("pdf_self.pdf").load();
    }
}
