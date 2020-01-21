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

class lesson10SlideAdapter extends PagerAdapter {

    Context lesson10Context;
    LayoutInflater lesson10Inflater;
    //list of lessons

    public String[] lesson10ListHeadlines = {
            "Form of verb",
            "てーForm",
            "て ― form এর ব্যবহার ください",
            "て ― form এর ব্যবহার  います",
    };

    public String[] lesson10ListTitles = {
            "Verb এর Form পাঁচটি- \n\n" +
                    "যেমনঃ \n\n" +
                    "১.\t ます　Form\n" +
                    "২.\t て　Form\n" +
                    "৩.\t じしょ　Form\n" +
                    "৪.\t ない　Form\n" +
                    "৫.\t た　Form\n",

            "Group- I：\n\n" +
                    "১.\t い、ち、リ　― つて\n" +
                    "২.\t み、び、に　― んで\n" +
                    "৩.\t き　― いて\n" +
                    "৪.\t ぎ　― いで\n" +
                    "৫.\t し　― して\n" +
                    "* ব্যাতিক্রমঃ いきます　― いって\n",

            "কোন কিছু করার জন্য অনুরোধ করা বুঝাতে てform　এর সাথে ください ব্যবহার করা হয়।\n\n" +
                    "যেমনঃ ",

            "কোন কাজ চলমান অবস্থায় আছে বা চলছে বুঝাতে এই expression টি ব্যবহৃত হয় । \n\n" +
                    "যেমনঃ ",
    } ;
    public String[] lesson10ListDescription = {
            "",
            "Group- II：\n\n" +
                    "Group- II ますএর পরিবর্তে て বসবে।\n" +
                    "যেমনঃ \n" +
                    "たべますーたべて\n" +
                    "ねますーねて\n\n" +
                    "Group- III:\n\n " +
                    "Group- III ますএর পরিবর্তে て বসবে।\n" +
                    "します　― して\n" +
                    "きます　― きて\n",

            "•\t すみませんが、このかんじのよみかたをおしえてください。\n" +
                    "মাফ করবেন,এই কানজির পড়ার প্রক্রিয়া দয়া করে বলবেন।\n " +
                    "•\t ここにじゅうしょとなまえをかいてください。\n" +
                    "এই ঠিকানা এবং নাম দয়া করে লিখেন। ",

            "•\t ミラーさんはいまでんわをかけています。\n" +
                    "মিরা সাহেব এখন ফোন করতেছে\n" +
                    "•\t いま雨がふっていますか。\n" +
                    "এখন বৃষ্টি পড়তেছে কি ?\n"+
                    "・・・はい、ふっています。\n" +
                    "হ্যাঁ পড়তেছে ।",
    } ;

    public int[] lesson10FirstBackground = {
            Color.rgb(245,255,250),
            Color.rgb(245,255,250),
            Color.rgb(245,255,250),
            Color.rgb(245,255,250),
    };

    public lesson10SlideAdapter(Context context){
        this.lesson10Context = context;
    }

    @Override
    public int getCount() {
        return lesson10ListTitles.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return (view == (LinearLayout)object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        lesson10Inflater= (LayoutInflater) lesson10Context.getSystemService(lesson10Context.LAYOUT_INFLATER_SERVICE);
        View view = lesson10Inflater.inflate(R.layout.lesson10_slide,container,false);
        LinearLayout lesson10LayoutSlide = view.findViewById(R.id.lesson10SlideLinearLayout);
        TextView lesson10headlineTextView = view.findViewById(R.id.lesson10SlideHeadlineId);
        TextView lesson10TitleView = view.findViewById(R.id.lesson10SlideTextViewId);
        TextView lesson10DescriptionTextView = view.findViewById(R.id.lesson10SlideTextDescriptionId);
        lesson10LayoutSlide.setBackgroundColor(lesson10FirstBackground[position]);
        lesson10headlineTextView.setText(lesson10ListHeadlines[position]);
        lesson10TitleView.setText(lesson10ListTitles[position]);
        lesson10DescriptionTextView.setText(lesson10ListDescription[position]);
        container.addView(view);
        return view;

    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((LinearLayout)object);
    }
}


