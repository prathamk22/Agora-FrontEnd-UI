package com.example.agorafrontend.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.agorafrontend.R;

public class SplashScreen extends Fragment {

    public SplashScreen() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        new CountDownTimer(2000, 1000) {
            @Override
            public void onTick(long l) {

            }

            @Override
            public void onFinish() {
                getFragmentManager().beginTransaction()
                        .replace(R.id.frameLayout, new LandingFragment())
                        .commit();
            }
        }.start();

        return inflater.inflate(R.layout.fragment_splash_screen, container, false);
    }
}
