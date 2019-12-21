package com.example.yogadarma.mathconversion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class ActivitySegitiga extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        Button samaSisi = findViewById(R.id.btnSama_sisi);
        samaSisi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivitySegitiga.this, ActivitySamaSisi.class);
                startActivity(intent);
            }
        });

        Button samaKaki = findViewById(R.id.btnSama_kaki);
        samaKaki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivitySegitiga.this, ActivitySamaKaki.class);
                startActivity(intent);
            }
        });

        Button sikuSiku = findViewById(R.id.btnSiku_siku);
        sikuSiku.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivitySegitiga.this, ActivitySiku_siku.class);
                startActivity(intent);
            }
        });

        Button sembarang = findViewById(R.id.btnSembarang);
        sembarang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivitySegitiga.this, ActivitySegitigaSembarang.class);
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
