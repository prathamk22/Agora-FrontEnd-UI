package com.example.agorafrontend.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.agorafrontend.Activity.HomePage;
import com.example.agorafrontend.R;
import com.example.agorafrontend.databinding.FragmentForgotBinding;

/**
 * A simple {@link Fragment} subclass.
 */
public class ForgotFragment extends Fragment {

    public ForgotFragment() {
        // Required empty public constructor
    }

    FragmentForgotBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_forgot, container, false);

        binding.continueBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), HomePage.class);
                startActivity(intent);
                getActivity().finish();
            }
        });

        return binding.getRoot();
    }
}
