package com.example.hp.kidslearningapps;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class AnimalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal);

        ViewPager viewPager = findViewById(R.id.animalViewPagerId);
        AnimalAdapter animalAdapter = new AnimalAdapter(this);
        viewPager.setAdapter(animalAdapter);

    }
}
