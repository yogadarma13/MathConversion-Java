package com.example.yogadarma.mathconversion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityKerucut extends AppCompatActivity {

    EditText radius, diameter, tinggi;
    TextView volume;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kerucut);

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
                double volumeKerucut;

                if(radius.getText().toString().trim().length() > 0 && diameter.getText().toString().trim().length() == 0 && tinggi.getText().toString().trim().length() > 0 ) {
                    double jari = Double.parseDouble(radius.getText().toString());
                    double tinggiKerucut = Double.parseDouble(tinggi.getText().toString());
                    volumeKerucut = 1.0 / 3.0 * (phi * jari * jari) * tinggiKerucut;
                    volume.setText(String.valueOf(String.format("%.2f", volumeKerucut)));

                }else if (diameter.getText().toString().trim().length() > 0 && radius.getText().toString().trim().length() == 0 && tinggi.getText().toString().trim().length() > 0 ){
                    double diameterAlas = Double.parseDouble(diameter.getText().toString());
                    double tinggiKerucut = Double.parseDouble(tinggi.getText().toString());
                    double setDiameter = 0.5 * diameterAlas;
                    volumeKerucut = 1.0 / 3.0 * (phi * setDiameter * setDiameter) * tinggiKerucut;

                    volume.setText(String.valueOf(String.format("%.2f", volumeKerucut)));

                }else if (radius.getText().toString().trim().length() > 0 && diameter.getText().toString().trim().length() > 0 || tinggi.getText().toString().trim().length() > 0 ) {
                    Toast.makeText(ActivityKerucut.this, "Isikan antara jari-jari atau diameter", Toast.LENGTH_SHORT).show();

                }else {
                    Toast.makeText(ActivityKerucut.this, "Kolom tidak boleh kosong", Toast.LENGTH_SHORT).show();
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
