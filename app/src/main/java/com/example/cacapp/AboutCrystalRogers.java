package com.example.cacapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class AboutCrystalRogers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_crystal_rogers);
    }

    public void onClickReturnToMissingPeopleScn_crystalRogers(View view)
    {
        finish();
    }
}