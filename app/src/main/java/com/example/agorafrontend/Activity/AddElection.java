package com.example.agorafrontend.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.agorafrontend.Fragments.AddElectionHead;
import com.example.agorafrontend.R;

public class AddElection extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_election);

        getSupportFragmentManager().beginTransaction()
                .add(R.id.addElectionFrameLayout, new AddElectionHead())
                .commit();
    }
}
