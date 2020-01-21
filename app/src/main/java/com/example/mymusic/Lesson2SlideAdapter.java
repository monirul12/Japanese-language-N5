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

public class Lesson2SlideAdapter extends PagerAdapter {

    Context lesson2Context;
    LayoutInflater lesson2Inflater;

    //list of lessons

    public String[] lesson2ListHeadlines = {
            "これ , それ , あれ",
            "この , その , あの ",
            "そうです , そうじゃありません",
            "の এর ব্যবহার",
            "そうですか",
    };

    public String[] lesson2ListTitles = {
            "これ , それ , あれ  এগুলো হচ্ছে Noun. এর পর subject এর প্রয়োজন নেই।",

            "この その あの এই Noun গুলো পর অবশ্যই subject বসাতে হবে।",

            "そうです、そうじゃありません এই শব্দ গুলো conversation করার সময় ব্যবহার করা হয়।\n",

            "の particle টি র,এর অর্থে ব্যবহার করা হয়। の particle টি ব্যক্তি , স্থানের ক্ষেত্রে ও বসে।",
            "そうですか　এই শব্দ টি conversation করার সময় ব্যবহার করা হয়।",
    } ;
    public String[] lesson2ListDescription = {
            "•\tそれはじしょですか。\n" +
                    "•\tこれはめいしです。\n",

            "•\tそのかぎはわたしのです。\n" +
                    "•\tあれかばんはわたしのです。\n",

            "•\tそれはテレホンカードですか。\n" +
                    "…… はい、そうです。\n" +
                    "\n" +
                    "•\tそれはテレホンカードですか　\n" +
                    "….. いいえ、そうじゃありません。\n",

            "•\tあれはミラーさんのほんです。\n" +
                    "•\tこれはにほんのかばんです。\n",

            "•\tこのかさはあなたのですか。\n" +
                    "…… いいえ、ちがいます。スユミットさんのです。\n" +
                    "•\tそうですか。\n",
    } ;

    public int[] lesson2FirstBackground = {
            Color.rgb(245,255,250),
            Color.rgb(245,255,250),
            Color.rgb(245,255,250),
            Color.rgb(245,255,250),
            Color.rgb(245,255,250),
    };

    public Lesson2SlideAdapter(Context context){
        this.lesson2Context = context;
    }


    @Override
    public int getCount() {
        return lesson2ListTitles.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return (view == (LinearLayout)object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        lesson2Inflater= (LayoutInflater) lesson2Context.getSystemService(lesson2Context.LAYOUT_INFLATER_SERVICE);
        View view = lesson2Inflater.inflate(R.layout.lesson02_slide,container,false);
        LinearLayout lesson2LayoutSlide = view.findViewById(R.id.lesson2SlideLinearLayout);
        TextView lesson2headlineTextView = view.findViewById(R.id.lesson2SlideHeadlineId);
        TextView lesson2TitleView = view.findViewById(R.id.lesson2SlideTextViewId);
        TextView lesson2DescriptionTextView = view.findViewById(R.id.lesson2SlideTextDescriptionId);
        lesson2LayoutSlide.setBackgroundColor(lesson2FirstBackground[position]);
        lesson2headlineTextView.setText(lesson2ListHeadlines[position]);
        lesson2TitleView.setText(lesson2ListTitles[position]);
        lesson2DescriptionTextView.setText(lesson2ListDescription[position]);
        container.addView(view);
        return view;

    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((LinearLayout)object);
    }
}
