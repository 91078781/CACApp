package com.example.cacapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class AboutDulceMariaAlavez extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_dulce_maria_alavez);
    }

    public void onClickReturnToMissingPeopleScn_dulceMariaAlavez(View view)
    {
        finish();
    }
}