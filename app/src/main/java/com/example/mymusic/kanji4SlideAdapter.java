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
import androidx.viewpager.widget.ViewPager;

public class kanji4SlideAdapter extends PagerAdapter {

    Context kanji04context;
    LayoutInflater kanji04inflater;

    //list of lessons

    public String[] kanji04Text = {
            "月",
            "火",
            "水",
            "木",
            "金",
            "土",
            "日",
            "駅",
            "目",
            "手",
    };

    public String[] kanji04ListTitles = {
            "つき\n" +
                    "চাঁদ",
            "ひ\n" +
                    "আগুন",
            "みず\n" +
                    "পানি",
            "き\n" +
                    "গাছপালা",
            "きん\n" +
                    "স্বর্ণ",
            "つち\n" +
                    "মাটি",
            "にち\n" +
                    "দিন",
            "えき\n" +
                    "স্টেশন",
            "め\n" +
                    "চক্ষু",
            "て\n" +
                    "হাত",
    } ;
    public String[] kanji04ListDescription = {
            "そらに月がみえました。\n" +
                    "আকাশে চাঁদ দেখতে পারি ।?",
            "火でりょうりをつくりました。\n" +
                    "আগুন দিয়া রান্না করেছিলাম।",
            "わたしは水をのみました。\n" +
                    "আমি পানি পান করেছিলাম ।",
            "木でほんをつくりました。\n" +
                    "গাছপালা দিয়ে বই তৈরি করেছিলাম।",
            "金はたかいです。\n" +
                    "স্বর্ণ দামি।",
            "土のなかにひとがすんでいます。\n" +
                    "মাটি মধ্যে মানুষ বসবাস করে।",
            "きょうはなん日ですか。\n" +
                    "আজকে কত তারিখ? ",
            "駅でしんぶんをかいました。\n" +
                    "স্টেশনে পত্রিকা কিনছিলাম ।",
            "目がわるいですから、メガネをかけます。\n" +
                    "চক্ষু খারাপ বলে চশমা পড়ি ।",
            "手でごはんをたべます。\n" +
                    "হাত দিয়ে ভাত খাব ",
    } ;

    public int[] kanji04Background = {
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

    public kanji4SlideAdapter(Context context){
        this.kanji04context = context;
    }


    @Override
    public int getCount() {
        return kanji04ListTitles.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return (view == (LinearLayout)object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        kanji04inflater = (LayoutInflater) kanji04context.getSystemService(kanji04context.LAYOUT_INFLATER_SERVICE);
        View view = kanji04inflater.inflate(R.layout.kanji04_slide,container,false);
        LinearLayout kanji04LayoutSlide = view.findViewById(R.id.kanji04SlideLinearLayout);
        TextView kanji04TextView = view.findViewById(R.id.kanji04SlideText);
        TextView kanji04TitleTextView = view.findViewById(R.id.kanji04SlideTextViewId);
        TextView kanji04DescriptionTextView = view.findViewById(R.id.kanji04TextDescriptionId);
        kanji04LayoutSlide.setBackgroundColor(kanji04Background[position]);
        kanji04TextView.setText(kanji04Text[position]);
        kanji04TitleTextView.setText(kanji04ListTitles[position]);
        kanji04DescriptionTextView.setText(kanji04ListDescription[position]);
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((LinearLayout)object);
    }
}
