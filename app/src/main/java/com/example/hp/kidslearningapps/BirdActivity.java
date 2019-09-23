package com.example.hp.kidslearningapps;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class BirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bird);

        ViewPager viewPager = findViewById(R.id.birdViewPagerId);
        BirdAdapter birdAdapter = new BirdAdapter(this);
        viewPager.setAdapter(birdAdapter);

    }
}
