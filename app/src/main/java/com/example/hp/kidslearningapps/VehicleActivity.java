package com.example.hp.kidslearningapps;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class VehicleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vehicle);

        ViewPager viewPager = findViewById(R.id.vehicleViewPagerId);
        VehicleAdapter vehicleAdapter = new VehicleAdapter(this);
        viewPager.setAdapter(vehicleAdapter);

    }
}
