package com.example.hp.kidslearningapps;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class FlowerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flower);

        ViewPager viewPager = findViewById(R.id.flowerViewPagerId);
        FlowerAdapter flowerAdapter = new FlowerAdapter(this);
        viewPager.setAdapter(flowerAdapter);

    }
}
