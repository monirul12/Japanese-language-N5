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

public class vocabulary2SlideAdapter extends PagerAdapter {

    Context vocabulary02context;
    LayoutInflater vocabulary02inflater;

    //list of lessons

    public String[] vocabulary02Text = {
            "\u25A0これ　　　　　＝ এটা(বস্তু)।\n" +
                    "\u25A0それ　　　　　＝ ওটা(বস্তু)।\n" +
                    "\u25A0あれ　　　　　＝ ঐটা(বস্তু)।\n" +
                    "\u25A0この〜　　　　＝ এই〜(বস্তু বা প্রাণী)।\n" +
                    "\u25A0その〜　　　　＝ ওই〜(বস্তু বা প্রাণী)।\n" +
                    "\u25A0あの〜　　　　＝ ঐ〜(বস্তু বা প্রাণী)।\n" +
                    "\u25A0ほん　　　　　＝ বই।\n" +
                    "\u25A0じしょ　　　　＝ অভিধান।\n" +
                    "\u25A0ざっし　　　　＝ ম্যাগাজিন।\n" +
                    "\u25A0しんぶん　　　＝ সংবাদপত্র।\n" +
                    "\u25A0てちょう　　　＝ পকেট ডায়েরি।\n" +
                    "\u25A0めいし　　　　＝ ভিজিটিং কার্ড।\n" +
                    "\u25A0えんぴつ　　　＝ পেন্সিল।\n" +
                    "\u25A0かぎ　　　　　＝ চাবি।\n" +
                    "\u25A0とけい　　　　＝ ঘড়ি।\n" +
                    "\u25A0かさ　　　　　＝ ছাতা।\n" +
                    "\u25A0かばん　　　　＝ ব্যাগ\n" +
                    "\u25A0じどうしゃ　　＝ মটর গাড়ি।\n" +
                    "\u25A0つくえ　　　　＝ ডেস্ক\n" +
                    "\u25A0いす　　　　　＝ চেয়ার\n" +
                    "\u25A0えいご　　　　＝ ইংরেজি ভাষা।\n" ,

            "\u25A0にほんご　　　　＝ জাপানিজ ভাষা।\n" +
                    "\u25A0〜ご　　　　　　＝ 〜ভাষা।\n" +
                    "\u25A0なん　　　　　　＝ কি?\n" +
                    "\u25A0そう　　　　　　＝ তাই।\n" +
                    "\u25A0ちがいます　　　＝ না সেটা নয়। আপনার বক্তব্য ঠিক না। \n" +
                    "\u25A0そうですか　　　＝ তাই নাকি।\n" +
                    "\u25A0あのう　　　　　＝ কিছু বলার আগে দ্বিধাবধ করার জন্য ব্যাবহার করা হয়।\n" +
                    "\u25A0ほんのきもちです＝ সামান্য কৃতজ্ঞতার প্রতীক।\n" +
                    "\u25A0どうぞ　　　　　＝ অনুগ্রহ পূর্বক নিন।\n" +
                    "\u25A0どうも　　　　　＝ ধন্যবাদ।\n" +
                    "\u25A0ノート　　　　　＝ নোটবুক।\n" +
                    "\u25A0カード　　　　　＝ কার্ড।\n" +
                    "\u25A0テレホンカード　＝ টেলিফোন কার্ড।\n" +
                    "\u25A0ボールペン　　　＝ বলপেন।\n" +
                    "\u25A0シャープペンシル＝ সিঙ্গাপুর।\n" +
                    "\u25A0カセットテープ　＝ ক্যাসেট টেপ।\n" +
                    "\u25A0テープレコだー　＝ টেপ রেকর্ডার।\n" +
                    "\u25A0テレビ　　　　　＝ টেলিভিশন।\n" +
                    "\u25A0ラジオ　　　　　＝ রেডিও।\n" ,

            "\u25A0コンピューター　　　　　　＝ কম্পিটার।\n" +
                    "\u25A0チョコレート　　　　　　　＝ চকলেট।\n" +
                    "\u25A0コーヒー　　　　　　　　　＝ কফি।\n"+
                    "\u25A0どうもありがとうございます＝ আপনাকে অশেষ ধন্যবাদ।\n" +
                    "\u25A0いつもおせわになります　　＝ এখন থেকে আপনার অনুগ্রহ/সাহায্য আশা করি।\n" +
                    "\u25A0こちらこそよろしく　　　　＝ আমার তরফ থেকেও একইভাবে আশা করি।\n" ,
    };


    public int[] vocabulary02Background = {
            Color.rgb(245, 255, 250),
            Color.rgb(245, 255, 250),
            Color.rgb(245, 255, 250),

    };

    public vocabulary2SlideAdapter(Context context) {
        this.vocabulary02context = context;
    }


    @Override
    public int getCount() { return vocabulary02Text.length; }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return (view == (LinearLayout) object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        vocabulary02inflater = (LayoutInflater) vocabulary02context.getSystemService(vocabulary02context.LAYOUT_INFLATER_SERVICE);
        View view = vocabulary02inflater.inflate(R.layout.vocabulary02_slide, container, false);
        LinearLayout vocabulary02LayoutSlide = view.findViewById(R.id.vocabulary02SlideLinearLayout);
        TextView vocabulary02TextView = view.findViewById(R.id.vocabulary02SlideText);
        vocabulary02LayoutSlide.setBackgroundColor(vocabulary02Background[position]);
        vocabulary02TextView.setText(vocabulary02Text[position]);
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((LinearLayout) object);
    }
}
