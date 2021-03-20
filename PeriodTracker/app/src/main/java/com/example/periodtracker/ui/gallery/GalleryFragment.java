package com.example.periodtracker.ui.gallery;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.periodtracker.R;
import com.example.periodtracker.graph;

public class GalleryFragment extends Fragment {

    private GalleryViewModel galleryViewModel;
    ImageView happy;
    ImageView unhappy;
    ImageView mad;
    ImageView angry;
    ImageView crying;
    ImageView bored;
    ImageView confused;
    ImageView ill;
    ImageView inlove;
    int score;
    Button graphhh;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        galleryViewModel =
                ViewModelProviders.of(this).get(GalleryViewModel.class);
        View root = inflater.inflate(R.layout.fragment_gallery, container, false);

        happy = root.findViewById(R.id.happy);
        happy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score = 10;
                Log.d("happy",score+"");
            }
        });

        unhappy = root.findViewById(R.id.unhappy);
        unhappy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score = 5;
                Log.d("unhappy",score+"");
            }
        });

        mad = root.findViewById(R.id.mad);
        mad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score = 2;
                Log.d("mad",score+"");
            }
        });

        angry = root.findViewById(R.id.angry);
        angry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score = 1;
                Log.d("angry",score+"");
            }
        });

        bored = root.findViewById(R.id.bored);
        bored.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score = 7;
                Log.d("bored",score+"");
            }
        });

        crying = root.findViewById(R.id.crying);
        crying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score = 4;
                Log.d("crying",score+"");
            }
        });

        inlove = root.findViewById(R.id.inlove);
        inlove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score = 9;
                Log.d("inlove",score+"");
            }
        });

        ill = root.findViewById(R.id.ill);
        ill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score = 3;
                Log.d("ill",score+"");
            }
        });

        confused = root.findViewById(R.id.confused);
        confused.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score = 8;
                Log.d("confused",score+"");
            }
        });

        graphhh = root.findViewById(R.id.graph);
        graphhh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent homeIntent= new Intent(new Intent(GalleryFragment.this.getActivity(), graph.class));
                startActivity(homeIntent);
            }
        });


        return root;
    }
}