package com.asim.fragments;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class DashboardActivity extends AppCompatActivity {

    Button btnHome, btnProfile, btnSettings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        btnHome = findViewById(R.id.btn_home);
        btnProfile = findViewById(R.id.btn_profile);
        btnSettings = findViewById(R.id.btn_settings);

        if (savedInstanceState == null) {
            loadFragment(new HomeFragment());
        }

        btnHome.setOnClickListener(v -> loadFragment(new HomeFragment()));

        btnProfile.setOnClickListener(v -> loadFragment(new ProfileFragment()));

        btnSettings.setOnClickListener(v -> loadFragment(new SettingsFragment()));
    }

    private void loadFragment(Fragment fragment) {

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container, fragment)
                .commit();
    }
}
