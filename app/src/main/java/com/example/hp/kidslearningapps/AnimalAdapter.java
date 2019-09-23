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


public class AnimalAdapter extends PagerAdapter {

    private Context context;
    private TextToSpeech textToSpeech;
    private LayoutInflater layoutInflater;
    private Integer[]images ={R.drawable.bear,R.drawable.buffalo,R.drawable.camel,R.drawable.cat,R.drawable.chameleon,R.drawable.chimpanzee,R.drawable.cow,R.drawable.crocodile,R.drawable.deer,R.drawable.dog,R.drawable.donkey,R.drawable.elephant,R.drawable.fox,R.drawable.giraffe,R.drawable.goat,R.drawable.gorilla,R.drawable.hippopotamus,R.drawable.horse,R.drawable.jackal,R.drawable.lion,R.drawable.lizard,R.drawable.monkey,R.drawable.mouse,R.drawable.ox,R.drawable.pig,R.drawable.polar_bear,R.drawable.rabbit,R.drawable.sheep,R.drawable.snake,R.drawable.squirrel,R.drawable.tiger,R.drawable.turtle,R.drawable.wolf,R.drawable.zebra};
    private String[] strings = {"Bear","Buffalo","Camel","Cat","Chameleon","Chimpanzee","Cow","Crocodile","Deer","Dog","Donkey","Elephant","Fox","Giraffe","Goat","Gorilla","Hippopotamus","Horse","Jackal","Lion","Lizard","Monkey","Mouse","Ox","Pig","Polar Bear","Rabbit","Sheep","Snake","Squirrel","Tiger","Turtle","Wolf","Zebra"};

    public AnimalAdapter(Context context) {
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
        View view = layoutInflater.inflate(R.layout.activity_animal_adapter,container,false);
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
