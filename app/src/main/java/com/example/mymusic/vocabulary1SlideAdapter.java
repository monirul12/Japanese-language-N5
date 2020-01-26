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

public class vocabulary1SlideAdapter extends PagerAdapter {

    Context vocabulary01context;
    LayoutInflater vocabulary01inflater;

    //list of lessons

    public String[] vocabulary01Text = {
            "\u25A0わたし　　　　＝ আমি।\n" +
                    "\u25A0あなた　　　　＝ আপনি।\n" +
                    "\u25A0わたしたち　　＝ আমরা।\n" +
                    "\u25A0あのひと　　　＝ ঐ বাক্তি।\n" +
                    "\u25A0みなさん　　　＝ সবাই\n" +
                    "\u25A0せんせい　　　＝ শিক্ষক।(তবে নিজের পেশা বলার সময়।)\n" +
                    "\u25A0きょうし　　　＝ শিক্ষক।\n" +
                    "\u25A0がくせい　　　＝ ছাত্র।\n" +
                    "\u25A0かいしゃいん　＝ কোম্পানিতে চাকুরীজীবী।\n" +
                    "\u25A0しゃいん　　　＝ যেকোনো কোম্পানিতে চাকুরিরত বাক্তি।\nযেমনঃ গ্রামীনফোনে চাকুরীরত বাক্তি।\n" +
                    "\u25A0ぎんこういん　＝ ব্যাংক ককর্মকর্তা।\n" +
                    "\u25A0いしゃ　　　　＝ ডাক্তার।\n" +
                    "\u25A0けんきゅうしゃ＝ গবেষক।\n" +
                    "\u25A0だいがく　　　＝ বিশ্ববিদ্যালয়।\n" +
                    "\u25A0びょういん　　＝ হাসপাতাল।\n" +
                    "\u25A0でんき　　　　＝ বিদ্যুৎ/লাইট।\n" +
                    "\u25A0だれ　　　　　＝ কে?\n" +
                    "\u25A0なんさい　　　＝ কত বছর?\n" +
                    "\u25A0おいくつ　　　＝ কত বছর?\n" +
                    "\u25A0はい　　　　　＝ হ্যাঁ।\n" +
                    "\u25A0いいえ　　　　＝ না।\n" ,

            "\u25A0しつれいですが　＝ যদি কিছু মনে না করেন।\n" +
                    "\u25A0おなまえは？　　＝ আপনার নাম কি ?\n" +
                    "\u25A0はじめまして　　＝ আপনার সাথে প্রথমবারের মত দেখা হল। (নিজের পরিচয় দেওয়ার ব্যাবহার করা হয়।)\n" +
                    "\u25A0おねがいします　＝ নিন।\n" +
                    "\u25A0アメリカ　　　　＝ আমেরিকা।\n" +
                    "\u25A0イギリス　　　　＝ ইংল্যান্ড।\n" +
                    "\u25A0インド　　　　　＝ ইন্ডিয়া।\n" +
                    "\u25A0インドネシア　　＝ ইন্দোনেশিয়া।\n" +
                    "\u25A0かんこく　　　　＝ দক্ষিণ কোরিয়া।\n" +
                    "\u25A0タイ　　　　　　＝ থাইল্যান্ড।\n" +
                    "\u25A0ちゅうごく　　　＝ চীন।\n" +
                    "\u25A0ドイツ　　　　　＝ জার্মান।\n" +
                    "\u25A0にほん　　　　　＝ জাপান।\n" +
                    "\u25A0フランス　　　　＝ ফ্রান্স।\n" +
                    "\u25A0ブラジル　　　　＝ ব্রাজিল।\n" +
                    "\u25A0さくらだいがく　＝ সাকুরা বিশ্ববিদ্যালয়।\n" +
                    "(কাল্পনিক নাম।)\n" +
                    "\u25A0ふじだいがく　　＝ ফুজি বিশ্ববিদ্যালয়।\n" +
                    "(কাল্পনিক নাম।)\n" +
                    "\u25A0ブラジルエアー　＝ ব্রাজিল এয়ারলাইন্স।\n" +
                    "(কাল্পনিক নাম।)\n" +
                    "\u25A0こうべびょういん＝ কউবে হাসপাতাল।\n" ,

            "\u25A0〜さん　＝ জনাব/বেগম (নামের সাথে ব্যাবহার করা হয়।)\n" +
                    "\u25A0〜ちゃん＝　ছোট শিশুর নামের সাথে ব্যাবহার করা হয়।\n" +
                    "\u25A0〜くん　＝　বালকের নামের সাথে ব্যাবহার করা হয়।\n" +
                    "\u25A0〜じん　＝　নাগরিত্ত বুঝানোর ক্ষেত্রে ব্যাবহার করা হয়।\n" +
                    "\u25A0〜さい　＝　বৎসর বয়স।\n",
    };

    public int[] vocabulary01Background = {
            Color.rgb(245, 255, 250),
            Color.rgb(245, 255, 250),
            Color.rgb(245, 255, 250),

    };

    public vocabulary1SlideAdapter(Context context) {
        this.vocabulary01context = context;
    }


    @Override
    public int getCount() { return vocabulary01Text.length; }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return (view == (LinearLayout) object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        vocabulary01inflater = (LayoutInflater) vocabulary01context.getSystemService(vocabulary01context.LAYOUT_INFLATER_SERVICE);
        View view = vocabulary01inflater.inflate(R.layout.vocabulary01_slide, container, false);
        LinearLayout vocabulary01LayoutSlide = view.findViewById(R.id.vocabulary01SlideLinearLayout);
        TextView vocabulary01TextView = view.findViewById(R.id.vocabulary01SlideText);
        vocabulary01LayoutSlide.setBackgroundColor(vocabulary01Background[position]);
        vocabulary01TextView.setText(vocabulary01Text[position]);
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((LinearLayout) object);
    }
}
