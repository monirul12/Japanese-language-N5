package com.example.mymusic;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class kanji1SlideAdapter extends PagerAdapter {

    Context kanji01context;
    LayoutInflater kanji01inflater;

    //list of lessons

    public String[] kanji01Text = {
            "魚",
            "一",
            "人",
            "何",
            "今",
            "入る",
            "出る",
            "何時",
            "今週",
            "日本",
    };

    public String[] kanji01ListTitles = {
            "さかな\n" +
                    "মাছ",
            "いち\n" +
                    "এক",
            "ひと\n" +
                    "মানুষ",
            "なに\n" +
                    "কি",
            "いま\n" +
                    "এখন",
            "はいる\n" +
                    "প্রবেশ করা",
            "でます\n" +
                    "বাহির হওয়া",
            "なんじ\n" +
                    "কয়টা",
            "こんしゅう\n" +
                    "এই সপ্তাহ",
            "にほん\n" +
                    "জাপান",
    } ;
    public String[] kanji01ListDescription = {
                    "これは魚です。\n" +
                    "এটা মাছ।",
                    "一つおねがいします。\n" +
                    "একটা দিন।",
                    "あの人はエンジニアです。\n" +
                    "ঐ লোকটা ইঞ্জিনিয়ার।",
                    "なにをたべますか。\n" +
                    "কি খাবেন?",
                    "今なんじですか。\n" +
                    "এখন কয়টা বাজে?",
                    "入ってもいいですか。\n" +
                    "প্রবেশ করতে পারব কি?",
                    "だいがくを出ます。\n" +
                    "বিশ্ববিদ্যালয় ছেড়ে দেওয়া। ",
                    "今なんじですか。\n" +
                    "এখন কয়টা বাজে?",
                    "今週どこへもいきません。\n" +
                    "এই সপ্তাহে কোথাও যাব না।",
                    "日本へいきます。\n" +
                    "জাপানে যাব।",
    } ;

    public int[] kanji01Background = {
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

    public kanji1SlideAdapter(Context context){
        this.kanji01context = context;
    }


    @Override
    public int getCount() {
        return kanji01ListTitles.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return (view == (LinearLayout)object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        kanji01inflater = (LayoutInflater) kanji01context.getSystemService(kanji01context.LAYOUT_INFLATER_SERVICE);
        View view = kanji01inflater.inflate(R.layout.kanji01_slide,container,false);
        LinearLayout kanji01LayoutSlide = view.findViewById(R.id.kanji01SlideLinearLayout);
        TextView kanji01TextView = view.findViewById(R.id.kanji01SlideText);
        TextView kanji01TitleTextView = view.findViewById(R.id.kanji01SlideTextViewId);
        TextView kanji01DescriptionTextView = view.findViewById(R.id.kanji01TextDescriptionId);
        kanji01LayoutSlide.setBackgroundColor(kanji01Background[position]);
        kanji01TextView.setText(kanji01Text[position]);
        kanji01TitleTextView.setText(kanji01ListTitles[position]);
        kanji01DescriptionTextView.setText(kanji01ListDescription[position]);
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((LinearLayout)object);
    }
}
