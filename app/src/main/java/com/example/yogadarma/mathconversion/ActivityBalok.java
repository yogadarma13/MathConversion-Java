package com.example.yogadarma.mathconversion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityBalok extends AppCompatActivity {

    EditText panjang, lebar, tinggi;
    TextView volume;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balok);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        panjang = findViewById(R.id.etPanjang);
        lebar = findViewById(R.id.etLebar);
        tinggi = findViewById(R.id.etTinggi);
        volume = findViewById(R.id.txtVolume);

        Button button = findViewById(R.id.btnHitung);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(panjang.getText().toString().trim().length() > 0 && lebar.getText().toString().trim().length() > 0 && tinggi.getText().toString().trim().length() > 0) {
                    double panjangBalok = Double.parseDouble(panjang.getText().toString());
                    double lebarBalok = Double.parseDouble(lebar.getText().toString());
                    double tinggiBalok = Double.parseDouble(tinggi.getText().toString());
                    double volumeBalok = panjangBalok * lebarBalok * tinggiBalok;

                    volume.setText(String.valueOf(String.format("%.1f", volumeBalok)));

                }else {
                    Toast.makeText(ActivityBalok.this, "Kolom tidak boleh kosong", Toast.LENGTH_SHORT).show();
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
