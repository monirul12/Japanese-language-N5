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

public class kanji14SlideAdapter extends PagerAdapter {
        Context kanji14context;
        LayoutInflater kanji14inflater;

        //list of lessons

        public String[] kanji14Text = {
                "会社",
                "医者",
                "外国",
                "電気",
                "天気",
                "店",
                "先",
                "間",
                "書きます",
                "読みます",
        };

        public String[] kanji14ListTitles = {
                "かいしゃ\n" +
                        "কোম্পানি",
                "いしゃ\n" +
                        "ডাক্তার",
                "がいこく\n" +
                        "বিদেশ",
                "でんき\n" +
                        "লাইট",
                "てんき\n" +
                        "আবহাওয়া",
                "みせ\n" +
                        "দোকান",
                "さき\n" +
                        "প্রথমেই",
                "あいだ\n" +
                        "মধ্যে",
                "かきます\n" +
                        "লিখা",
                "よみます\n" +
                        "পড়া",
        };
        public String[] kanji14ListDescription = {
                "会社は９じから５じまでです。\n" +
                        "কোম্পানি ৯ টা থেকে ৫ টা পর্যন্ত।",
                "たなかさんは医者です。\n" +
                        "তানাকা সাহেব একজন ডাক্তার।",
                "まいとし外国へ行きたい。\n" +
                        "প্রতিবছর বিদেশ যাইতে চাই।",
                "電気はついてあります。\n" +
                        "লাইট জ্বালানো আছে ।",
                "きょうはいい天気ですね。\n" +
                        "আজকের আবহাওয়া ভাল ।",
                "この店でさかなを買ってください。\n" +
                        "এই দোকানে দয়া করে মাছ কিনেন ।",
                "先にほんをもってください。\n" +
                        "প্রথমেই দয়া করে বই আনুন ।",
                "この間になにをしましたか。\n" +
                        "এই সময়ের মধ্যে কি করেছিলেন ।",
                "にほんごで書いてください。\n" +
                        "জাপানিজ ভাষা দিয়ে দয়া করে লিখুন।",
                "新聞を読んでいます。\n" +
                        "নিউজ পেপার পড়তেছে ।",
        };

        public int[] kanji14Background = {
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

        public kanji14SlideAdapter(Context context) {
            this.kanji14context = context;
        }


        @Override
        public int getCount() {
            return kanji14ListTitles.length;
        }

        @Override
        public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
            return (view == (LinearLayout) object);
        }

        @NonNull
        @Override
        public Object instantiateItem(@NonNull ViewGroup container, int position) {
            kanji14inflater = (LayoutInflater) kanji14context.getSystemService(kanji14context.LAYOUT_INFLATER_SERVICE);
            View view = kanji14inflater.inflate(R.layout.kanji14_slide, container, false);
            LinearLayout kanji14LayoutSlide = view.findViewById(R.id.kanji14SlideLinearLayout);
            TextView kanji14TextView = view.findViewById(R.id.kanji14SlideText);
            TextView kanji14TitleTextView = view.findViewById(R.id.kanji14SlideTextViewId);
            TextView kanji14DescriptionTextView = view.findViewById(R.id.kanji14TextDescriptionId);
            kanji14LayoutSlide.setBackgroundColor(kanji14Background[position]);
            kanji14TextView.setText(kanji14Text[position]);
            kanji14TitleTextView.setText(kanji14ListTitles[position]);
            kanji14DescriptionTextView.setText(kanji14ListDescription[position]);
            container.addView(view);
            return view;
        }

        @Override
        public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
            container.removeView((LinearLayout) object);
        }
    }


