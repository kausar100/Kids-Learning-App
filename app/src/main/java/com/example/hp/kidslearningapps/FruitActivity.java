package com.example.hp.kidslearningapps;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class FruitActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruit);

        ViewPager viewPager = findViewById(R.id.fruitViewPagerId);
        FruitAdapter fruitAdapter = new FruitAdapter(this);
        viewPager.setAdapter(fruitAdapter);

    }
}
