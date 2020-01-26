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

public class kanji11SlideAdapter extends PagerAdapter {

    Context kanji11context;
    LayoutInflater kanji11inflater;

    //list of lessons

    public String[] kanji11Text = {
            "図書館",
            "働きます",
            "見ます",
            "子供",
            "友達",
            "花",
            "部屋",
            "夏",
            "冬",
            "秋",
    };

    public String[] kanji11ListTitles = {
            "としょかん\n" +
                    "লাইব্রেরি",
            "はたらきます\n" +
                    "কাজ করা",
            "みます\n" +
                    "দেখা",
            "こども\n" +
                    "বাচ্চা",
            "ともだち\n" +
                    "বন্ধু",
            "はな\n" +
                    "ফুল",
            "へや\n" +
                    "রুম",
            "なつ\n" +
                    "গ্রীষ্মকাল",
            "ふゆ\n" +
                    "শীতকাল",
            "あき\n" +
                    "শরৎকাল",
    } ;
    public String[] kanji11ListDescription = {
            "図書館へ行きます。\n" +
                    "লাইব্রিতে যাব।",
            "レストランで働いています。\n" +
                    "রেস্টুরেন্টএ কাজ করি ।",
            "えいがを見ます。\n" +
                    "ছিনেমা দেখি ।",
            "子供はだいすきです。\n" +
                    "বাচ্চা অনেক পছন্দ করি।",
            "友達とにほんへいきます。\n" +
                    "বন্ধুর সাথে জাপানে যাব।",
            "ははに花をあげました。\n" +
                    "মাকে ফুল উপহার দিয়েছিলাম।",
            "部屋のなかにだれがいますか。\n" +
                    "রুমের ভিতরে কে আছেন?",
            "夏はどうですか。\n" +
                    "গ্রীষ্মকাল কেমন?",
            "冬のときはどうですか。\n" +
                    "ঠাণ্ডা সময়টা কেমন?",
            "秋のときどこがいいですか。\n" +
                    "শরৎকালের সময় কোথায় ভাল?",
    } ;

    public int[] kanji11Background = {
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

    public kanji11SlideAdapter(Context context){
        this.kanji11context = context;
    }


    @Override
    public int getCount() {
        return kanji11ListTitles.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return (view == (LinearLayout)object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        kanji11inflater = (LayoutInflater) kanji11context.getSystemService(kanji11context.LAYOUT_INFLATER_SERVICE);
        View view = kanji11inflater.inflate(R.layout.kanji11_slide,container,false);
        LinearLayout kanji11LayoutSlide = view.findViewById(R.id.kanji11SlideLinearLayout);
        TextView kanji11TextView = view.findViewById(R.id.kanji11SlideText);
        TextView kanji11TitleTextView = view.findViewById(R.id.kanji11SlideTextViewId);
        TextView kanji11DescriptionTextView = view.findViewById(R.id.kanji11TextDescriptionId);
        kanji11LayoutSlide.setBackgroundColor(kanji11Background[position]);
        kanji11TextView.setText(kanji11Text[position]);
        kanji11TitleTextView.setText(kanji11ListTitles[position]);
        kanji11DescriptionTextView.setText(kanji11ListDescription[position]);
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((LinearLayout)object);
    }
}
