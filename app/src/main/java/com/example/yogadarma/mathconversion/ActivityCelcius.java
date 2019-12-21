package com.example.yogadarma.mathconversion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityCelcius extends AppCompatActivity {

    EditText celcius;
    TextView fahreinheit, reamur, kelvin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_celcius);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        celcius = findViewById(R.id.etCelcius);
        fahreinheit = findViewById(R.id.txtFahreinheit);
        reamur = findViewById(R.id.txtReamur);
        kelvin = findViewById(R.id.txtKelvin);

        Button button = findViewById(R.id.btnConvert);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (celcius.getText().toString().trim().length() > 0) {
                    double cel = Double.parseDouble(celcius.getText().toString());
                    double fah = (9.0 / 5.0 * cel) + 32;
                    double kel = cel + 273.15;
                    double rea = 4.0 / 5.0 * cel;

                    fahreinheit.setText(String.valueOf(String.format("%.2f %s", fah, "F")));
                    kelvin.setText(String.valueOf(String.format("%.2f %s", kel, "K")));
                    reamur.setText(String.valueOf(String.format("%.2f %s", rea, "R")));
                }else {
                    Toast.makeText(ActivityCelcius.this, "Masukkan angka", Toast.LENGTH_SHORT).show();
                    fahreinheit.setText("0");
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
