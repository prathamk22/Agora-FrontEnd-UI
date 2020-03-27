package com.example.agorafrontend.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.MenuItem;

import com.example.agorafrontend.Fragments.ElectionsFragment;
import com.example.agorafrontend.R;
import com.example.agorafrontend.databinding.ActivityElectionsBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class ElectionsActivity extends AppCompatActivity {

    ActivityElectionsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_elections);

        final ElectionsFragment electionsFragment = new ElectionsFragment();
        Bundle bundle = new Bundle();
        bundle.putString("state", String.valueOf(STATE.TOTAL));
        electionsFragment.setArguments(bundle);
        binding.navigationView.setSelectedItemId(R.id.total_election);
        getSupportFragmentManager().beginTransaction()
                .add(R.id.ElectionsframeLayout, electionsFragment)
                .commit();
        binding.navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Bundle bundle = new Bundle();
                switch (item.getItemId()){
                    case R.id.total_election:
                        bundle.putString("state", String.valueOf(STATE.TOTAL));
                        break;
                    case R.id.active_election:
                        bundle.putString("state", String.valueOf(STATE.ACTIVE));
                        break;
                    case R.id.finished_election:
                        bundle.putString("state", String.valueOf(STATE.FINISHED));
                        break;
                    case R.id.pending_election:
                        bundle.putString("state", String.valueOf(STATE.PENDING));
                        break;
                }
                ElectionsFragment electionsFragment1 = new ElectionsFragment();
                electionsFragment1.setArguments(bundle);
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.ElectionsframeLayout, electionsFragment1)
                        .commit();

                return true;
            }
        });
    }

    public enum STATE{
        TOTAL , FINISHED , ACTIVE , PENDING ;
    }
}
