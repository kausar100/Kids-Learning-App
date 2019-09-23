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


public class BirdAdapter extends PagerAdapter {

    private Context context;
    private TextToSpeech textToSpeech;
    private LayoutInflater layoutInflater;
    private Integer[]images = {R.drawable.bat,R.drawable.cock,R.drawable.crow,R.drawable.cuckoo,R.drawable.dove,R.drawable.drake,R.drawable.duck,R.drawable.eagle,R.drawable.falcon,R.drawable.flamingo,R.drawable.goose,R.drawable.hen,R.drawable.kingfisher,R.drawable.kite,R.drawable.magpie,R.drawable.martin,R.drawable.myna,R.drawable.ostrich,R.drawable.owl,R.drawable.parakeet,R.drawable.parrot,R.drawable.peacock,R.drawable.pigeon,R.drawable.sparrow,R.drawable.swallow};
    private String[] strings = {"Bat","Cock","Crow","Cuckoo","Dove","Drake","Duck","Eagle","Falcon","Flamingo","Goose","Hen","Kingfisher","Kite","Magpie","Martin","Myna","Ostrich","Owl","Parakeet","Parrot","Peacock","Pigeon","Sparrow","Swallow"};

    public BirdAdapter(Context context) {
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
        View view = layoutInflater.inflate(R.layout.activity_bird_adapter,container,false);
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
        TextView textView = view.findViewById(R.id.textId);
        imageView.setImageResource(images[position]);
        textView.setText(strings[position]);
        container.addView(view);
        return view;

    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.invalidate();
    }

}
