package com.example.cacapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class AboutAmandaKayJones extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_amanda_kay_jones);
    }
    public void onClickReturnToMissingPeopleScn_AmandaJones(View view)
    {
        finish();
    }

}