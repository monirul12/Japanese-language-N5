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

public class SlideAdapter extends PagerAdapter {


    Context context;
    LayoutInflater inflater;
    //list of images

    public int[] firstImage = {
            R.drawable.a, R.drawable.i, R.drawable.u, R.drawable.e, R.drawable.o,
            R.drawable.ka, R.drawable.ki, R.drawable.ku, R.drawable.ke, R.drawable.ko,
            R.drawable.sa, R.drawable.shi, R.drawable.su, R.drawable.se, R.drawable.so,
            R.drawable.ta, R.drawable.chi, R.drawable.tsu, R.drawable.te, R.drawable.to,
            R.drawable.na, R.drawable.ni, R.drawable.nu, R.drawable.ne, R.drawable.no,
            R.drawable.ma, R.drawable.mi, R.drawable.mu, R.drawable.me, R.drawable.mo,
            R.drawable.ha, R.drawable.hi, R.drawable.fu, R.drawable.he, R.drawable.ho,
            R.drawable.ya, R.drawable.yu, R.drawable.yo,
            R.drawable.ra, R.drawable.ri, R.drawable.ru, R.drawable.re, R.drawable.ro,
            R.drawable.wa, R.drawable.wo, R.drawable.n,
    };

    //list of titles

    public String[] listTitle = {

            "あなた", "いす", "うえ", "えき", "おかね", "かさ", "き", "くつ", "けさ", "こども", "さかな",
            "しけん", "すいか", "せかい", "そと", "たかい", "ちかい", "つくえ", "てがみ", "とけい",
            "なか", "にく", "ぬるえ", "ねだん", "のう", "まつり", "みかん", "むいか", "めがね", "もしもし",
            "はい", "ひま", "ふゆ", "へた", "ほし", "やさい", "ゆか", "ようちえん",
            "らいしゅう", "りんご", "るいか", "れいぞうこ", "ろうそく", "わたし", "しゃしんをとります", "みなさん",

    };

    // list of description

    public String [] firstDescription = {
            "আপনি", "চেয়ার", "উপরে", "স্টেশন", "মুদ্রা", "ছাতা", "গাছ", "আজকের সকাল", "জুতা", "বাচ্চা","মাছ",
            "পরীক্ষা", "তরমুছ", "পৃথিবী", "বাহির", "লম্বা", "নিকটবর্তী", "ডেস্ক", "চিঠি", "ঘড়ি",
            "ভিতরে","মাংস", "কয়েকটি উদাহারন", "মূল্য", "ব্রেন", "উৎসব", "কমলা", "ছয় তারিখ", "চশমা", "হ্যালো",
            "হ্যাঁ","অবসর", "শীত", "অপারদর্শী", "তাঁরা", "শাকসবজি", "মেঝে", "শিশুবিদ্যালয়",
            "আগামী সপ্তাহ","আপেল", "গান", "ফ্রিজ", "মোমবাতিা", "আমি", "ছবিতলা", "সবাই",
    };

    // list of bacground colour

    public int[] firstBackground = {
            Color.rgb(255,255,255), Color.rgb(255,255,255), Color.rgb(255,255,255),
            Color.rgb(255,255,255), Color.rgb(255,255,255), Color.rgb(255,255,255),
            Color.rgb(255,255,255), Color.rgb(255,255,255), Color.rgb(255,255,255),
            Color.rgb(255,255,255), Color.rgb(255,255,255), Color.rgb(255,255,255),
            Color.rgb(255,255,255), Color.rgb(255,255,255), Color.rgb(255,255,255),
            Color.rgb(255,255,255), Color.rgb(255,255,255), Color.rgb(255,255,255),
            Color.rgb(255,255,255), Color.rgb(255,255,255), Color.rgb(255,255,255),
            Color.rgb(255,255,255), Color.rgb(255,255,255), Color.rgb(255,255,255),
            Color.rgb(255,255,255), Color.rgb(255,255,255), Color.rgb(255,255,255),
            Color.rgb(255,255,255), Color.rgb(255,255,255), Color.rgb(255,255,255),
            Color.rgb(255,255,255), Color.rgb(255,255,255), Color.rgb(255,255,255),
            Color.rgb(255,255,255), Color.rgb(255,255,255), Color.rgb(255,255,255),
            Color.rgb(255,255,255),
    };

    public SlideAdapter(Context context){

        this.context = context;

    }
    @Override
    public int getCount() {
        return listTitle.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return (view == (LinearLayout)object) ;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.slide,container,false);
        LinearLayout layoutSlide = view.findViewById(R.id.slideLinearLayout);
        ImageView imageView = view.findViewById(R.id.slideImg);
        TextView titleTextView = view.findViewById(R.id.slideTextViewId);
        TextView descriptionTextView = view.findViewById(R.id.textDescriptionId);
        layoutSlide.setBackgroundColor(firstBackground[position]);
        imageView.setImageResource(firstImage[position]);
        titleTextView.setText(listTitle[position]);
        descriptionTextView.setText(firstDescription[position]);
        container.addView(view);
        return view;

    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((LinearLayout)object);
    }
}
