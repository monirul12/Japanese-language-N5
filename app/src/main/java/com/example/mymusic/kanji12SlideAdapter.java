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

public class kanji12SlideAdapter extends PagerAdapter {

    Context kanji12context;
    LayoutInflater kanji12inflater;

    //list of lessons

    public String[] kanji12Text = {
            "門",
            "長い",
            "広い",
            "狭い",
            "顔",
            "白い",
            "黒い",
            "赤い",
            "上手",
            "下手",
    };

    public String[] kanji12ListTitles = {
            "もん\n" +
                    "গেট",
            "ながい\n" +
                    "লম্বা",
            "ひろい\n" +
                    "প্রসস্থ",
            "せまい\n" +
                    "সঙ্কীর্ণ",
            "かお\n" +
                    "মুখমণ্ডল",
            "しろい\n" +
                    "সাদা রং",
            "くろい\n" +
                    "কালো রং",
            "あかい\n" +
                    "লাল রং",
            "じょうず\n" +
                    "পারদর্শী",
            "へた\n" +
                    "অপারদর্শী",
    };
    public String[] kanji12ListDescription = {
            "いえの門のそとでまっています。\n" +
                    "বাড়ির গেঁটের পাশে অপেক্ষা করতেছি।",
            "あのひとのかみは長いです。\n" +
                    "ঐ লোকটার চুল লম্বা।",
            "わたしの部屋は広いです。\n" +
                    "আমার ঘর প্রসস্থ।",
            "いもうとは部屋は狭いです。\n" +
                    "ছোট বোনের ঘর সঙ্কীর্ণ ।",
            "顔をあらいます。\n" +
                    "মুখমণ্ডল পরিষ্কার করি।",
            "この白いサッツはいくらですか。\n" +
                    "এই সাদা সার্টটার দাম কত?",
            "この黒いペンをみせてください。\n" +
                    "এই কালো কলমটা দয়া করে দেখান ।",
            "赤いボールペーんでかかないでください。\n" +
                    "লাল কলম দিয়ে দয়াকরে লিখবেন না।",
            "りょうりが上手です。\n" +
                    "রান্না পারদর্শী ।",
            "うんてんは下手です。\n" +
                    "গাড়ি চালান অপারদর্শী ।",
    };

    public int[] kanji12Background = {
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

    public kanji12SlideAdapter(Context context) {
        this.kanji12context = context;
    }


    @Override
    public int getCount() {
        return kanji12ListTitles.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return (view == (LinearLayout) object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        kanji12inflater = (LayoutInflater) kanji12context.getSystemService(kanji12context.LAYOUT_INFLATER_SERVICE);
        View view = kanji12inflater.inflate(R.layout.kanji12_slide, container, false);
        LinearLayout kanji12LayoutSlide = view.findViewById(R.id.kanji12SlideLinearLayout);
        TextView kanji12TextView = view.findViewById(R.id.kanji12SlideText);
        TextView kanji12TitleTextView = view.findViewById(R.id.kanji12SlideTextViewId);
        TextView kanji12DescriptionTextView = view.findViewById(R.id.kanji12TextDescriptionId);
        kanji12LayoutSlide.setBackgroundColor(kanji12Background[position]);
        kanji12TextView.setText(kanji12Text[position]);
        kanji12TitleTextView.setText(kanji12ListTitles[position]);
        kanji12DescriptionTextView.setText(kanji12ListDescription[position]);
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((LinearLayout) object);
    }
}
