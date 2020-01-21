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

class lesson11SlideAdapter extends PagerAdapter {

    Context lesson11Context;
    LayoutInflater lesson11Inflater;
    //list of lessons

    public String[] lesson11ListHeadlines = {
            "て ― form もいいです",
            "て ― form はいけません",
            "て ― form ব্যবহার ",
            " Adjective এর ব্যবহার ",
    };

    public String[] lesson11ListTitles = {
            "কোন কাজের জন্য অনুমতি চাওয়া বা কাউকে অনুমতি দেওয়া  বুঝাতে verbএরて　formএর  পরもいいです　ব্যবহৃত হয়।\n\n" +
                    "যেমনঃ  ",

            "কোন কাজ করতে নিষেধ করা বুঝাতে verbএরて　formএর  পর はいけませんব্যবহৃত হয়।\n\n " +
            "যেমনঃ ",

            "কতগুলো ছোট ছোট sentence কে একসাথে যোগ করার জন্য て form ব্যবহার করা হয়।て form দিয়ে অনেকগুলো কাজ একসাথে করা হয়। অনেক গুলো কাজের বর্ণনা একসাথে দেয়া যায়।\n" +
                    "একটি কাজ শেষ করার পর আরেকটি কাজ করা বুঝাতে てform এর সাথে からবসে।\n\n" +
                    "যেমনঃ ",

            "১) দুটি sentence কে একসাথে যোগ করার জন্যいadjective এরい উঠে গিয়ে くて　যুক্ত হবে। \n" +
                    "২) দুটি sentence কে একসাথে যোগ করার জন্য প্রথম sentence এ noun বা なadjective এরপর で বসে।\n" +
                    "৩) একটি কাজ শেষ করার পর আরেকটি কাজ করা বুঝাতে てform এর সাথে からবসে।\n" +
                    "৪) কোন ব্যাক্তি বা বস্তুর দোষ গুণ অবস্থা বুঝাতে adjective এর আগের noun টিকে が　দ্বারা নির্দেশ করা হয়।\n\n" +
                    "যেমনঃ ",
    } ;
    public String[] lesson11ListDescription = {
            "•\t　ここでしゃしんをとってもいいです。\n" +
                    "এখানে ছবি তুলতে পার।\n " +
                    "•\t　たばこをすってもいいですか。\n" +
                    "এখানে সিগারেট পান করতে পারব কি ?\n" +
                    "•\t おかねをかりてもいいですか。\n" +
                    "টাকা ধার নিতে পারব কি ?\n" +
                    "•\t こんげつくるまをかってもいいです。\n" +
                    "এই সপ্তাহ গাড়ি কিনতে পার ।\n",

            "•\t ここでたばこをすってはいけません。\n" +
                    "এখানে ধূমপান করা নিষিদ্ধ।\n" +
                    "•\t ここでしゃしんとってはいけません。\n" +
                    "এখানে ছবি তোলা নিষিদ্ধ।\n" +
                    "•\t ここでおかねをかりてはいけません。\n" +
                    "এখানে টাকা ধার নিয়া নিষিদ্ধ।\n" +
                    "•\t クラスにおさけをのんではいけません。\n" +
                    "এই ক্লাসে মদ্য পান করা নিষিদ্ধ ।",

            "•\t あさジョギングをして、シャワーをあびて、かいしゃへいきます。\n" +
                    "সকালে জগিং করে গোসল করে কোম্পানিতে যাব।\n " +
                    "•\t こうべへいって、えいがをみて、おちゃをのみました。\n" +
                    "কউভেতে গিয়ে সিনেমা দেখে চা পান করব ।\n" +
                    "•\t くにへかえってから、ちちのかいしゃではたらきます。\n" +
                    "দেশে ফিরে তারপর বাবার কোম্পানিতে কাজ করব ।\n",

            "•\t きのうはてんきがよくて、あつかったです。\n" +
                    "গতকাল আবহাওয়া ভাল ছিল এবং গরম ছিল।\n" +
                    "•\t カリナーさんはインドネシアじんで、きょうとだいがくのりゅうがくせいです。\n" +
                    "কারিনা সাহেব ইন্দোনেশিয়ান এবং কিয়উত বিশ্ববিদ্যালয়ের ছাত্র।\n" +
                    "•\t ミラーさんはハンサムで、しんせつです。\n" +
                    "মিরা সাহেব হান্দসাম এবং দয়ালু ।\n" +
                    "•\t くにへかえってから、ちちのかいしゃではたらきます。\n" +
                    "দেশে ফিরে তারপর বাবা কোম্পানিতে কাজ করব।\n" +
                    "•\t おおさかはたべものがおいしいです。\n" +
                    "ওসাকা খাবার মজা ।\n"
    } ;

    public int[] lesson11FirstBackground = {
            Color.rgb(245,255,250),
            Color.rgb(245,255,250),
            Color.rgb(245,255,250),
            Color.rgb(245,255,250),
    };

    public lesson11SlideAdapter(Context context){
        this.lesson11Context = context;
    }

    @Override
    public int getCount() {
        return lesson11ListTitles.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return (view == (LinearLayout)object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        lesson11Inflater= (LayoutInflater) lesson11Context.getSystemService(lesson11Context.LAYOUT_INFLATER_SERVICE);
        View view = lesson11Inflater.inflate(R.layout.lesson11_slide,container,false);
        LinearLayout lesson11LayoutSlide = view.findViewById(R.id.lesson11SlideLinearLayout);
        TextView lesson11headlineTextView = view.findViewById(R.id.lesson11SlideHeadlineId);
        TextView lesson11TitleView = view.findViewById(R.id.lesson11SlideTextViewId);
        TextView lesson11DescriptionTextView = view.findViewById(R.id.lesson11SlideTextDescriptionId);
        lesson11LayoutSlide.setBackgroundColor(lesson11FirstBackground[position]);
        lesson11headlineTextView.setText(lesson11ListHeadlines[position]);
        lesson11TitleView.setText(lesson11ListTitles[position]);
        lesson11DescriptionTextView.setText(lesson11ListDescription[position]);
        container.addView(view);
        return view;

    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((LinearLayout)object);
    }
}


