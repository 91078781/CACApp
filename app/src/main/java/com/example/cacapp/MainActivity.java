package com.example.cacapp;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.cacapp.ui.main.SectionsPagerAdapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);
        FloatingActionButton fab = findViewById(R.id.fab);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

   public void onClickGoToTaraCalicoScn(View view)
   {
       startActivity(new Intent(MainActivity.this, AboutTaraCalico.class));
   }

   public void onClickGoToAlexisTiaraMurphyScn(View view)
   {
       startActivity(new Intent(MainActivity.this, AboutAlexisTiaraMurphy.class));
   }

   public void onClickGoToAboutAminaAndBelelKandilScn(View view)
   {
       startActivity(new Intent(MainActivity.this, AboutAlexisTiaraMurphy.class));
   }

    public void onClickGoToAboutAmandaKayJonesScn(View view)
    {
        startActivity(new Intent(MainActivity.this, AboutAmandaKayJones.class));
    }

    public void onClickGoToAboutBreasia_TerrellScn(View view)
    {
        startActivity(new Intent(MainActivity.this, AboutBreasiaTerrell.class));
    }

    public void onClickGoToAboutCayceMcDanielScn(View view)
    {
        startActivity(new Intent(MainActivity.this, AboutCayceMcDaniel.class));
    }
}