package com.example.yogadarma.mathconversion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityKelvin extends AppCompatActivity {

    EditText kelvin;
    TextView celcius, fahreinheit, reamur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kelvin);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        kelvin = findViewById(R.id.etKelvin);
        celcius = findViewById(R.id.txtCelcius);
        fahreinheit = findViewById(R.id.txtFahreinheit);
        reamur = findViewById(R.id.txtReamur);

        Button button = findViewById(R.id.btnConvert);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (kelvin.getText().toString().trim().length() > 0){
                    double kel = Double.parseDouble(kelvin.getText().toString());
                    double cel = kel - 273.15;
                    double fah = 1.8 * (kel - 273.15) + 32;
                    double rea = 4.0 / 5.0 * (kel - 273.15);

                    celcius.setText(String.valueOf(String.format("%.2f %s", cel, "°C")));
                    fahreinheit.setText(String.valueOf(String.format("%.2f %s", fah, "F")));
                    reamur.setText(String.valueOf(String.format("%.2f %s", rea, "R")));

                }else {
                    Toast.makeText(ActivityKelvin.this, "Masukkan angka", Toast.LENGTH_SHORT).show();
                    celcius.setText("0");
                    fahreinheit.setText("0");
                    reamur.setText("0");
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
