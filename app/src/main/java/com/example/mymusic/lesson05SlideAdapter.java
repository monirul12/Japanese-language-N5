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

public class lesson05SlideAdapter extends PagerAdapter {
    Context lesson5Context;
    LayoutInflater lesson5Inflater;
    //list of lessons

    public String[] lesson5ListHeadlines = {
            "をparticle এর ব্যাবহার",
            "なんএবংなに এর ব্যাবহার",
            "で এর ব্যাবহার",
            "　〜　ませんか　, 〜　ましょう এর ব্যাবহার",
    };

    public String[] lesson5ListTitles = {
            "Verb এর object (উদ্দেশ্য বা লক্ষ্য) কে নির্দেশ করতে をparticle টি ব্যাবহার করা হয়\n\n" +
                    "\n" +
                    "যেমনঃ\n",

            "なんএবংなに : ",

            "কোন নির্দিষ্ট স্থানে কোন কাজ সংগঠিত হলে সেই নির্দিষ্ট স্থানের পর で　বসে।\n" +
                    "কোন কিছু ( tools , method) দারা কোন কাজ করলে ঐ tools বা method এর নামের পর でparticle বসে। ভাষাটাও এক প্রকার tools এর জন্য ভাষার পর で বসেছে।\n\n" +
                    "যেমনঃ",

            "〜　ませんか " +
                    "Negative এর সাথে প্রশ্নবোধক  যোগ হয়ে offer করা বুঝায়।\n\n" +
                    "আমন্ত্রণ জানানোর ক্ষেত্রে Verb এর সাথে ましょう থাকলে না করার কোন option  থাকে না।\n\n" +
                    "যেমনঃ\n",
    } ;
    public String[] lesson5ListDescription = {
            "•\t わたしはごはんをたべます。\n" +
                    "•\t わたしはみずをのみます。\n" +
                    "•\t わたしはえいがをみます。\n" +
                    "•\t わたしはしゃしんをとります。\n" +
                    "•\t わたしはタバコをすいます。\n" +
                    "•\t しゅくだいをします。\n" +
                    "•\t しごとをします。\n" +
                    "•\t サッカーをします。\n",

            "なん:\n" +
                    "\n" +
                    "•\tそれはなんですか。\n" +
                    "•\tなんのほんですか。\n" +
                    "•\tたべるまえになんといいますか。\n" +
                    "•\tあなたはなんかいですか。\n" +
                    "•\tかぞくはなんにんですか。\n" +
                    "\n" +

                    "なに：\n" +
                    "\n" +
                    "•\tなにをかいますか\n" +
                    "•\tないをたべますか\n" +
                    "•\tなにをのみますか。\n" +
                    "•\tなにをみますか。\n" +
                    "•\tなにをしますか。\n",

            "•\tわたしはデパートでとけいをかいました。\n" +
                    "•\tわたしはえきでしんぶんをきいます。\n" +
                    "•\tはしでたべます。\n" +
                    "•\tにほんごでてがみをかきます。\n",

            "•\tいっしょにきょうとへいきませんか。\n" +
                    "•\tいっしょにおちゃをのみませんか。\n" +
                    "•\tいっしょにえいがをみませんか。\n" +
                    "•\tちょっとやすみましょう。\n" +
                    "•\tおちゃをのみましょう\n",
    } ;

    public int[] lesson5FirstBackground = {
            Color.rgb(245,255,250),
            Color.rgb(245,255,250),
            Color.rgb(245,255,250),
            Color.rgb(245,255,250),
    };

    public lesson05SlideAdapter(Context context){
        this.lesson5Context = context;
    }

    @Override
    public int getCount() {
        return lesson5ListTitles.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return (view == (LinearLayout)object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        lesson5Inflater= (LayoutInflater) lesson5Context.getSystemService(lesson5Context.LAYOUT_INFLATER_SERVICE);
        View view = lesson5Inflater.inflate(R.layout.lesson05_slide,container,false);
        LinearLayout lesson5LayoutSlide = view.findViewById(R.id.lesson5SlideLinearLayout);
        TextView lesson5headlineTextView = view.findViewById(R.id.lesson5SlideHeadlineId);
        TextView lesson5TitleView = view.findViewById(R.id.lesson5SlideTextViewId);
        TextView lesson5DescriptionTextView = view.findViewById(R.id.lesson5SlideTextDescriptionId);
        lesson5LayoutSlide.setBackgroundColor(lesson5FirstBackground[position]);
        lesson5headlineTextView.setText(lesson5ListHeadlines[position]);
        lesson5TitleView.setText(lesson5ListTitles[position]);
        lesson5DescriptionTextView.setText(lesson5ListDescription[position]);
        container.addView(view);
        return view;

    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((LinearLayout)object);
    }
}
