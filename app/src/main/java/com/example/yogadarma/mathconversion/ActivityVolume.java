package com.example.yogadarma.mathconversion;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class ActivityVolume extends Fragment{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_volume, container, false);

    Button kubus = view.findViewById(R.id.btnKubus);
        kubus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ActivityKubus.class);
                startActivity(intent);
            }
        });

        Button balok = view.findViewById(R.id.btnBalok);
        balok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ActivityBalok.class);
                startActivity(intent);
            }
        });

        Button bola = view.findViewById(R.id.btnBola);
        bola.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ActivityBola.class);
                startActivity(intent);
            }
        });

        Button silinder = view.findViewById(R.id.btnSilinder);
        silinder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ActivitySilinder.class);
                startActivity(intent);
            }
        });

        Button kerucut = view.findViewById(R.id.btnKerucut);
        kerucut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ActivityKerucut.class);
                startActivity(intent);
            }
        });

        Button limas = view.findViewById(R.id.btnLimas);
        limas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ActivityLimas.class);
                startActivity(intent);
            }
        });

        Button prisma = view.findViewById(R.id.btnPrisma);
        prisma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ActivityPrisma.class);
                startActivity(intent);
            }
        });

        return view;
    }
}
