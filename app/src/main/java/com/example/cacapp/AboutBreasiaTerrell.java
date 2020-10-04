package com.example.cacapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class AboutBreasiaTerrell extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_breasia_terrell);
    }

    public void onClickReturnToMissingPeopleScn_BreasiaTerrell(View view)
    {
        finish();
    }
}