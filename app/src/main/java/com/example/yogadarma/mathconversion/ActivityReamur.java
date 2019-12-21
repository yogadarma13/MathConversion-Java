package com.example.yogadarma.mathconversion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityReamur extends AppCompatActivity {

    EditText reamur;
    TextView celcius, fahreinheit, kelvin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reamur);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        reamur = findViewById(R.id.etReamur);
        celcius = findViewById(R.id.txtCelcius);
        fahreinheit = findViewById(R.id.txtFahreinheit);
        kelvin = findViewById(R.id.txtKelvin);

        Button button = findViewById(R.id.btnConvert);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (reamur.getText().toString().trim().length() > 0){
                    double rea = Double.parseDouble(reamur.getText().toString());
                    double cel = 5.0 / 4.0 * rea;
                    double fah = (9.0 / 4.0 * rea) + 32;
                    double kel = (5.0 / 4.0 * rea) + 273.15;

                    celcius.setText(String.valueOf(String.format("%.2f %s", cel, "°C")));
                    fahreinheit.setText(String.valueOf(String.format("%.2f %s", fah, "F")));
                    kelvin.setText(String.valueOf(String.format("%.2f %s",kel, "K")));
                }else {
                    Toast.makeText(ActivityReamur.this, "Masukkan angka", Toast.LENGTH_SHORT).show();
                    celcius.setText("0");
                    fahreinheit.setText("0");
                    kelvin.setText("0");
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
