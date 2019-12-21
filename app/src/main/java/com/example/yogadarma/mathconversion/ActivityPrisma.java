package com.example.yogadarma.mathconversion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class ActivityPrisma extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prisma);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        Button prismaSegitiga = findViewById(R.id.btnPrisma_segitiga);
        prismaSegitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityPrisma.this, ActivityPrismaSegitiga.class);
                startActivity(intent);
            }
        });

        Button prismaSegilima = findViewById(R.id.btnPrisma_segilima);
        prismaSegilima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityPrisma.this, ActivityPrismaSegilima.class);
                startActivity(intent);
            }
        });

        Button prismaSegienam = findViewById(R.id.btnPrisma_segienam);
        prismaSegienam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityPrisma.this, ActivityPrismaSegienam.class);
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
