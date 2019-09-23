package com.example.hp.kidslearningapps;

import android.content.Context;
import android.speech.tts.TextToSpeech;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Locale;


public class CapitalLetterAdapter extends PagerAdapter {

    private Context context;
    private TextToSpeech textToSpeech;
    private LayoutInflater layoutInflater;
    private Integer[]images = {R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d,R.drawable.e,R.drawable.f,R.drawable.g,R.drawable.h,R.drawable.i,R.drawable.j,R.drawable.k,R.drawable.l,R.drawable.m,R.drawable.n,R.drawable.o,R.drawable.p,R.drawable.q,R.drawable.r,R.drawable.s,R.drawable.t,R.drawable.u,R.drawable.v,R.drawable.w,R.drawable.x,R.drawable.y,R.drawable.z};
    private String[] strings = {"a for apple","b for ball","c for Cow","d for Dog","e for Elephant","f for Fish","g for Grape","h for Home","i for ice cream","j for jaguar","k for kangaroo","l for lion","m for Monkey","n for nest","o for Owl","p for Panda","q for queen","r for rat","s for ship","t for tiger","u for umbrella","v for van","w for worm","x for x ray","y for yacht","z for zebra"};

    public CapitalLetterAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, final int position) {
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.activity_capital_letter_adapter,container,false);
        final ImageView imageView = view.findViewById(R.id.imageViewId);
        textToSpeech = new TextToSpeech(context, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if(status!=TextToSpeech.ERROR)
                    textToSpeech.setLanguage(Locale.ENGLISH);
            }
        });
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.speak(strings[position],TextToSpeech.QUEUE_FLUSH,null);
            }
        });

        imageView.setImageResource(images[position]);
        container.addView(view);
        return view;

    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.invalidate();
    }

}
