package com.example.agorafrontend.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.agorafrontend.Fragments.SplashScreen;
import com.example.agorafrontend.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction()
                .add(R.id.frameLayout, new SplashScreen())
                .commit();

    }
}
