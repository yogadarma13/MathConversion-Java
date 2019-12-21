package com.example.yogadarma.mathconversion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityJajarGenjang extends AppCompatActivity {

    EditText alas, tinggi;
    TextView luas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jajar_genjang);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        alas = findViewById(R.id.etAlas);
        tinggi = findViewById(R.id.etTinggi);
        luas = findViewById(R.id.txtLuas);

        Button button = findViewById(R.id.btnHitung);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(alas.getText().toString().trim().length() > 0 && tinggi.getText().toString().trim().length() > 0) {
                    double alasJajar = Double.parseDouble(alas.getText().toString());
                    double tinggiJajar = Double.parseDouble(tinggi.getText().toString());

                    double luasJajar = alasJajar * tinggiJajar;
                    luas.setText(String.valueOf(String.format("%.1f", luasJajar)));

                } else {
                    Toast.makeText(ActivityJajarGenjang.this, "Kolom tidak boleh kosong", Toast.LENGTH_SHORT).show();
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
