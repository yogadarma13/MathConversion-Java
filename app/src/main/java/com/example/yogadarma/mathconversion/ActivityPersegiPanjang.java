package com.example.yogadarma.mathconversion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityPersegiPanjang extends AppCompatActivity {

    EditText panjang;
    EditText lebar;
    TextView luas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi_panjang);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        panjang = findViewById(R.id.etPanjang);
        lebar = findViewById(R.id.etLebar);
        luas = findViewById(R.id.txtLuas);

        Button button = findViewById(R.id.btnHitung);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(panjang.getText().toString().trim().length() > 0 && lebar.getText().toString().trim().length() > 0) {
                    double pjg = Double.parseDouble(panjang.getText().toString());
                    double lbr = Double.parseDouble(lebar.getText().toString());
                    double luasPersegiPanjang = pjg * lbr;

                    luas.setText(String.valueOf(String.format("%.2f", luasPersegiPanjang)));
                } else {
                    Toast.makeText(ActivityPersegiPanjang.this, "Kolom tidak boleh kosong", Toast.LENGTH_SHORT).show();
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
