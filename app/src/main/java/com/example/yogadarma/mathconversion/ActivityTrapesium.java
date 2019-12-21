package com.example.yogadarma.mathconversion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityTrapesium extends AppCompatActivity {

    EditText sisi1, sisi2, tinggi;
    TextView luas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trapesium);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        sisi1 = findViewById(R.id.etSisi1);
        sisi2 = findViewById(R.id.etSisi2);
        tinggi = findViewById(R.id.etTinggi);
        luas = findViewById(R.id.txtLuas);

        Button button = findViewById(R.id.btnHitung);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(sisi1.getText().toString().trim().length() > 0 && sisi2.getText().toString().trim().length() > 0 && tinggi.getText().toString().trim().length() > 0) {
                    double sejajar1 = Double.parseDouble(sisi1.getText().toString());
                    double sejajar2 = Double.parseDouble(sisi2.getText().toString());
                    double tinggiTrapesium = Double.parseDouble(tinggi.getText().toString());

                    double luasTrapesium = ((sejajar1 + sejajar2) * tinggiTrapesium) / 2;

                    luas.setText(String.valueOf(String.format("%.1f", luasTrapesium)));

                } else {
                    Toast.makeText(ActivityTrapesium.this, "Kolom tidak boleh kosong", Toast.LENGTH_SHORT).show();
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
