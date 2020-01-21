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

public class LessonSlideAdapter extends PagerAdapter {

    Context lessonContext;
    LayoutInflater lessonInflater;

    //list of lessons

    public String[] listHeadlines = {
            "は　〜　এর ব্যাবহার",
            "です　〜　এর ব্যাবহার",
            "じゃありません　〜　এর ব্যাবহার",
            "か　〜　এর ব্যাবহার",
             };

    public String[] lessonListTitles = {
            "বাক্যে Topic ( বিষয় / প্রসঙ্গ ) আলোচনার বিষয় এর পর は বসে।はParticle টি わএর মত উচ্চারিত হয়।একটি বাক্যে は Particle কখনো দুইবার বসে না ।" +
                    "ভোগলিক অবস্থা বা স্থানকে সময় প্রকাশকে বা নির্দেশক শব্দকে Topic হিসেবে ব্যবহার এর জন্য এগুলো Noun এর পর は বসে। Object কে বাক্যের Topic করতে হলে わ " +
                                    "এর পরিবর্তে は বসে। ",

            "です এর সাথে Noun ব্যবহৃত হয়ে particles (বিদেয় / উদ্দেশ্যর ধর্ম/ গুণ) হিসেবে কাজ করে। বিবৃতিমূলক বাক্যের শেষে です বসে । " +
                    "বাক্যের শেষে です থাকলে বুঝতে হবে বাক্যটি polite ( শালীন, ভদ্র, মার্জিত,শিষ্টাচার যুক্ত ) বাক্যে।" +
                    "です দিয়ে ইংরেজিতে  am , is, are বুঝায়। ",

            "です এর negative form হচ্ছে じゃ（では）ありません । ",

            "বাক্যের শেষে か particle টি যুক্ত করে প্রশ্ন করা হয়।",
    } ;
    public String[] lessonListDescription = {
                    "•\tわたしはがくせいです。\n\n" +
                    "•\tにほんはあんせんなくにです。\n\n" +
                    "•\tどようびはなにをしますか。\n\n" +
                    "•\tにむつはここにおかないでください。\n\n" +
                    "•\tかいしゃのしょくどうでひるごはんをたべます。\n\n" +
                    "•\tひるごはんはかいしゃのしょくどうでたべます。\n\n",

                    "o\tわたしはがくせいです。\n" +
                            "o\tでは, じつは\n" +
                            "o\tわたしはマイクです。　\n" +
                            "o\tこれはペンです。\n",

                    "•\tわたしはがくせいじゃありません。",

                    "•\tあなたのなまえはなんですか。\n" +
                            "•\tサントスさんはせんせいですか。\n",
    } ;
    public int[] lessonFirstBackground = {
            Color.rgb(245,255,250),
            Color.rgb(245,255,250),
            Color.rgb(245,255,250),
            Color.rgb(245,255,250),
    };

    public LessonSlideAdapter(Context context){

        this.lessonContext = context;

    }


    @Override
    public int getCount() {
        return lessonListTitles.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return (view == (LinearLayout)object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        lessonInflater= (LayoutInflater) lessonContext.getSystemService(lessonContext.LAYOUT_INFLATER_SERVICE);
        View view = lessonInflater.inflate(R.layout.lesson_slide,container,false);
        LinearLayout lesoonLayoutSlide = view.findViewById(R.id.lessonSlideLinearLayout);
        TextView lessonheadlineTextView = view.findViewById(R.id.slideHeadlineId);
        TextView lessonTitleView = view.findViewById(R.id.lessonSlideTextViewId);
        TextView lessonDescriptionTextView = view.findViewById(R.id.lessonSlideTextDescriptionId);
        lesoonLayoutSlide.setBackgroundColor(lessonFirstBackground[position]);
        lessonheadlineTextView.setText(listHeadlines[position]);
        lessonTitleView.setText(lessonListTitles[position]);
        lessonDescriptionTextView.setText(lessonListDescription[position]);
        container.addView(view);
        return view;

    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((LinearLayout)object);
    }
}
