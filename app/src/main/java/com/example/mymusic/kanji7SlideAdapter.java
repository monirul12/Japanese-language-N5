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

public class kanji7SlideAdapter extends PagerAdapter {

    Context kanji07context;
    LayoutInflater kanji07inflater;

    //list of lessons

    public String[] kanji07Text = {
            "午後",
            "午前",
            "毎日",
            "毎晩",
            "毎朝",
            "分",
            "半",
            "人",
            "男",
            "女",
    };

    public String[] kanji07ListTitles = {
            "ごご\n" +
                    "PM",
            "ごぜん\n" +
                    "AM",
            "まいにち\n" +
                    "প্রতিদিন",
            "まいばん\n" +
                    "প্রতি রাত",
            "まいあさ\n" +
                    "প্রতি সকাল",
            "ふん\n" +
                    "মিনিট",
            "はん\n" +
                    "৩০মিনিট",
            "ひと\n" +
                    "মানুষ",
            "おとこ\n" +
                    "ছেলে",
            "おんな\n" +
                    "মেয়ে",
    } ;
    public String[] kanji07ListDescription = {
            "午後１１じにねます\n" +
                    "রাত ১১টা ঘুমাব।",
            "午前６じにおきました。\n" +
                    "সকাল ৬ টা ঘুম থেকে উঠেছিলাম।",
            "毎日わたしはにほんごをべんきょうします。\n" +
                    "প্রতিদিন আমি জাপানিজ ভাষা পড়াশোনা করি।",
            "毎晩６じにコーヒーを飲みます。\n" +
                    "প্রতি সন্ধ্যা বেলা ৬ টা কফি পান করি।",
            "毎朝６じにおきます。\n" +
                    "প্রতি সকাল ৬ টা ঘুম থেকে উঠি।",
            "いまは１０じ３３分です。\n" +
                    "এখন সময় ১০ টা ৩৩ মিনিট।",
            "いまは１じ半です。\n" +
                    "এখন সময় ১ টা ৩০ মিনিট ।",
            "あの人はだれですか。\n" +
                    "ঐ লোকটা কে?",
            "男のひとははいってください。\n" +
                    "ছেলে মানুষ দয়া করে প্রবেশ করুন ।",
            "女のひとははいってください。\n" +
                    "মেয়ে মানুষ দয়া করে প্রবেশ করেন ।",
    } ;

    public int[] kanji07Background = {
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

    public kanji7SlideAdapter(Context context){
        this.kanji07context = context;
    }


    @Override
    public int getCount() {
        return kanji07ListTitles.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return (view == (LinearLayout)object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        kanji07inflater = (LayoutInflater) kanji07context.getSystemService(kanji07context.LAYOUT_INFLATER_SERVICE);
        View view = kanji07inflater.inflate(R.layout.kanji07_slide,container,false);
        LinearLayout kanji07LayoutSlide = view.findViewById(R.id.kanji07SlideLinearLayout);
        TextView kanji07TextView = view.findViewById(R.id.kanji07SlideText);
        TextView kanji07TitleTextView = view.findViewById(R.id.kanji07SlideTextViewId);
        TextView kanji07DescriptionTextView = view.findViewById(R.id.kanji07TextDescriptionId);
        kanji07LayoutSlide.setBackgroundColor(kanji07Background[position]);
        kanji07TextView.setText(kanji07Text[position]);
        kanji07TitleTextView.setText(kanji07ListTitles[position]);
        kanji07DescriptionTextView.setText(kanji07ListDescription[position]);
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((LinearLayout)object);
    }
}
