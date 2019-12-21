package com.example.yogadarma.mathconversion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityKubus extends AppCompatActivity {

    EditText rusuk;
    TextView volume;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kubus);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        rusuk = findViewById(R.id.etRusuk);
        volume = findViewById(R.id.txtVolume);

        Button button = findViewById(R.id.btnHitung);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rusuk.getText().toString().trim().length() > 0) {
                    double rusukKubus = Double.parseDouble(rusuk.getText().toString());
                    double volumeKubus = rusukKubus * rusukKubus * rusukKubus;

                    volume.setText(String.valueOf(String.format("%.1f", volumeKubus)));
                } else {
                    Toast.makeText(ActivityKubus.this, "Masukkan angka", Toast.LENGTH_SHORT).show();
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
