package com.example.hp.kidslearningapps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class CanvasActivity extends AppCompatActivity{
    CanvasView canvasView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        canvasView = new CanvasView(this,null);
        setContentView(canvasView);
    }

}
