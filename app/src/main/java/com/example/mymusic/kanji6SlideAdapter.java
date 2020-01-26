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

public class kanji6SlideAdapter extends PagerAdapter {


    Context kanji06context;
    LayoutInflater kanji06inflater;

    //list of lessons

    public String[] kanji06Text = {
            "学校",
            "大学",
            "学生",
            "大学生",
            "先生",
            "西",
            "〜週",
            "〜月",
            "〜年",
            "〜時",
    };

    public String[] kanji06ListTitles = {
            "がっこう\n" +
                    "স্কুল",
            "だいがく\n" +
                    "বিশ্ববিদ্যালয়",
            "がくせい\n" +
                    "ছাত্র",
            "だいがくせい\n" +
                    "বিশ্ববিদ্যালয়ের ছাত্র",
            "せんせい\n" +
                    "শিক্ষক",
            "にし\n" +
                    "পশ্চিম",
            "しゅう\n" +
                    "সপ্তাহ",
            "がつ\n" +
                    "মাস",
            "ねん\n" +
                    "বছর",
            "じ\n" +
                    "সময়",
    } ;
    public String[] kanji06ListDescription = {
            "学校へきます\n" +
                    "স্কুলে আসব।",
            "大学へきます。\n" +
                    "বিশ্ববিদ্যালয়ে আসবো।",
            "学生はなんにんいますか。\n" +
                    "ছাত্র কত জন্ আছে ?",
            "わたしは大学生です。\n" +
                    "আমি বিশ্ববিদ্যালয়ের ছাত্র।",
            "たなかさんはせんせいです。\n" +
                    "তানাকা সাহেব একজন শিক্ষক।",
            "西ぐちはどちらですか。\n" +
                    "পশ্চিম প্রস্থান কোনদিকে?",
            "１週かんに１かいにほんごをべんきょうします。\n" +
                    "এক সপ্তাহে এক বার জাপানিজ ভাষা পড়াশোনা করি ",
            "１月ににほんへいきます。\n" +
                    "জানুয়ারি মাসে জাপান যাব ।",
            "１年のなかなんかいがいこくへいきますか。\n" +
                    "এক বছরে কতবার জাপান যান।",
            "ごご１１じにねます。\n" +
                    "রাত ১১টা ঘুমাব।",
    } ;

    public int[] kanji06Background = {
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

    public kanji6SlideAdapter(Context context){
        this.kanji06context = context;
    }


    @Override
    public int getCount() {
        return kanji06ListTitles.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return (view == (LinearLayout)object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        kanji06inflater = (LayoutInflater) kanji06context.getSystemService(kanji06context.LAYOUT_INFLATER_SERVICE);
        View view = kanji06inflater.inflate(R.layout.kanji06_slide,container,false);
        LinearLayout kanji06LayoutSlide = view.findViewById(R.id.kanji06SlideLinearLayout);
        TextView kanji06TextView = view.findViewById(R.id.kanji06SlideText);
        TextView kanji06TitleTextView = view.findViewById(R.id.kanji06SlideTextViewId);
        TextView kanji06DescriptionTextView = view.findViewById(R.id.kanji06TextDescriptionId);
        kanji06LayoutSlide.setBackgroundColor(kanji06Background[position]);
        kanji06TextView.setText(kanji06Text[position]);
        kanji06TitleTextView.setText(kanji06ListTitles[position]);
        kanji06DescriptionTextView.setText(kanji06ListDescription[position]);
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((LinearLayout)object);
    }
}
