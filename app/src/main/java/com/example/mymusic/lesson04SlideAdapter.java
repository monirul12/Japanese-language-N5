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

public class lesson04SlideAdapter extends PagerAdapter {
    Context lesson4Context;
    LayoutInflater lesson4Inflater;
    //list of lessons

    public String[] lesson4ListHeadlines = {
            "に 〜 particle এর ব্যাবহার",
            "ます form",
            "ヘ　particle এর ব্যবহার",
            "で　particle এর ব্যবহার ",
            "と particle এর ব্যাবহার।",
            "ね এর ব্যাবহার",
            "いつ এর ব্যাবহার",
            "よ এর ব্যাবহার",
    };

    public String[] lesson4ListTitles = {
            "に দিয়ে ইংরেজীতে in, at, to, for ইত্যাদি preposition বুঝায়।Verb এর কাজ সংঘটিত হওয়ার সময়টিকে নির্দেশ করতে সময়ের পর にparticle বসে। কিন্তু সময়টিকে শুধু সংখ্যা প্রকাশ করলেই সময়ের পর にবসবে অন্যথায় নয়।",

            "কোন শব্দের শেষে ますযুক্ত থাকলে সাধারণত সেই শব্দগুলোকে  verb বলা হয়।  আর এই যুক্ত verb গুলোই verb এর ますform হিসেবে পরিচিত।\n\n" +
                    "যেমন : \n" +
                    "বর্তমান এবং ভবিষ্যৎকাল (হ্যাঁ) হচ্ছে 〜ます\n"  +
                    "বর্তমান এবং ভবিষ্যৎকাল (না) হচ্ছে 〜ません\n" +
                    "অতীতকালের  (হ্যাঁ) হচ্ছে 〜　ました\n" +
                    "অতীতকালের  (না) হচ্ছে 〜　ませんでした\n",

            "কোন স্থানে যাওয়া , আসা, ফিরে আসা/ যাওয়া বুঝালে ঐ স্থানের নামের পর ヘ particle  ব্যবহৃত হয়। ヘ particle টি বাংলা এ এর মত উচ্চারণ হয়।\n" +
                    "どこも、なにも、だれも এসব শব্দ যদি কোন sentence এ থাকে তাহলে sentence টি না বোধক form করতে হবে। \n\n" +
                    "যেমন : \n",

            "যানবাহন দিয়ে যাওয়া বা আসা বুঝালে যানবাহনের নামের পর で particle বসে।\n\n" +
                    "＊কিন্তু পায়েহেঁটে কোথাও যাওয়া বুঝালে সে ক্ষেত্রে で particle টি বসবে না।\n\n"+
                    "যেমন : \n",

            "একই শ্রেনীভুক্ত দুই বা তার অধিক noun কে যুক্ত করতে と particle ব্যবহার হয়। \n"+
                    "とparticle টি  “ও,এবং”  অর্থে ব্যাবহার হয়। \n" +
                    "যখন কোন ব্যক্তি বা প্রাণীর সাথে কাজ করা হয় তখন ঐ ব্যক্তি বা প্রাণীর নামের পর とparticle ব্যবহৃত হয়।\n\n" +
                    "＊নিজে নিজে কোন কাজ করলে と  এর পরিবর্তে  ひとりで　হবে।\n" +
                    "〜から মানে “থেকে”অর্থে ব্যাবহার হয়। \n" +
                    "〜まで মানে “পর্যন্ত”অর্থে ব্যাবহার হয়। \n" +
                    "\n" +
                    "যেমন: \n",

            "বক্তাকে (speaker ) সমবেদনা বা সহানুভূতি দেখাতে অথবা বক্তার কোনো বক্তব্যে শ্রোতার (Listener) সম্মতি অথবা কোনো কিছু নিশ্চিত করা বুঝাতে বাক্যের শেষে 〜ね বসে। \n\n" +
                    "যেমন: \n",
            "いつ　মানে কখন । いつ দিয়ে প্রশ্ন করা হয়।\n\n" +
                    "যেমনঃ ",


            "কোন একটি তথ্য যেটা শ্রোতা জানেনা অথবা কোন বিষয়ে অভিমত বা রায় জানাতে বাক্যের শেষে よবসানো হয়। বাক্যের শেষে よটা ব্যবহার করা হয় confirm করার জন্য।\n\n" +
                    "যেমনঃ ",
    } ;
    public String[] lesson4ListDescription = {
            "•\tふゆにゆきがふります。\n" +
                    "•\tわたしは6じはんにおきます。\n" +
                    "•\t12じ にねます。\n" +
                    "•\t5がつににほんへきました。\n" +
                    "•\tあしたうちへかえります。\n" +
                    "•\tかようびににほんへいきます。\n",

            "•\tいます、いきます、かいます 、おきますইত্যাদি। ",

            "•\tきようとへいきます。\n" +
                    "•\tにほんへきました。\n" +
                    "•\tうちへかえります。\n" +
                    "•\tどこもいきません。\n" +
                    "•\tなにもたべません。\n" +
                    "•\tだれもいません。\n",

            "•\tバスーでいきます。\n" +
                    "•\tタクシーできました。\n" +
                    "•\tえきからあるいてかえりました。",

            "•\tぎんこうのやすみはどようびとにちようびです。\n" +
                    "•\tひとりでにほんへいきます。\n" +
                    "•\t9じから5じまではたらきます。\n" +
                    "•\tかぞくとにほんへきました。\n" +
                    "•\t12じから14じまでべんきょうします。\n",

            "•\tまいにち10じごろまでべんきょうします。\n" +
                    "たいへんですね。\n",
            "•\tいつにほんへきました。\n" +
                    "……３がつ２５にちにきました。\n" +
                    "•\tいつにほんごをべんきょうしましたか\n" +
                    "•\tいつたんじょうびですか\n",

            "\uF0A7\tこのでんしゃは こうしえんへいきますか。\n" +
                    "........いいえ、いきません。つぎのふつうですよ。\n",
    } ;

    public int[] lesson4FirstBackground = {
            Color.rgb(245,255,250),
            Color.rgb(245,255,250),
            Color.rgb(245,255,250),
            Color.rgb(245,255,250),
            Color.rgb(245,255,250),
            Color.rgb(245,255,250),
            Color.rgb(245,255,250),
            Color.rgb(245,255,250),
    };

    public lesson04SlideAdapter(Context context){
        this.lesson4Context = context;
    }

    @Override
    public int getCount() {
        return lesson4ListTitles.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return (view == (LinearLayout)object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        lesson4Inflater= (LayoutInflater) lesson4Context.getSystemService(lesson4Context.LAYOUT_INFLATER_SERVICE);
        View view = lesson4Inflater.inflate(R.layout.lesson04_slide,container,false);
        LinearLayout lesson4LayoutSlide = view.findViewById(R.id.lesson4SlideLinearLayout);
        TextView lesson4headlineTextView = view.findViewById(R.id.lesson4SlideHeadlineId);
        TextView lesson4TitleView = view.findViewById(R.id.lesson4SlideTextViewId);
        TextView lesson4DescriptionTextView = view.findViewById(R.id.lesson4SlideTextDescriptionId);
        lesson4LayoutSlide.setBackgroundColor(lesson4FirstBackground[position]);
        lesson4headlineTextView.setText(lesson4ListHeadlines[position]);
        lesson4TitleView.setText(lesson4ListTitles[position]);
        lesson4DescriptionTextView.setText(lesson4ListDescription[position]);
        container.addView(view);
        return view;

    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((LinearLayout)object);
    }
}
