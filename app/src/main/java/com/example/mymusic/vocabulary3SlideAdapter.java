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

public class vocabulary3SlideAdapter extends PagerAdapter {
    Context vocabulary03context;
    LayoutInflater vocabulary03inflater;

    //list of lessons

    public String[] vocabulary03Text = {
            "\u25A0ここ　　　＝ এখানে।(আমার কাছের স্থান।)\n" +
                    "\u25A0そこ　　　＝ ওখানে।(আপনার কাছের স্থান।)\n" +
                    "\u25A0あそこ　　＝ ঐখানে।(একটু দুরের স্থান।)\n" +
                    "\u25A0どこ　　　＝ কোথায়।\n" +
                    "\u25A0こちら　　＝ এই দিকে।(ここএর মার্জিত রূপ ।)\n" +
                    "\u25A0そちら　　＝ ওই দিকে।(আপনার কাছের স্থান।)\n" +
                    "\u25A0あちら　　＝ ঐ দিকে।(একটু দুরের স্থান।)\n" +
                    "\u25A0どちら　　＝ কোনদিকে।(どこএর মার্জিত রূপ ।)\n" +
                    "\u25A0きょうしつ＝ ক্লাসরুম।\n" +
                    "\u25A0しょくどう＝ ক্যান্টিন।\n" +
                    "\u25A0じむしょ　＝ অফিস রুম।\n" +
                    "\u25A0かいぎしつ＝ মিটিংরুম।\n" +
                    "\u25A0うけつけ　＝ রিশিপশন ডেস্ক।\n" +
                    "\u25A0へや　　　＝ রুম/কক্ষ।\n" +
                    "\u25A0おてあらい＝ টয়লেট।\n" +
                    "\u25A0かいだん　＝ সিঁড়ি।\n" +
                    "\u25A0おくに　　＝ আপনার দেশ।\n" +
                    "\u25A0かいしゃ　＝ কোম্পানি।\n" +
                    "\u25A0うち　　　＝ বাসা/বাড়ি।\n" +
                    "\u25A0でんわ　　＝ টেলিফোন।\n" +
                    "\u25A0くつ　　　＝ জুতা\n" ,

            "\u25A0たばこ　　　　　　＝ সিগারেট।\n" +
                    "\u25A0うりば　　　　　　＝ ডিপার্টমেন্ট ষ্টোর এর বিভিন্ন কাউন্টার।\n" +
                    "\u25A0ちか　　　　　　　＝ মাটির নিচের তলা।\n" +
                    "\u25A0なんがい　　　　　＝ কোনতলা?\n" +
                    "\u25A0いくら　　　　　　＝ কত দাম?\n" +
                    "\u25A0ひゃく　　　　　　＝ একশত।\n" +
                    "\u25A0せん　　　　　　　＝ এক হাজার।\n" +
                    "\u25A0まん　　　　　　　＝ দশ হাজার।\n" +
                    "\u25A0〜えん　　　　　　＝ -ইয়েন।\n" +
                    "\u25A0〜かい・〜がい　　＝ -তলা।\n" +
                    "\u25A0すみません　　　　＝ একটু শুনুন।\n" +
                    "\u25A0〜でございます　　＝ -দেসু এর মার্জিত রূপ।\n" +
                    "\u25A0〜をみせてください＝ দয়াকরে -টা দেখাবেন।।\n" +
                    "\u25A0じゃ　　　　　　　＝ তাহলে।\n" +
                    "\u25A0〜をください　　　＝ দয়া করে - টা আমাকে দিন।।\n" +
                    "\u25A0しんおおさか　　　＝ ওওসাকার একটি রেলস্টেশনএর নাম।\n" +
                    "\u25A0イタリア　　　　　＝ ইতালি।\n" +
                    "\u25A0スイス　　　　　　＝ সুইজারল্যান্ড।\n" +
                    "\u25A0ロビー　　　　　　＝ লবি।\n" ,

            "\u25A0エレベーター　　＝ লিফট।\n" +
                    "\u25A0エスカレーター　＝　এসক্যালেটর।\n" +
                    "\u25A0ウイン　　　　　＝　ওয়াইন।\n" ,
    };

    public int[] vocabulary03Background = {
            Color.rgb(245, 255, 250),
            Color.rgb(245, 255, 250),
            Color.rgb(245, 255, 250),

    };

    public vocabulary3SlideAdapter(Context context) {
        this.vocabulary03context = context;
    }


    @Override
    public int getCount() { return vocabulary03Text.length; }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return (view == (LinearLayout) object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        vocabulary03inflater = (LayoutInflater) vocabulary03context.getSystemService(vocabulary03context.LAYOUT_INFLATER_SERVICE);
        View view = vocabulary03inflater.inflate(R.layout.vocabulary03_slide, container, false);
        LinearLayout vocabulary03LayoutSlide = view.findViewById(R.id.vocabulary03SlideLinearLayout);
        TextView vocabulary03TextView = view.findViewById(R.id.vocabulary03SlideText);
        vocabulary03LayoutSlide.setBackgroundColor(vocabulary03Background[position]);
        vocabulary03TextView.setText(vocabulary03Text[position]);
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((LinearLayout) object);
    }
}
