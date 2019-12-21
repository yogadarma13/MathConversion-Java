package com.example.yogadarma.mathconversion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityLingkaran extends AppCompatActivity {

    EditText radius, diameter;
    TextView luas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lingkaran);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        radius = findViewById(R.id.etJari);
        diameter = findViewById(R.id.etDiameter);
        luas = findViewById(R.id.txtLuas);

        Button button = findViewById(R.id.btnHitung);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final double phi = 3.14285714286;
                double luasLingkaran;

                if(radius.getText().toString().trim().length() > 0 && diameter.getText().toString().trim().length() == 0) {
                    double jari = Double.parseDouble(radius.getText().toString());
                    luasLingkaran = phi * (jari * jari);
                    luas.setText(String.valueOf(String.format("%.2f", luasLingkaran)));

                }else if (diameter.getText().toString().trim().length() > 0 && radius.getText().toString().trim().length() == 0){
                    double diameterLingkaran = Double.parseDouble(diameter.getText().toString());
                    double setDiameter = 0.5 * diameterLingkaran;
                    luasLingkaran = phi * (setDiameter * setDiameter);
                    luas.setText(String.valueOf(String.format("%.2f", luasLingkaran)));

                }else if (radius.getText().toString().trim().length() > 0 && diameter.getText().toString().trim().length() > 0) {
                    Toast.makeText(ActivityLingkaran.this, "Isikan nilai antara jari-jari atau diameter", Toast.LENGTH_SHORT).show();

                }else {
                    Toast.makeText(ActivityLingkaran.this, "Kolom tidak boleh kosong", Toast.LENGTH_SHORT).show();
                    luas.setText("0");
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
