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

public class kanji10SlideAdapter extends PagerAdapter {
    Context kanji10context;
    LayoutInflater kanji10inflater;

    //list of lessons

    public String[] kanji10Text = {
            "今年",
            "去年",
            "時計",
            "名前",
            "今週",
            "先週",
            "来週",
            "午前",
            "午後",
            "子供",
    };

    public String[] kanji10ListTitles = {
            "ことし\n" +
                    "এই বছর",
            "きょねん\n" +
                    "গত বছর",
            "とけい\n" +
                    "ঘড়ি",
            "なまえ\n" +
                    "নাম",
            "こんしゅう\n" +
                    "এই সপ্তাহ",
            "せんしゅう\n" +
                    "গত সপ্তাহ",
            "らいしゅう\n" +
                    "আগামী সপ্তাহ",
            "ごぜん\n" +
                    "সকাল",
            "ごご\n" +
                    "বিকাল",
            "こども\n" +
                    "বাচ্চা",
    } ;
    public String[] kanji10ListDescription = {
            "今年どこもいきません。\n" +
                    "এই বছর কোথাও যাব না",
            "去年にほんへいきました。\n" +
                    "গত বছর জাপানে গিয়েছিলাম।",
            "この時計はいくらです。\n" +
                    "এই ঘড়িটি দাম কত?",
            "あなたの名前はなんですか。\n" +
                    "আপনার নাম কি?",
            "今週どんなものをかいましたか。\n" +
                    "এই সপ্তাহে কি কিনেছিলেন ?",
            "先週どこへいきましたか\n" +
                    "গত সপ্তাহে কোথাই গিয়েছিলেন?",
            "来週にほんへいきます。\n" +
                    "আগামী সপ্তাহে জাপান যাব।",
            "いま午前９じです。\n" +
                    "এখন সকাল ৯ টা বাজে ।",
            "いま午後１１じです。\n" +
                    "এখন রাত ১১টা বাজে।",
            "あなたの子供はなんにんですか。\n" +
                    "আপনার বাচ্চা কত জন।",
    } ;

    public int[] kanji10Background = {
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

    public kanji10SlideAdapter(Context context){
        this.kanji10context = context;
    }


    @Override
    public int getCount() {
        return kanji10ListTitles.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return (view == (LinearLayout)object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        kanji10inflater = (LayoutInflater) kanji10context.getSystemService(kanji10context.LAYOUT_INFLATER_SERVICE);
        View view = kanji10inflater.inflate(R.layout.kanji10_slide,container,false);
        LinearLayout kanji10LayoutSlide = view.findViewById(R.id.kanji10SlideLinearLayout);
        TextView kanji10TextView = view.findViewById(R.id.kanji10SlideText);
        TextView kanji10TitleTextView = view.findViewById(R.id.kanji10SlideTextViewId);
        TextView kanji10DescriptionTextView = view.findViewById(R.id.kanji10TextDescriptionId);
        kanji10LayoutSlide.setBackgroundColor(kanji10Background[position]);
        kanji10TextView.setText(kanji10Text[position]);
        kanji10TitleTextView.setText(kanji10ListTitles[position]);
        kanji10DescriptionTextView.setText(kanji10ListDescription[position]);
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((LinearLayout)object);
    }
}
