package com.example.cacapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class AboutMargaretEllenFox extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_margaret_ellen_fox);
    }

    public void onClickReturnToMissingPeopleScn_margaretEllenFox(View view)
    {
        finish();
    }
}