package com.example.yogadarma.mathconversion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class ActivityLimas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_limas);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        Button limasSegitiga = findViewById(R.id.btnLimas_segitiga);
        limasSegitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityLimas.this, ActivityLimasSegitiga.class);
                startActivity(intent);
            }
        });

        Button limasSegiempat = findViewById(R.id.btnLimas_segiempat);
        limasSegiempat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityLimas.this, ActivityLimasSegiempat.class);
                startActivity(intent);
            }
        });

        Button limasSegilima = findViewById(R.id.btnLimas_segilima);
        limasSegilima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityLimas.this, ActivityLimasSegilima.class);
                startActivity(intent);
            }
        });

        Button limasSegienam = findViewById(R.id.btnLimas_segienam);
        limasSegienam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(ActivityLimas.this, ActivityLimasSegienam.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()== android.R.id.home) {
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
