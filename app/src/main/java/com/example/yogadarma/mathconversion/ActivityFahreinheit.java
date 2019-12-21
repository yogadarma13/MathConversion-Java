package com.example.yogadarma.mathconversion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityFahreinheit extends AppCompatActivity {

    EditText fahreinheit;
    TextView celcius, reamur, kelvin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fahreinheit);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        fahreinheit = findViewById(R.id.etFahreinheit);
        celcius = findViewById(R.id.txtCelcius);
        reamur = findViewById(R.id.txtReamur);
        kelvin = findViewById(R.id.txtKelvin);

        Button button = findViewById(R.id.btnConvert);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (fahreinheit.getText().toString().trim().length() > 0){
                    double fah = Double.parseDouble(fahreinheit.getText().toString());
                    double cel = 5.0 / 9.0 * (fah - 32);
                    double kel = ((fah - 32) / 1.8) + 273.15;
                    double rea = 4.0 / 9.0 * (fah - 32);
                    celcius.setText(String.valueOf(String.format("%.2f %s", cel, "°C")));
                    kelvin.setText(String.valueOf(String.format("%.2f %s", kel, "K")));
                    reamur.setText(String.valueOf(String.format("%.2f %s", rea, "R")));
                }else {
                    Toast.makeText(ActivityFahreinheit.this, "Masukkan angka", Toast.LENGTH_SHORT).show();
                    celcius.setText("0");
                    kelvin.setText("0");
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
