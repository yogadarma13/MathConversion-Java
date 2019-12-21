package com.example.yogadarma.mathconversion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ActivitySamaKaki extends AppCompatActivity {

    EditText alas, kaki;
    TextView luas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sama_kaki);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        alas = findViewById(R.id.etAlas);
        kaki = findViewById(R.id.etKaki);
        luas = findViewById(R.id.txtLuas);

        Button button = findViewById(R.id.btnHitung);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(alas.getText().toString().trim().length() > 0 && kaki.getText().toString().trim().length() > 0) {
                    double alasSegitiga = Double.parseDouble(alas.getText().toString());
                    double kakiSegitiga = Double.parseDouble(kaki.getText().toString());

                    double setengahAlas = alasSegitiga / 2;
                    double tinggi = Math.sqrt((kakiSegitiga * kakiSegitiga) - (setengahAlas * setengahAlas));
                    double luasSegitiga = 0.5 * alasSegitiga * tinggi;

                    luas.setText(String.valueOf(String.format("%.2f", luasSegitiga)));

                } else {
                    Toast.makeText(ActivitySamaKaki.this, "Kolom tidak boleh kosong", Toast.LENGTH_SHORT).show();
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
