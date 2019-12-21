package com.example.yogadarma.mathconversion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityLimasSegitiga extends AppCompatActivity {

    EditText alas, tinggi, tinggiAlas;
    TextView volume;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_limas_segitiga);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        alas = findViewById(R.id.etAlas);
        tinggi = findViewById(R.id.etTinggi);
        tinggiAlas = findViewById(R.id.etTinggi_alas);
        volume = findViewById(R.id.txtVolume);

        Button button = findViewById(R.id.btnHitung);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(alas.getText().toString().trim().length() > 0 && tinggi.getText().toString().trim().length() > 0 && tinggiAlas.getText().toString().trim().length() > 0) {
                    double alasAlas = Double.parseDouble(alas.getText().toString());
                    double tinggi_alas = Double.parseDouble(tinggiAlas.getText().toString());
                    double tinggiLimas = Double.parseDouble(tinggi.getText().toString());
                    double volumeLimas = 1.0 / 3.0 * (0.5 * alasAlas * tinggi_alas) * tinggiLimas;

                    volume.setText(String.valueOf(String.format("%.2f", volumeLimas)));
                }else {
                    Toast.makeText(ActivityLimasSegitiga.this, "Kolom tidak boleh kosong", Toast.LENGTH_SHORT).show();
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
