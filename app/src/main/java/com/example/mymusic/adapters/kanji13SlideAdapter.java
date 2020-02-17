package com.example.mymusic.adapters;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.example.mymusic.R;

public class kanji13SlideAdapter extends PagerAdapter {
    Context kanji13context;
    LayoutInflater kanji13inflater;

    //list of lessons

    public String[] kanji13Text = {
            "一",
            "二",
            "三",
            "四",
            "五",
            "六",
            "七",
            "八",
            "九",
            "十",
    };

    public String[] kanji13ListTitles = {
            "いち\n" +
                    "এক",
            "に\n" +
                    "দুই",
            "さん\n" +
                    "তিন",
            "よん・し\n" +
                    "চার",
            "ご\n" +
                    "পাঁচ",
            "ろく\n" +
                    "ছয়",
            "なな・しち\n" +
                    "সাত",
            "はち\n" +
                    "আট",
            "きゅう・く\n" +
                    "নয়",
            "じゅう・じゅ\n" +
                    "দশ",
    };
    public String[] kanji13ListDescription = {
            "いまは一時です。\n" +
                    "এখন সময় ১ টা।",
            "いまは二時です。\n" +
                    "এখন সময় ২ টা।",
            "いまは三時です。\n" +
                    "এখন সময় ৩ টা।",
            "いまは四時です。\n" +
                    "এখন সময় ৪ টা।",
            "いまは五時です。\n" +
                    "এখন সময় ৫ টা।",
            "いまは六時です。\n" +
                    "এখন সময় ৬ টা।",
            "いまは七時です。\n" +
                    "এখন সময় ৭ টা।",
            "いまは八じです。\n" +
                    "এখন সময় ৮ টা।",
            "いまは九時です。\n" +
                    "এখন সময় ৯ টা।",
            "いまは十時です。\n" +
                    "এখন সময় ১০ টা।",
    };

    public int[] kanji13Background = {
            Color.rgb(245, 255, 250),
            Color.rgb(245, 255, 250),
            Color.rgb(245, 255, 250),
            Color.rgb(245, 255, 250),
            Color.rgb(245, 255, 250),
            Color.rgb(245, 255, 250),
            Color.rgb(245, 255, 250),
            Color.rgb(245, 255, 250),
            Color.rgb(245, 255, 250),
            Color.rgb(245, 255, 250),

    };

    public kanji13SlideAdapter(Context context) {
        this.kanji13context = context;
    }


    @Override
    public int getCount() {
        return kanji13ListTitles.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return (view == (LinearLayout) object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        kanji13inflater = (LayoutInflater) kanji13context.getSystemService(kanji13context.LAYOUT_INFLATER_SERVICE);
        View view = kanji13inflater.inflate(R.layout.kanji13_slide, container, false);
        LinearLayout kanji13LayoutSlide = view.findViewById(R.id.kanji13SlideLinearLayout);
        TextView kanji13TextView = view.findViewById(R.id.kanji13SlideText);
        TextView kanji13TitleTextView = view.findViewById(R.id.kanji13SlideTextViewId);
        TextView kanji13DescriptionTextView = view.findViewById(R.id.kanji13TextDescriptionId);
        kanji13LayoutSlide.setBackgroundColor(kanji13Background[position]);
        kanji13TextView.setText(kanji13Text[position]);
        kanji13TitleTextView.setText(kanji13ListTitles[position]);
        kanji13DescriptionTextView.setText(kanji13ListDescription[position]);
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((LinearLayout) object);
    }
}
