package com.example.agorafrontend.Fragments.ui.DashBoard;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.agorafrontend.Activity.AddElection;
import com.example.agorafrontend.Activity.ElectionsActivity;
import com.example.agorafrontend.Adapter;
import com.example.agorafrontend.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class DashboardFragment extends Fragment {

    private DashboardViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(DashboardViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        FloatingActionButton fab = root.findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), AddElection.class);
                startActivity(intent);
            }
        });
        LinearLayout total = root.findViewById(R.id.total_election);
        total.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), ElectionsActivity.class);
                startActivity(intent);
            }
        });
        LinearLayout pending = root.findViewById(R.id.pending_election);
        pending.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), ElectionsActivity.class);
                startActivity(intent);
            }
        });
        LinearLayout active = root.findViewById(R.id.active_election);
        active.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), ElectionsActivity.class);
                startActivity(intent);
            }
        });
        LinearLayout finished = root.findViewById(R.id.finished_election);
        finished.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), ElectionsActivity.class);
                startActivity(intent);
            }
        });
        RecyclerView recyclerView = root.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        Adapter adapter = new Adapter(getContext());
        recyclerView.setAdapter(adapter);

        return root;
    }
}
