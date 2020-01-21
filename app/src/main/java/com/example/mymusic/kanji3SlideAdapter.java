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

public class kanji3SlideAdapter extends PagerAdapter {

    Context kanji03context;
    LayoutInflater kanji03inflater;

    //list of lessons

    public String[] kanji03Text = {
            "何曜日",
            "月曜日",
            "火曜日",
            "水曜日",
            "木曜日",
            "金曜日",
            "土曜日",
            "日曜日",
            "会社",
            "医者",
    };

    public String[] kanji03ListTitles = {
            "なんようび\n" +
                    "কি বার",
            "げつようび\n" +
                    "সোম বার",
            "かようび\n" +
                    "মঙ্গল বার",
            "すいようび\n" +
                    "বুধ বার",
            "もくようび\n" +
                    "ব্রহস্প্রতি বার",
            "きんようび\n" +
                    "শুক্র বার",
            "どようび\n" +
                    "শনি বার",
            "にちようび\n" +
                    "রবি বার",
            "かいしゃ\n" +
                    "কোম্পানি ",
            "いしゃ\n" +
                    "ডাক্তার",
    } ;
    public String[] kanji03ListDescription = {
            "あした何曜日ですか。\n" +
                    "আগামীকাল কি বার ?",
            "あした月曜日です。\n" +
                    "আগামীকাল সোমবার।",
            "あさって火曜日です。\n" +
                    "টআগামী পরশু মঙ্গলবার।",
            "きのう水曜日でした。\n" +
                    "গতকাল বুধবার ছিল।",
            "おととい木曜日でした。\n" +
                    "গত পরশু ব্রহস্প্রতি বার ছিল ।",
            "金曜日はやすみです。\n" +
                    "শুক্রবার ছুটি।",
            "土曜日えいがをみにいきます。\n" +
                    "শনিবার ছিনেমা দেখতে যাব। ",
            "日曜日はどこへもいきません。\n" +
                    "রবিবার কোথাওই যাব না ।",
            "わたしの会社はごぜん９じからごご５じまでです。\n" +
                    "আমার কোম্পানি সকাল ৯টা থেকে বিকাল ৫টা পর্যন্ত ।",
            "にほんのいしゃはどうですか。\n" +
                    "জাপানের ডাক্তার কেমন ? ",
    } ;

    public int[] kanji03Background = {
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

    public kanji3SlideAdapter(Context context){
        this.kanji03context = context;
    }


    @Override
    public int getCount() {
        return kanji03ListTitles.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return (view == (LinearLayout)object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        kanji03inflater = (LayoutInflater) kanji03context.getSystemService(kanji03context.LAYOUT_INFLATER_SERVICE);
        View view = kanji03inflater.inflate(R.layout.kanji03_slide,container,false);
        LinearLayout kanji03LayoutSlide = view.findViewById(R.id.kanji03SlideLinearLayout);
        TextView kanji03TextView = view.findViewById(R.id.kanji03SlideText);
        TextView kanji03TitleTextView = view.findViewById(R.id.kanji03SlideTextViewId);
        TextView kanji03DescriptionTextView = view.findViewById(R.id.kanji03TextDescriptionId);
        kanji03LayoutSlide.setBackgroundColor(kanji03Background[position]);
        kanji03TextView.setText(kanji03Text[position]);
        kanji03TitleTextView.setText(kanji03ListTitles[position]);
        kanji03DescriptionTextView.setText(kanji03ListDescription[position]);
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((LinearLayout)object);
    }
}
