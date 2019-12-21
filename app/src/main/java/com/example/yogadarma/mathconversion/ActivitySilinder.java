package com.example.yogadarma.mathconversion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ActivitySilinder extends AppCompatActivity {

    EditText radius, diameter, tinggi;
    TextView volume;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_silinder);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        radius = findViewById(R.id.etJari);
        diameter = findViewById(R.id.etDiameter);
        tinggi = findViewById(R.id.etTinggi);
        volume = findViewById(R.id.txtVolume);

        Button button = findViewById(R.id.btnHitung);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final double phi = 3.14285714286;
                double volumeSilinder;

                if(radius.getText().toString().trim().length() > 0 && diameter.getText().toString().trim().length() == 0 && tinggi.getText().toString().trim().length() > 0 ) {
                    double jari = Double.parseDouble(radius.getText().toString());
                    double tinggiSilinder = Double.parseDouble(tinggi.getText().toString());
                    volumeSilinder = (phi * jari * jari) * tinggiSilinder;
                    volume.setText(String.valueOf(String.format("%.2f", volumeSilinder)));

                }else if (diameter.getText().toString().trim().length() > 0 && radius.getText().toString().trim().length() == 0 && tinggi.getText().toString().trim().length() > 0 ){
                    double diameterAlas = Double.parseDouble(diameter.getText().toString());
                    double tinggiSilinder = Double.parseDouble(tinggi.getText().toString());
                    double setDiameter = 0.5 * diameterAlas;
                    volumeSilinder = (phi * setDiameter * setDiameter) * tinggiSilinder;
                    volume.setText(String.valueOf(String.format("%.2f", volumeSilinder)));

                }else if (radius.getText().toString().trim().length() > 0 && diameter.getText().toString().trim().length() > 0 || tinggi.getText().toString().trim().length() > 0 ) {
                    Toast.makeText(ActivitySilinder.this, "Isikan nilai antara jari-jari atau diameter", Toast.LENGTH_SHORT).show();

                }else {
                    Toast.makeText(ActivitySilinder.this, "Kolom tidak boleh kosong", Toast.LENGTH_SHORT).show();
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
