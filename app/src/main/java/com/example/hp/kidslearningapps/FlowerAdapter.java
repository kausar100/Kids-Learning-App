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


public class FlowerAdapter extends PagerAdapter {

    private Context context;
    private TextToSpeech textToSpeech;
    private LayoutInflater layoutInflater;
    private Integer[]images ={R.drawable.bastard_teak,R.drawable.blossom,R.drawable.chaina_rose,R.drawable.chameli,R.drawable.champak,R.drawable.gardenia,R.drawable.jessamine,R.drawable.loly,R.drawable.lotus,R.drawable.marigold,R.drawable.oleander,R.drawable.petal,R.drawable.rose,R.drawable.screwpine, R.drawable.tulip};
    private String[] strings = {"Bastard Teak", "Blossom", "Chaina Rose", "Chameli","Champak", "Gardenia", "Jessamine", "Loly", "Lotus", "Marigold", "Oleander", "Petal", "Rose","Screwpine", "Tulip"};

    public FlowerAdapter(Context context) {
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
        View view = layoutInflater.inflate(R.layout.activity_flower_adapter,container,false);
        final ImageView imageView = view.findViewById(R.id.imageViewId);
        textToSpeech = new TextToSpeech(context, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR)
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
