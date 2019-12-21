package com.example.yogadarma.mathconversion;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class ActivitySuhu extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_suhu, container, false);

        Button celcius = view.findViewById(R.id.btnCelcius);
        celcius.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ActivityCelcius.class);
                startActivity(intent);
            }
        });

        Button fahreinheit = view.findViewById(R.id.btnFahreinheit);
        fahreinheit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ActivityFahreinheit.class);
                startActivity(intent);
            }
        });

        Button kelvin = view.findViewById(R.id.btnKelvin);
        kelvin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ActivityKelvin.class);
                startActivity(intent);
            }
        });

        Button reamur = view.findViewById(R.id.btnReamur);
        reamur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ActivityReamur.class);
                startActivity(intent);
            }
        });
        return view;
    }
}
