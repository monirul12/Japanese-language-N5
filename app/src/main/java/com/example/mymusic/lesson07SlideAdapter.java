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

public class lesson07SlideAdapter extends PagerAdapter {

    Context lesson7Context;
    LayoutInflater lesson7Inflater;
    //list of lessons

    public String[] lesson7ListHeadlines = {
            "とても এবং あまり",
            "どうですか এবং どんな",
            "が　এর ব্যাবহারঃ",
            "が　এর ব্যাবহারঃ",
            "が　এর ব্যাবহারঃ",
    };

    public String[] lesson7ListTitles = {
            "১ ）とても অর্থ খুব; এটি সাধারণত adjective এর আগে বসে। এটি হ্যাঁ বোধক বাক্যে ব্যবহৃত হয়। এটি একটি adverb.\n" +
                    "২ ）あまりঅর্থ তেমন না, এটি ও সাধারণত adjective এর আগে বসে এবং adjective কে modify করে। এটি একটি adverb . এটি না বোধক বাক্যে ব্যবহৃত হয়।\n\n"+
                    "যেমনঃ ",

            "১ ）どうですか　এর অর্থ হলো কেমন।এটি question word সাধারণত প্রশ্ন করার জন্য এই শব্দ টা ব্যবহার করা হয়।\n" +
                    "২ ）どんな　এর অর্থ হলো কেমন।どんな দ্বারা কেমন ধরনের বা কোন ধরনের অর্থ বুঝায়। এই word টি ও প্রশ্ন করার সময় ব্যবহার করা হয়।\n\n" +
                    "যেমনঃ ",

            "১) がএর অর্থ হলো কিন্তু। দুটি বিপরীতার্থক বাক্যকে সংযুক্ত করতে がবসে।\n" +
                    "২) পাঁচটি verb (います、あります、できます、分かります、いります) এই পাঁচটি verbএর objects(উদ্দেশ্য বা লক্ষ্য ) কে নির্দেশ করতে verb ও objects এর মাঝে が particle ব্যবহার হয়। \n\n " +
                    "যেমনঃ ",

            "৩) কোনো কিছু থাকা, বুঝা, পারা , প্রয়োজন ( います、あります、いります、分かります、できます) পছন্দ , অপছন্দ , দক্ষতা ( 好きです、きらいです、へたです、じょうずです) ইত্যাদি বুঝাতে উল্লেখিত verb ও adjective এর আগে noun থাকলে noun এবং verb , noun এবং objective এর মাঝে が particle বসে। \n" +
                    "৪) জীবিত প্রাণী বা ব্যক্তিকে নির্দেশ করতে います　ব্যবহার করা হয় এবং এর পূর্বে がবসে।\n\n" +
                    " \"যেমনঃ \"",
                    "৫) জড়বস্তুকে নির্দেশ করতে ありますব্যবহৃত হয় এবং এর পূর্বে が বসে।\n" +
                            "৬) যখন subject　প্রশ্নবিদ্ব হয়, তখন subject কে が দ্বারা নির্দেশ করা হয়।\n\n"+
                    "যেমনঃ ",
    } ;
    public String[] lesson7ListDescription = {
            "•\t ペキンはとてもさむいです。\n" +
                    "•\t これはとてもゆうめいなえいがです。\n" +
                    "•\t シャンハイはあまりさむくないです。\n" +
                    "•\t さくらだいがくはあまりゆうめいなだいがくじゃありません。\n",

            "•\t にほん　の　せいかつ　は　どうですか。\n" +
                    "・・・たのしいです。\n" +
                    "•\t これはどうですか。\n" +
                    "•\t ならはどんなまちですか。\n" +
                    " ・・ふるいまちです。\n" +
                    "•\t どんなスポーツがすきですか。\n" +
                    "•\t サッカーがすきです。\n",

            "•\tにほんのたべものはおいしいですが、たかいです。" +
                    "জাপানের খাবার মজার কিন্তু দামি । \n" +
                    "•\t いぬがいます。\n" +
                    "কুকুর আছে ।\n" +
                    "•\t 車があります。\n" +
                    "গাড়ি আছে ।\n" +
                    "•\t 私は日本ごが分かります。\n" +
                    "আমি জাপানিজ ভাষা বুঝি । \n " +
                    "•\t ビザがいります。\n" +
                    "ভিসা আছে ।",

            "•\t 私はイタリアりょうりがすきです。\n" +
                    "আমি ইতালিয়ান রান্না পছন্দ করি । \n" +
                    "私はサッカーがきらいです。\n" +
                    "আমি ফুটবল অপছন্দ করি । \n" +
                    "•\t 私は日本語がへたです\n" +
                    "আমি জাপানিজ ভাষা অদক্ষ । \n" +
                    "•\t　わたしはえいごがじょうずです。\n" +
                    "আমি ইংরেজি ভাষা দক্ষ । \n" +
                    "•\t あそこにやまださんがいます。\n" +
                    "ঐখানে ইয়ামাদা সাহেব আছে । \n" ,

                    "•\t あそこにでんわがあります。\n" +
                    "ঐখানে ফোন আছে । \n" +
                            "•\t にわにだれがいますか。\n" +
                            "বাগানে কে আছে ?",
    } ;

    public int[] lesson7FirstBackground = {
            Color.rgb(245,255,250),
            Color.rgb(245,255,250),
            Color.rgb(245,255,250),
            Color.rgb(245,255,250),
            Color.rgb(245,255,250),
    };

    public lesson07SlideAdapter(Context context){
        this.lesson7Context = context;
    }

    @Override
    public int getCount() {
        return lesson7ListTitles.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return (view == (LinearLayout)object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        lesson7Inflater= (LayoutInflater) lesson7Context.getSystemService(lesson7Context.LAYOUT_INFLATER_SERVICE);
        View view = lesson7Inflater.inflate(R.layout.lesson07_slide,container,false);
        LinearLayout lesson7LayoutSlide = view.findViewById(R.id.lesson7SlideLinearLayout);
        TextView lesson7headlineTextView = view.findViewById(R.id.lesson7SlideHeadlineId);
        TextView lesson7TitleView = view.findViewById(R.id.lesson7SlideTextViewId);
        TextView lesson7DescriptionTextView = view.findViewById(R.id.lesson7SlideTextDescriptionId);
        lesson7LayoutSlide.setBackgroundColor(lesson7FirstBackground[position]);
        lesson7headlineTextView.setText(lesson7ListHeadlines[position]);
        lesson7TitleView.setText(lesson7ListTitles[position]);
        lesson7DescriptionTextView.setText(lesson7ListDescription[position]);
        container.addView(view);
        return view;

    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((LinearLayout)object);
    }
}

