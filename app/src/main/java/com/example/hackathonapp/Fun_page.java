package com.example.hackathonapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Fun_page extends AppCompatActivity {
    TextView fp_reportIncident;
    TextView fp_legal;
    TextView fp_forum;
    TextView fp_selfDefence;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_page);
        fp_reportIncident = findViewById(R.id.reportIncident);
        fp_legal = findViewById(R.id.legal);
        fp_forum = findViewById(R.id.forum);
        fp_selfDefence = findViewById(R.id.selfDefence);


        fp_legal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(Fun_page.this, Legal.class));
                finish();

            }
        });
        fp_selfDefence.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i1 = new Intent(Fun_page.this, selfdef.class);
                startActivity(i1);


            }
        });

    }
}
