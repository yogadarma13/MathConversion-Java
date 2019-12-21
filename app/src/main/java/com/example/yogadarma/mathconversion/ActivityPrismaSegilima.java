package com.example.yogadarma.mathconversion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityPrismaSegilima extends AppCompatActivity {

    EditText sisi, tinggiPrisma;
    TextView volume;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prisma_segilima);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        sisi = findViewById(R.id.etSisi);
        tinggiPrisma = findViewById(R.id.etTinggi);
        volume = findViewById(R.id.txtVolume);

        Button button = findViewById(R.id.btnHitung);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(sisi.getText().toString().trim().length() > 0 && tinggiPrisma.getText().toString().trim().length() > 0) {
                    double sisiAlas = Double.parseDouble(sisi.getText().toString());
                    double tinggi_prisma = Double.parseDouble(tinggiPrisma.getText().toString());
                    double volumePrisma = (1.72048 * sisiAlas * sisiAlas) * tinggi_prisma;

                    volume.setText(String.valueOf(String.format("%.2f", volumePrisma)));
                }else {
                    Toast.makeText(ActivityPrismaSegilima.this, "Kolom tidak boleh kosong", Toast.LENGTH_SHORT).show();
                    volume.setText("0");
                }
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
