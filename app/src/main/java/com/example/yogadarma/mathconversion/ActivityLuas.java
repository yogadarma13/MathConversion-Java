package com.example.yogadarma.mathconversion;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class ActivityLuas extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_luas, container, false);

    Button persegi = view.findViewById(R.id.btnPersegi);
        persegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ActivityPersegi.class);
                startActivity(intent);
            }
        });

        Button persegiPanjang = view.findViewById(R.id.btnPersegiPanjang);
        persegiPanjang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ActivityPersegiPanjang.class);
                startActivity(intent);
            }
        });

        Button segitiga = view.findViewById(R.id.btnSegitiga);
        segitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ActivitySegitiga.class);
                startActivity(intent);
            }
        });

        Button lingkaran = view.findViewById(R.id.btnLingkaran);
        lingkaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ActivityLingkaran.class);
                startActivity(intent);
            }
        });

        Button jajarGenjang = view.findViewById(R.id.btnJajar);
        jajarGenjang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ActivityJajarGenjang.class);
                startActivity(intent);
            }
        });

        Button belahKetupat = view.findViewById(R.id.btnKetupat);
        belahKetupat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ActivityKetupat.class);
                startActivity(intent);
            }
        });

        Button layang = view.findViewById(R.id.btnLayang);
        layang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ActivityLayang.class);
                startActivity(intent);
            }
        });

        Button trapesium = view.findViewById(R.id.btnTrapesium);
        trapesium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ActivityTrapesium.class);
                startActivity(intent);
            }
        });
        return view;
    }
}
