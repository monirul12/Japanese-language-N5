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

public class lesson03SlideAdapter extends PagerAdapter {

    Context lesson3Context;
    LayoutInflater lesson3Inflater;

    //list of lessons

    public String[] lesson3ListHeadlines = {
            "ここ , そこ , あそこ",
            "の এর ব্যবহার",

    };

    public String[] lesson3ListTitles = {
            "ここ、そこ、あそこ এই শব্দ গুলা সাধারনত place বা স্থান কে নির্দেশ করার জন্য ব্যবহার করা হয়। বাক্যে Topic(বিষয়/প্রসঙ্গ)আলোচনার বিষয় এর পর は বসে।\n" +
                    "ভোগলিক অবস্থান বা স্থানকে,সময় প্রকাশক বা নির্দেশক শব্দকে Topic হিসেবে ব্যবহার এর জন্য এগুলোর (noun) পর は বসে।どこদিয়ে কোথায়どちらদিয়ে কোন দিকে নির্দেশ করা বুঝায়। ",

            "の particle টি「র, এর 」অর্থে ব্যবহার করা হয়।বাক্যে পাশাপাশি দুটি noun যখন একটি আরেকটি কে modify করে তখন noun দুটির মাঝে の particle বসে।",


    } ;
    public String[] lesson3ListDescription = {
            "•\tここはきょうしつです。\n" +
                    "•\tそこはだいがくです。\n" +
                    "•\tあそこはひろしまです。\n" +
                    "•\tおてあらいはあそこです。\n" +
                    "•\tでんわは２かいです。\n" +
                    "•\tやまださんはじむしょです。\n" +
                    "•\tおてあらい は どこですか。\n" +
                    "•\tエレベーターはどちらですか。\n",

            "•\tこれ　は　どこの　コンピューター　ですか。\n" +
                    "…にほんの　コンピューターです。\n" +
                    "•\tこれ　は　にほん　の　じどうしゃです。\n" +
                    "•\tそれ　は　アメリカ　の　テレビ　です。\n",

    } ;

    public int[] lesson3FirstBackground = {
            Color.rgb(245,255,250),
            Color.rgb(245,255,250),
    };

    public lesson03SlideAdapter(Context context){
        this.lesson3Context = context;
    }

    @Override
    public int getCount() {
        return lesson3ListTitles.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return (view == (LinearLayout)object);
    }


    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        lesson3Inflater= (LayoutInflater) lesson3Context.getSystemService(lesson3Context.LAYOUT_INFLATER_SERVICE);
        View view = lesson3Inflater.inflate(R.layout.lesson03_slide,container,false);
        LinearLayout lesson3LayoutSlide = view.findViewById(R.id.lesson3SlideLinearLayout);
        TextView lesson3headlineTextView = view.findViewById(R.id.lesson3SlideHeadlineId);
        TextView lesson3TitleView = view.findViewById(R.id.lesson3SlideTextViewId);
        TextView lesson3DescriptionTextView = view.findViewById(R.id.lesson3SlideTextDescriptionId);
        lesson3LayoutSlide.setBackgroundColor(lesson3FirstBackground[position]);
        lesson3headlineTextView.setText(lesson3ListHeadlines[position]);
        lesson3TitleView.setText(lesson3ListTitles[position]);
        lesson3DescriptionTextView.setText(lesson3ListDescription[position]);
        container.addView(view);
        return view;

    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((LinearLayout)object);
    }
}
