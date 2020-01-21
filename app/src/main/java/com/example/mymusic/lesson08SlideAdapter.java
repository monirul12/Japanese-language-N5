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

class lesson08SlideAdapter extends PagerAdapter {

    Context lesson8Context;
    LayoutInflater lesson8Inflater;
    //list of lessons

    public String[] lesson8ListHeadlines = {
            "গণনা",
            "より,どちらがএর ব্যবহার",
            "いちばんএর ব্যবহার",
    };

    public String[] lesson8ListTitles = {
            "১) কোন বস্তু যেমন (আপেল, কমলা, চাবি) ইত্যাদি গণনা করতে ひとつ、ふたつ　ব্যবহার করা হয়। \n" +
                    "২) পাতলা জিনিস গণনার জন্য まいব্যবহার করা হয়।\n" +
                    "৩) মানুষ গণনা করার জন্য にんব্যবহার করা হয়। তবে প্রথম ২ জন এর ক্ষেত্রে ব্যতিক্রম।\n" +
                    "৪) কোন কাজে কত সময় প্রয়োজন হয়েছে বা হবে এমন প্রশ্ন জিজ্ঞাস করতে どのくらい　ব্যবহার করতে হয়।\n" +
                    "৫) সময়ের পরিসর বা ব্যাপ্তির আনুমানিক (প্রায়) হিসাব বুঝাতে ぐらいব্যবহার করা হয়।\n\n" +
                    "যেমনঃ ",

            "১) よりএর অর্থ চেয়ে ।এই শব্দটি দুটি বাক্যের মধ্যে তুলনা বুঝায়।\n" +
                    "২) どちらঅর্থ কোনটি।দুটি জিনিসের মধ্যে কোনটি বুঝাতে どちらがব্যবহৃত হয়। এবং দুটির মধ্যে একটি choice বুঝাতে ほうがব্যবহৃত হয়\n\n" +
                    "যেমনঃ ",

            "কোন বাক্যে যদি いちばん　এবং adjective থাকে তাহলে いちばん এর পূর্বে যে শব্দ থাকবে তার সাথে が　যোগ করতে হবে।\n\n" +
                    "যেমনঃ ",

    } ;
    public String[] lesson8ListDescription = {
            "•\t りんごをよっつかいました。\n" +
                    "আপেল চারটা কিনেসিলাম । \n" +
                    "•\t 90 えんのきってを１まいください。\n" +
                    "৯০ ইয়েন এর ডাকটিকেট ১ পাতা দিন। \n" +
                    "•\t このかいしゃにがいこくじんがひとりいます。" +
                    "এই কোম্পানি বিদেশি স্টাফ ১ জন আছে । \n" +
                    "•\t あなたはくにでどのくらいにほんごをべんきょうしましたか。\n" +
                    "আপনি দেশে প্রাই কত সময়ই জাপানিজ ভাষা পড়াশোনা করেছিলেন। \n " +
                    "•\t がっこうにせんせいが３０にんぐらいいます。\n" +
                    "স্কুলে শিক্ষক প্রাই ৩০ জন আছে ।",

            "•\t このくるまはあのくるまよりおおきいです。\n" +
                    "এই গাড়ি ঐ গাড়ি থেকে বড়। \n" +
                    "•\t サッカーと　やきゅうと　どちらが　おもしろい　ですか。\n" +
                    "ফুটবল এবং বেসবল কোনটা আনন্দদায়ক । \n" +
                    "・・・サッカーの　ほうが　おもしろいです。\n" +
                    "ফুটবলটাই আনন্দদায়ক ।",

            "•\t にほんりょうりのなかでなにがいちばんおいしいですか。\n" +
                    "জাপানিজ রান্না ভিতরে কি সবচেয়ে মজা? \n " +
                    "・\t・・てんぷらが　いちばん　おいしいです。\n" +
                    "তেনপুরা সবচেয়ে মজা । \n" +
                    "•\t ヨーロッパ　で　どこが　いちばん　よかったですか。\n" +
                    "ইউরোপের মধ্যে কোথায় ভাল ছিল । \n" +
                    "・\t・・　スイスが　いちばん　よかったです。\n" +
                    "সুইজারল্যান্ড সবচেয়ে ভাল ছিল । \n" +
                    "•\t かぞく　で　だれが　いちばん　せがたかい　ですか。\n" +
                    "পরিবারের মধ্যে কে সবচেয়ে লম্বা । \n" +
                    "・\t・・おとうと　が　いちばん　せがたかい　です。\n" +
                    "ছোট ভাই সবচেয়ে লম্বা ।",

    } ;

    public int[] lesson8FirstBackground = {
            Color.rgb(245,255,250),
            Color.rgb(245,255,250),
            Color.rgb(245,255,250),
    };

    public lesson08SlideAdapter(Context context){
        this.lesson8Context = context;
    }

    @Override
    public int getCount() {
        return lesson8ListTitles.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return (view == (LinearLayout)object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        lesson8Inflater= (LayoutInflater) lesson8Context.getSystemService(lesson8Context.LAYOUT_INFLATER_SERVICE);
        View view = lesson8Inflater.inflate(R.layout.lesson08_slide,container,false);
        LinearLayout lesson8LayoutSlide = view.findViewById(R.id.lesson8SlideLinearLayout);
        TextView lesson8headlineTextView = view.findViewById(R.id.lesson8SlideHeadlineId);
        TextView lesson8TitleView = view.findViewById(R.id.lesson8SlideTextViewId);
        TextView lesson8DescriptionTextView = view.findViewById(R.id.lesson8SlideTextDescriptionId);
        lesson8LayoutSlide.setBackgroundColor(lesson8FirstBackground[position]);
        lesson8headlineTextView.setText(lesson8ListHeadlines[position]);
        lesson8TitleView.setText(lesson8ListTitles[position]);
        lesson8DescriptionTextView.setText(lesson8ListDescription[position]);
        container.addView(view);
        return view;

    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((LinearLayout)object);
    }
}

