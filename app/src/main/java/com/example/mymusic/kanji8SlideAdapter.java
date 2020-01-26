package com.example.mymusic;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class kanji8SlideAdapter extends PagerAdapter {
    Context kanji08context;
    LayoutInflater kanji08inflater;

    //list of lessons

    public String[] kanji08Text = {
            "多い",
            "少し",
            "古い",
            "新しい",
            "大きい",
            "小さい",
            "安い",
            "高い",
            "長い",
            "白い",
    };

    public String[] kanji08ListTitles = {
            "おおい\n" +
                    "বেশি",
            "すこし\n" +
                    "অল্প",
            "ふるい\n" +
                    "পুরাতন",
            "あたらしい\n" +
                    "নতুন",
            "おおきい\n" +
                    "বড়",
            "ちいさい\n" +
                    "ছোট",
            "やすい\n" +
                    "সস্তা",
            "たかい\n" +
                    "দামি",
            "ながい\n" +
                    "লম্বা",
            "しろい\n" +
                    "সাদা",
    } ;
    public String[] kanji08ListDescription = {
            "ひとが多いです。\n" +
                    "লোক বেশি।",
            "少しねます。\n" +
                    "অল্প ঘুমাব।",
            "これは古いたてものです。\n" +
                    "এটা পুরাতন বিল্ডিং।",
            "このたてものは新しいです。\n" +
                    "এই বিল্ডিংটা নতুন।",
            "ならは大きいまちです。\n" +
                    "নারা বড় শহর।",
            "ダッカは小さいまちです\n" +
                    "ঢাকা ছোট শহর।",
            "バングラデシュのたべものは安いです。\n" +
                    "বাংলাদেশের খাবার সস্তা।",
            "あの人はだれですか。\n" +
                    "ঐ লোকটি কে?",
            "かのじょのかみは長いです。\n" +
                    "মেয়ের চুল লম্বা।",
            "白いたてものはなんのかいしゃですか。\n" +
                    "সাদা বিল্ডিংটা কিসের কোম্পানি ।",
    } ;

    public int[] kanji08Background = {
            Color.rgb(245,255,250),
            Color.rgb(245,255,250),
            Color.rgb(245,255,250),
            Color.rgb(245,255,250),
            Color.rgb(245,255,250),
            Color.rgb(245,255,250),
            Color.rgb(245,255,250),
            Color.rgb(245,255,250),
            Color.rgb(245,255,250),
            Color.rgb(245,255,250),

    };

    public kanji8SlideAdapter(Context context){
        this.kanji08context = context;
    }


    @Override
    public int getCount() {
        return kanji08ListTitles.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return (view == (LinearLayout)object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        kanji08inflater = (LayoutInflater) kanji08context.getSystemService(kanji08context.LAYOUT_INFLATER_SERVICE);
        View view = kanji08inflater.inflate(R.layout.kanji08_slide,container,false);
        LinearLayout kanji08LayoutSlide = view.findViewById(R.id.kanji08SlideLinearLayout);
        TextView kanji08TextView = view.findViewById(R.id.kanji08SlideText);
        TextView kanji08TitleTextView = view.findViewById(R.id.kanji08SlideTextViewId);
        TextView kanji08DescriptionTextView = view.findViewById(R.id.kanji08TextDescriptionId);
        kanji08LayoutSlide.setBackgroundColor(kanji08Background[position]);
        kanji08TextView.setText(kanji08Text[position]);
        kanji08TitleTextView.setText(kanji08ListTitles[position]);
        kanji08DescriptionTextView.setText(kanji08ListDescription[position]);
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((LinearLayout)object);
    }
}
