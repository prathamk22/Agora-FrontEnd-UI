package com.example.agorafrontend.Fragments;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.agorafrontend.R;
import com.example.agorafrontend.databinding.FragmentLandingBinding;

/**
 * A simple {@link Fragment} subclass.
 */
public class LandingFragment extends Fragment {

    public LandingFragment() {
        // Required empty public constructor
    }

    FragmentLandingBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_landing, container, false);

        binding.login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getFragmentManager().beginTransaction()
                        .addToBackStack(null)
                        .replace(R.id.frameLayout, new LoginFragment())
                        .commit();
            }
        });

        binding.signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getFragmentManager().beginTransaction()
                        .addToBackStack(null)
                        .replace(R.id.frameLayout, new SignUpFragment())
                        .commit();
            }
        });

        return binding.getRoot();
    }
}
