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

public class kanji9SlideAdapter extends PagerAdapter {

    Context kanji09context;
    LayoutInflater kanji09inflater;

    //list of lessons

    public String[] kanji09Text = {
            "店",
            "国",
            "山",
            "雨",
            "花",
            "川",
            "空",
            "天気",
            "車",
            "電車",
    };

    public String[] kanji09ListTitles = {
            "みせ\n" +
                    "দোকান",
            "くに\n" +
                    "দেশ",
            "やま\n" +
                    "পাহাড়",
            "あめ\n" +
                    "বৃষ্টি",
            "はな\n" +
                    "ফুল",
            "かわ\n" +
                    "নদী",
            "そら\n" +
                    "আকাশ",
            "てんき\n" +
                    "আবহাওয়া",
            "くるま\n" +
                    "গাড়ি",
            "でんしゃ\n" +
                    "ট্রেন",
    } ;
    public String[] kanji09ListDescription = {
            "店にほんがあります。\n" +
                    "দোকানে বই আছে।",
            "国へ帰ります。\n" +
                    "দেশে ফিরবো।",
            "山がみえます。\n" +
                    "পাহাড় দেখতে পারি।",
            "雨がふっています。\n" +
                    "বৃষ্টি পরতেছে।",
            "花をかいました。\n" +
                    "ফুল কিনেছিলাম।",
            "川でおよぎます\n" +
                    "নদিতে সাঁতার কাটব।",
            "とりはそらでとびます。\n" +
                    "পাখি আকাশে উড়ে।",
            "きょうは天気がいいです。\n" +
                    "আজ আবহাওয়া ভাল",
            "車でうちへかえりました。\n" +
                    "গাড়ি দিয়ে বাড়ি ফিরেছিলাম।",
            "電車でとうきょうへいきます。\n" +
                    "ট্রেন দিয়ে টোকিয়ো যাব।",
    } ;

    public int[] kanji09Background = {
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

    public kanji9SlideAdapter(Context context){
        this.kanji09context = context;
    }


    @Override
    public int getCount() {
        return kanji09ListTitles.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return (view == (LinearLayout)object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        kanji09inflater = (LayoutInflater) kanji09context.getSystemService(kanji09context.LAYOUT_INFLATER_SERVICE);
        View view = kanji09inflater.inflate(R.layout.kanji09_slide,container,false);
        LinearLayout kanji09LayoutSlide = view.findViewById(R.id.kanji09SlideLinearLayout);
        TextView kanji09TextView = view.findViewById(R.id.kanji09SlideText);
        TextView kanji09TitleTextView = view.findViewById(R.id.kanji09SlideTextViewId);
        TextView kanji09DescriptionTextView = view.findViewById(R.id.kanji09TextDescriptionId);
        kanji09LayoutSlide.setBackgroundColor(kanji09Background[position]);
        kanji09TextView.setText(kanji09Text[position]);
        kanji09TitleTextView.setText(kanji09ListTitles[position]);
        kanji09DescriptionTextView.setText(kanji09ListDescription[position]);
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((LinearLayout)object);
    }
}
