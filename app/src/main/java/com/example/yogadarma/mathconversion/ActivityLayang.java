package com.example.yogadarma.mathconversion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityLayang extends AppCompatActivity {

    EditText diagonal1, diagonal2;
    TextView luas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layang);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        diagonal1 = findViewById(R.id.etDiagonal1);
        diagonal2 = findViewById(R.id.etDiagonal2);
        luas = findViewById(R.id.txtLuas);

        Button button = findViewById(R.id.btnHitung);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(diagonal1.getText().toString().trim().length() > 0 && diagonal2.getText().toString().trim().length() > 0) {
                    double diagonalKetupat1 = Double.parseDouble(diagonal1.getText().toString());
                    double diagonalKetupat2 = Double.parseDouble(diagonal2.getText().toString());
                    double luasLayang = 0.5 * diagonalKetupat1 * diagonalKetupat2;

                    luas.setText(String.valueOf(String.format("%.2f", luasLayang)));
                } else {
                    Toast.makeText(ActivityLayang.this, "Kolom tidak boleh kosong", Toast.LENGTH_SHORT).show();
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
