package com.example.hp.kidslearningapps;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView animals, birds, fruits, flowers, vehicle, canvas,capitalLetters, smallLetters;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        animals = findViewById(R.id.animalsId);
        birds = findViewById(R.id.birdsId);
        fruits = findViewById(R.id.fruitsId);
        flowers = findViewById(R.id.flowersId);
        vehicle = findViewById(R.id.vehicleId);
        canvas = findViewById(R.id.canvasId);
        capitalLetters = findViewById(R.id.capitalLetterId);
        smallLetters = findViewById(R.id.smallLetterId);

        animals.setOnClickListener(this);
        birds.setOnClickListener(this);
        fruits.setOnClickListener(this);
        flowers.setOnClickListener(this);
        vehicle.setOnClickListener(this);
        canvas.setOnClickListener(this);
        capitalLetters.setOnClickListener(this);
        smallLetters.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.animalsId)
        {
            Intent intent1 = new Intent(MainActivity.this,AnimalActivity.class);
            startActivity(intent1);
        }
        else if(v.getId()==R.id.birdsId)
        {
            Intent intent2 = new Intent(MainActivity.this,BirdActivity.class);
            startActivity(intent2);
        }
        else if(v.getId()==R.id.fruitsId)
        {
            Intent intent3 = new Intent(MainActivity.this,FruitActivity.class);
            startActivity(intent3);
        }
        else if(v.getId()==R.id.flowersId)
        {
            Intent intent4 = new Intent(MainActivity.this,FlowerActivity.class);
            startActivity(intent4);
        }
        else if(v.getId()==R.id.vehicleId)
        {
            Intent intent5 = new Intent(MainActivity.this,VehicleActivity.class);
            startActivity(intent5);
        }
        else if(v.getId()==R.id.canvasId)
        {
            Intent intent6 = new Intent(MainActivity.this,CanvasActivity.class);
            startActivity(intent6);
        }
        else if(v.getId()==R.id.capitalLetterId)
        {
            Intent intent7 = new Intent(MainActivity.this,CapitalLetterActivity.class);
            startActivity(intent7);
        }
        else if(v.getId()==R.id.smallLetterId)
        {
            Intent intent8 = new Intent(MainActivity.this,NumberActivity.class);
            startActivity(intent8);
        }
    }

    @Override
    public void onBackPressed() {

        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
        alertDialogBuilder.setCancelable(false);
        alertDialogBuilder.setMessage(R.string.exit);

        alertDialogBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        alertDialogBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        alertDialogBuilder.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();

    }
}
