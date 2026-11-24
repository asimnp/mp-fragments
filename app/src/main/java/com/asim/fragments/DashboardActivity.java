package com.asim.fragments;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        if (savedInstanceState == null) {
            Fragment homeFragment = new HomeFragment();

            getSupportFragmentManager().beginTransaction().add(R.id.fragment_container, homeFragment).commit();
        }
    }
}