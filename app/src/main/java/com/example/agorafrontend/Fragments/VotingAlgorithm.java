package com.example.agorafrontend.Fragments;

import android.os.Bundle;

import androidx.appcompat.app.AlertDialog;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.agorafrontend.R;
import com.example.agorafrontend.databinding.FragmentVotingAlgorithmBinding;

/**
 * A simple {@link Fragment} subclass.
 */
public class VotingAlgorithm extends Fragment {

    public VotingAlgorithm() {
        // Required empty public constructor
    }

    FragmentVotingAlgorithmBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_voting_algorithm, container, false);

        binding.nextHolder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LayoutInflater factory = LayoutInflater.from(getContext());
                final View deleteDialogView = factory.inflate(R.layout.custom_dialog_box, null);
                final AlertDialog deleteDialog = new AlertDialog.Builder(getContext()).create();
                deleteDialog.setView(deleteDialogView);
                deleteDialogView.findViewById(R.id.yes).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        getActivity().finish();
                        deleteDialog.dismiss();
                    }
                });
                deleteDialogView.findViewById(R.id.no).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        deleteDialog.dismiss();
                    }
                });

                deleteDialog.show();
            }
        });

        return binding.getRoot();
    }
}
