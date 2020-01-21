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

class lesson14SlideAdapter extends PagerAdapter {

    Context lesson14Context;
    LayoutInflater lesson14Inflater;
    //list of lessons

    public String[] lesson14ListHeadlines = {
            "た - form こと、りします ",
            "なります এর ব্যাবহার",
            "とおもいます,といいまいた এর ব্যাবহার",
            "でしょう এর ব্যাবহার",
    };

    public String[] lesson14ListTitles = {
            "১) অতীতে কোন কিছু করার অভিজ্ঞতাকে বলার ক্ষেত্রে た　form এর পর こと　が　\n" +
                    "あります　ব্যবহৃত হয়।\n" +
                    "২) অনেক গুলো কাজের মধ্যে কয়েকটি কাজ  উল্লেখ করে ইত্যাদি দিয়ে শেষ করা হলে た form り、た form りします　বসাতে হয়।\n\n" +
                    "যেমনঃ ",

            "১) なります　এর আগে  い　adjective থাকলে い　adjective এর い উঠে গিয়ে く　যুক্ত হয় ।\n" +
                    "২) なりますএর আগে な　adjective থাকলে な　adjective এর পর に　বসে।\n" +
                    "৩) なります　এর আগে Noun থাকলে Noun এর পর に বসে ।\n\n" +
                    "যেমনঃ ",

            "Verb এর plain form চলতি রূপ অথবা い এবংな  Adjective , noun এর plain form সাথে とおもいますযোগ করলে অর্থ দাড়ায় বলে মনে হয়।\n" +
                    "Plain form といいまいた　এর অর্থ দাড়ায় বলে বলেছি।\n\n" +
                    " যেমনঃ ",

            "plain form でしょう　এর অর্থ দাড়ায় সম্ভাবনা ।\n\n"+
                    " যেমনঃ ",
    } ;
    public String[] lesson14ListDescription = {
            "•\t うまにのったことがあります。\n" +
                    "ঘোড়াতে উঠার অভিজ্ঞতা আছে ।\n" +
                    "•\t わたしははしでたべたことがあります。\n" +
                    "আমার চপস্তিক দিয়ে খাবার অবিজ্ঞতা আছে।\n" +
                    "•\t にちようびはテニスをしたり、えいがをみたりします。\n" +
                    "রবিবার টেনিস খেলি ছিনেমা দেখি ।\n" +
                    "•\t まいあさおきたり、あさごはんをたべたりします。\n" +
                    "প্রতিদিন সকাল ঘুম থেকে উঠবো সকালের নাস্তা খাব।",

            "•\t しけんがよくなりました。\n" +
                    "পরীক্ষা ভাল হয়েছিল।\n" +
                    "•\t にほんごがじょうずになりました。\n" +
                    "জাপানিজ ভাষা দক্ষ হয়েছিলাম।\n" +
                    "•\t ことし18 さいになります。\n" +
                    "এই বছর ১৮ বছর হব।\n",

            "•\t あしたあめがふるとおもいます。\n" +
                    "আগামীকাল বৃষ্টি হবে বলে মনে হইতেছে ।\n" +
                    "•\t わたしはかちょうにやすみがほしいといいました。\n" +
                    "আমি ম্যানেজার এর কাছে ছুটি চাই বলেছিলাম।",

            "•\t あしたパーテイーにくるでしょう。\n" +
                    "আগামীকাল পার্টি সম্ভবনা আছে ।\n" +
                    "•\t おてらでコンサートがあったでしょう。\n" +
                    "ওঁতেরাতে কন্সার্টএর সম্ভবনা আছে ।",
    } ;

    public int[] lesson14FirstBackground = {
            Color.rgb(245,255,250),
            Color.rgb(245,255,250),
            Color.rgb(245,255,250),
            Color.rgb(245,255,250),
    };

    public lesson14SlideAdapter(Context context){
        this.lesson14Context = context;
    }

    @Override
    public int getCount() {
        return lesson14ListTitles.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return (view == (LinearLayout)object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        lesson14Inflater= (LayoutInflater) lesson14Context.getSystemService(lesson14Context.LAYOUT_INFLATER_SERVICE);
        View view = lesson14Inflater.inflate(R.layout.lesson14_slide,container,false);
        LinearLayout lesson14LayoutSlide = view.findViewById(R.id.lesson14SlideLinearLayout);
        TextView lesson14headlineTextView = view.findViewById(R.id.lesson14SlideHeadlineId);
        TextView lesson14TitleView = view.findViewById(R.id.lesson14SlideTextViewId);
        TextView lesson14DescriptionTextView = view.findViewById(R.id.lesson14SlideTextDescriptionId);
        lesson14LayoutSlide.setBackgroundColor(lesson14FirstBackground[position]);
        lesson14headlineTextView.setText(lesson14ListHeadlines[position]);
        lesson14TitleView.setText(lesson14ListTitles[position]);
        lesson14DescriptionTextView.setText(lesson14ListDescription[position]);
        container.addView(view);
        return view;

    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((LinearLayout)object);
    }
}


