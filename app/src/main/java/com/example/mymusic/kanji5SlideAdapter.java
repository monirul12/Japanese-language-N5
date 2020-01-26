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

public class kanji5SlideAdapter extends PagerAdapter {

    Context kanji05context;
    LayoutInflater kanji05inflater;

    //list of lessons

    public String[] kanji05Text = {
            "食べます",
            "飲みます",
            "行きます",
            "来ます",
            "帰ります",
            "買います",
            "読みます",
            "書きます",
            "聞きます",
            "見ます",
    };

    public String[] kanji05ListTitles = {
            "たべます\n" +
                    "খাওয়া",
            "のみます\n" +
                    "পানকরা",
            "いきます\n" +
                    "যাব",
            "きます\n" +
                    "আসব",
            "かえります\n" +
                    "ফিরবো",
            "かいます\n" +
                    "কিনবো",
            "よます\n" +
                    "পড়বো",
            "かきます\n" +
                    "লিখবো",
            "ききます\n" +
                    "শুনবো",
            "みます\n" +
                    "দেখবো",
    } ;
    public String[] kanji05ListDescription = {
            "あさごはんを食べます。\n" +
                    "সকালের খাবার খাব।?",
            "みずを飲みます。\n" +
                    "পানি পান করবো।",
            "にほんへ行きます。\n" +
                    "জাপানে যাব।",
            "がっこうへ来ます。\n" +
                    "স্কুলে আসবো।",
            "うちへ帰ります。\n" +
                    "বাড়িতে ফিরবো।",
            "カメラを買います。\n" +
                    "ক্যামেরা কিনবো।",
            "しんぶんを読ます。\n" +
                    "সংবাদপত্র পড়বো ",
            "てがみを書きます。\n" +
                    "চিঠি লিখবো ।",
            "うたを聞きます。\n" +
                    "গান শুনবো।",
            "えいがを見ます。\n" +
                    "ছিনেমা দেখবো।",
    } ;

    public int[] kanji05Background = {
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

    public kanji5SlideAdapter(Context context){
        this.kanji05context = context;
    }


    @Override
    public int getCount() {
        return kanji05ListTitles.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return (view == (LinearLayout)object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        kanji05inflater = (LayoutInflater) kanji05context.getSystemService(kanji05context.LAYOUT_INFLATER_SERVICE);
        View view = kanji05inflater.inflate(R.layout.kanji05_slide,container,false);
        LinearLayout kanji05LayoutSlide = view.findViewById(R.id.kanji05SlideLinearLayout);
        TextView kanji05TextView = view.findViewById(R.id.kanji05SlideText);
        TextView kanji05TitleTextView = view.findViewById(R.id.kanji05SlideTextViewId);
        TextView kanji05DescriptionTextView = view.findViewById(R.id.kanji05TextDescriptionId);
        kanji05LayoutSlide.setBackgroundColor(kanji05Background[position]);
        kanji05TextView.setText(kanji05Text[position]);
        kanji05TitleTextView.setText(kanji05ListTitles[position]);
        kanji05DescriptionTextView.setText(kanji05ListDescription[position]);
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((LinearLayout)object);
    }
}
