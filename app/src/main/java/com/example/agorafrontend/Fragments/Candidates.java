package com.example.agorafrontend.Fragments;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.agorafrontend.Adapter;
import com.example.agorafrontend.CandidateAdapter;
import com.example.agorafrontend.R;
import com.example.agorafrontend.databinding.FragmentCandidatesBinding;

/**
 * A simple {@link Fragment} subclass.
 */
public class Candidates extends Fragment {

    public Candidates() {
        // Required empty public constructor
    }

    FragmentCandidatesBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_candidates, container, false);

        binding.back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().onBackPressed();
            }
        });
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        CandidateAdapter adapter = new CandidateAdapter(getContext());
        binding.recyclerView.setAdapter(adapter);

        binding.nextHolder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getFragmentManager().beginTransaction()
                        .addToBackStack(null)
                        .replace(R.id.addElectionFrameLayout, new VotingAlgorithm())
                        .commit();
            }
        });

        return binding.getRoot();
    }
}
