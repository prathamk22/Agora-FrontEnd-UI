package com.example.agorafrontend.Fragments;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.agorafrontend.Activity.ElectionsActivity;
import com.example.agorafrontend.ElectionFragmentAdapter;
import com.example.agorafrontend.R;
import com.example.agorafrontend.databinding.FragmentElectionsBinding;

/**
 * A simple {@link Fragment} subclass.
 */
public class ElectionsFragment extends Fragment {

    public ElectionsFragment() {
        // Required empty public constructor
    }
    FragmentElectionsBinding binding;
    String state;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_elections, container, false);

        state = getArguments().getString("state");
        ElectionFragmentAdapter adapter = new ElectionFragmentAdapter(getContext(), state);
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        binding.recyclerView.setAdapter(adapter);
        if (state != null) {
            switch (state){
                case "ACTIVE" :
                    binding.title.setText("Active Elections");
                    break;
                case "TOTAL" :
                    binding.title.setText("Total Elections");
                    break;
                case "PENDING" :
                    binding.title.setText("Pending Elections");
                    break;
                case "FINISHED" :
                    binding.title.setText("Finished Elections");
                    break;
            }
        }

        return binding.getRoot();
    }
}
