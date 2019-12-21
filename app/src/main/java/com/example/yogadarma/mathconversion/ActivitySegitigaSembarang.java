package com.example.yogadarma.mathconversion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ActivitySegitigaSembarang extends AppCompatActivity {

    EditText nilai1, nilai2, nilai3;
    TextView luas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga_sembarang);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        nilai1 = findViewById(R.id.etNilai1);
        nilai2 = findViewById(R.id.etNilai2);
        nilai3 = findViewById(R.id.etNilai3);
        luas = findViewById(R.id.txtLuas);

        Button button = findViewById(R.id.btnHitung);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(nilai1.getText().toString().trim().length() > 0 && nilai2.getText().toString().trim().length() > 0 && nilai3.getText().toString().trim().length() > 0) {
                    double a = Double.parseDouble(nilai1.getText().toString());
                    double b = Double.parseDouble(nilai2.getText().toString());
                    double c = Double.parseDouble(nilai3.getText().toString());

                    double s = (0.5) * (a + b + c);
                    double luasSegitiga = Math.sqrt((s * (s - a) * (s - b) * (s - c)));

                    luas.setText(String.valueOf(String.format("%.2f", luasSegitiga)));

                } else {
                    Toast.makeText(ActivitySegitigaSembarang.this, "Kolom tidak boleh kosong", Toast.LENGTH_SHORT).show();
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
