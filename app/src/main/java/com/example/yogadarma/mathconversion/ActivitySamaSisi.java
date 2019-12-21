package com.example.yogadarma.mathconversion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ActivitySamaSisi extends AppCompatActivity {

    EditText sisi;
    TextView luas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sama_sisi);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        sisi = findViewById(R.id.etSisi);
        luas = findViewById(R.id.txtLuas);

        Button button = findViewById(R.id.btnHitung);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(sisi.getText().toString().trim().length() > 0) {
                    double sisiSegitiga = Double.parseDouble(sisi.getText().toString());
                    double luasSegitiga = (sisiSegitiga * sisiSegitiga) / 4 * Math.sqrt(3);

                    luas.setText(String.valueOf(String.format("%.2f", luasSegitiga)));
                }else {
                    Toast.makeText(ActivitySamaSisi.this, "Masukkan angka", Toast.LENGTH_SHORT).show();
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
