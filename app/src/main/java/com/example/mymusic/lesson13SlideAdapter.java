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

class lesson13SlideAdapter extends PagerAdapter {

    Context lesson13Context;
    LayoutInflater lesson13Inflater;
    //list of lessons

    public String[] lesson13ListHeadlines = {
            "じしょ form ",
            "じしょ form ",
            "じしょ form ことができます",
            "じしょ form ことです,まえに",
    };

    public String[] lesson13ListTitles = {
            "Group – 1\n" +
                    "\n" +
                    "১) Dictionary Form : ますForm থেকে Dictionary Form এ পরিবর্তনের ক্ষেত্রে ます এর আগের いーcolumn এর বর্ণ গুলো পরিবর্তন হয়ে うー　column এর বর্ণগুলো বসবে এবং \n" +
                    "ます উঠে যাবে।\n" +
                    "\n" +
                    "যেমনঃ \n",

            "Group – 3\n" +
                    "\n" +
                    "২) ます　এর পূর্বের বর্ণের （　き、し）পরিবর্তে যথাক্রমে くও　す বসবে এবং ます উঠে る বসবে।\n" +
                    "যেমনঃ \n",

            "৩) ことができます　দিয়ে কোন কিছু করতে পারার সামর্থ্য বা সম্ভাবনা বুঝায়।\n" +
                    "যখন কোন verb দিয়ে সামর্থ্য ,যোগ্যতা , দক্ষতা বা সম্ভাবনা বুঝায় ,তখন verb টির Dictionary form এর সাথে こと যুক্ত করা হয় এবং পরে ができます বসে।\n\n" +
                    "যেমনঃ ",

            "৪) বাক্য সখ বুঝাতে しゅみ　ব্যবহার করা হয় এবং Dictionary form এর পর こと　です বসে।\n" +
                    "৫) কোন একটি কাজ করার আগে অন্য আরেকটি কাজ করা বুঝাতে Dictionary form まえに টি ব্যবহৃত হয়।\nまえにএর আগে noun থাকলে noun এবং まえに এর মাঝে のবসে।\n\n" +
                    "যেমনঃ ",
    } ;
    public String[] lesson13ListDescription = {
            "•\t かいます　― かう\n" +
                    "•\t かきます　― かく\n" +
                    "•\t あります　― ある\n",

            "•\t きます　― くる\n" +
                    "•\t します　― する\n",

            "•\t わたしはかんじよむことができます\n" +
                    "আমি কাঞ্জি পড়তে পারি ।\n" +
                    "わたしはにほんへいくことができます。\n" +
                    "আমি জাপান এ যেতে পারি ।",

            "•\t わたしのしゅみはほんをよむことです。\n" +
                    "আমার শখ বই পড়া।\n" +
                    "•\t にほんへくるまえににほんごをべんきょうしました。\n" +
                    "জাপান এ আসার আগে জাপানিজ ভাষা পড়াশোনা করেছিলাম।\n" +
                    "•\t しょくじのまえにてをあらいます。\n" +
                    "খাবারের আগে হাত ধুয়ে নিব ।",
    } ;

    public int[] lesson13FirstBackground = {
            Color.rgb(245,255,250),
            Color.rgb(245,255,250),
            Color.rgb(245,255,250),
            Color.rgb(245,255,250),
    };

    public lesson13SlideAdapter(Context context){
        this.lesson13Context = context;
    }

    @Override
    public int getCount() {
        return lesson13ListTitles.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return (view == (LinearLayout)object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        lesson13Inflater= (LayoutInflater) lesson13Context.getSystemService(lesson13Context.LAYOUT_INFLATER_SERVICE);
        View view = lesson13Inflater.inflate(R.layout.lesson13_slide,container,false);
        LinearLayout lesson13LayoutSlide = view.findViewById(R.id.lesson13SlideLinearLayout);
        TextView lesson13headlineTextView = view.findViewById(R.id.lesson13SlideHeadlineId);
        TextView lesson13TitleView = view.findViewById(R.id.lesson13SlideTextViewId);
        TextView lesson13DescriptionTextView = view.findViewById(R.id.lesson13SlideTextDescriptionId);
        lesson13LayoutSlide.setBackgroundColor(lesson13FirstBackground[position]);
        lesson13headlineTextView.setText(lesson13ListHeadlines[position]);
        lesson13TitleView.setText(lesson13ListTitles[position]);
        lesson13DescriptionTextView.setText(lesson13ListDescription[position]);
        container.addView(view);
        return view;

    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((LinearLayout)object);
    }
}


