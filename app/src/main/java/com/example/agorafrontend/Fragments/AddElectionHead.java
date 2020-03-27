package com.example.agorafrontend.Fragments;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.agorafrontend.R;
import com.example.agorafrontend.databinding.FragmentAddElectionHeadBinding;

/**
 * A simple {@link Fragment} subclass.
 */
public class AddElectionHead extends Fragment {

    public AddElectionHead() {
        // Required empty public constructor
    }

    FragmentAddElectionHeadBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_add_election_head, container, false);

        binding.nextHolder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getFragmentManager().beginTransaction()
                        .addToBackStack(null)
                        .replace(R.id.addElectionFrameLayout, new Candidates())
                        .commit();
            }
        });

        return binding.getRoot();
    }
}
