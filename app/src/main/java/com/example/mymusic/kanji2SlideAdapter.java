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

public class kanji2SlideAdapter extends PagerAdapter {
    Context kanji02context;
    LayoutInflater kanji02inflater;

    //list of lessons

    public String[] kanji02Text = {
            "日本人",
            "上",
            "下",
            "中",
            "右",
            "左",
            "道",
            "北",
            "東",
            "南",
    };

    public String[] kanji02ListTitles = {
            "にほんじん\n" +
                    "জাপানিজ",
            "うえ\n" +
                    "উপরে",
            "した\n" +
                    "নিচে",
            "なか\n" +
                    "ভিতরে",
            "みぎ\n" +
                    "ডান",
            "ひだり\n" +
                    "বাম",
            "みち\n" +
                    "রাস্তা",
            "きた\n" +
                    "উত্তর",
            "ひがし\n" +
                    "পূর্ব",
            "みなみ\n" +
                    "দক্ষিণ",
    } ;
    public String[] kanji02ListDescription = {
            "たなかさんは日本人です。\n" +
                    "তানাকা সাহেব জাপানিজ নাগরিক।",
            "テーブルの上にほんがあります。\n" +
                    "টেবিলের উপরে বই আছে ।",
            "テーブルの下にいぬがいます。\n" +
                    "টেবিলের নিচে কুকুর আছে ।",
            "ハコの中にじゃがいもがあります。\n" +
                    "বক্সের মধ্যে আলু আছে ।",
            "わたしの右にともだちがいます。\n" +
                    "আমার ডানে বন্ধু আছে ।",
            "わたしの左にともだちがいます。\n" +
                    "পআমার বামে বন্ধু আছে ।",
            "この道はしずかです。\n" +
                    "এই রাস্তা শান্ত। ",
            "北ぐちにせんせいがいます。\n" +
                    "উত্তর প্রবেশ পথে শিক্ষক আছে ।",
            "東ぐちにおくさんがいます。\n" +
                    "পূর্ব প্রবেশ পথে বউ আছে।",
            "南ぐちにおとうさんがいます。\n" +
                    "দক্ষিণ প্রবেশ পথে বাবা আছে।",
    } ;

    public int[] kanji02Background = {
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

    public kanji2SlideAdapter(Context context){
        this.kanji02context = context;
    }


    @Override
    public int getCount() {
        return kanji02ListTitles.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return (view == (LinearLayout)object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        kanji02inflater = (LayoutInflater) kanji02context.getSystemService(kanji02context.LAYOUT_INFLATER_SERVICE);
        View view = kanji02inflater.inflate(R.layout.kanji02_slide,container,false);
        LinearLayout kanji02LayoutSlide = view.findViewById(R.id.kanji02SlideLinearLayout);
        TextView kanji02TextView = view.findViewById(R.id.kanji02SlideText);
        TextView kanji02TitleTextView = view.findViewById(R.id.kanji02SlideTextViewId);
        TextView kanji02DescriptionTextView = view.findViewById(R.id.kanji02TextDescriptionId);
        kanji02LayoutSlide.setBackgroundColor(kanji02Background[position]);
        kanji02TextView.setText(kanji02Text[position]);
        kanji02TitleTextView.setText(kanji02ListTitles[position]);
        kanji02DescriptionTextView.setText(kanji02ListDescription[position]);
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((LinearLayout)object);
    }
}
