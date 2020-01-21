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

class lesson15SlideAdapter extends PagerAdapter {

    Context lesson15Context;
    LayoutInflater lesson15Inflater;
    //list of lessons

    public String[] lesson15ListHeadlines = {
            "とき এর ব্যাবহার",
            "Plain form と",
            "くれます এর ব্যাবহার",
            "た form たら এর ব্যাবহার",
    };

    public String[] lesson15ListTitles = {
            "১) とき　মানে যখন। とき এর পূর্বে plain form বসে।\n" +
                    "২) とき　এর পূর্বে い　adjective থাকলে কিছু বসে না । な　adjective এর সাথে な বসে এবং Noun এর সাথে の　বসে।\n \n" +
                    "যেমনঃ ",

            "Plain form とমানে শর্ত।\n \n" +
                    "যেমনঃ ",

            "くれます　অর্থ হল আমাকে দেয়া। এই শব্দ টি বাক্যের শেষে বসে।\n \n" +
                    "যেমনঃ ",

            "Verb এর た form এর সাথে らযোগ করলে এটা たら　হয়ে যায় এবং এর অর্থ দাড়ায় যদি।",
    } ;
    public String[] lesson15ListDescription = {
            "•\t みちをわたるときくるまにきをつけます。\n" +
                    "যখন রাস্তা পার হবে গাড়ি থেকে সাবধান ।\n" +
                    "•\t うちへかえるときケーキをかいます。\n" +
                    "যখন বাড়িতে ফিরব তখন কেক কিনব ।\n" +
                    "•\t ねむいときコーヒーをのみます。\n" +
                    "গুমানর সময় কফি পান করব।\n" +
                    "•\t ひまなときほんをよみます。\n" +
                    "অবসর সময় বই পড়ি ।",

            "•\t これをまわすとおとがおおきくなります。\n" +
                    "•\t ここをおすとおりがでます。\n",

            "•\t ミラーさんはわたしにワインをくれました。\n" +
                    "•\t わたしはきむらさんにほんをかしてあげます。\n",

            "•\t あめがふったらいきません。\n" +
                    "বৃষ্টি হলে যাব না ",
    } ;

    public int[] lesson15FirstBackground = {
            Color.rgb(245,255,250),
            Color.rgb(245,255,250),
            Color.rgb(245,255,250),
            Color.rgb(245,255,250),
    };

    public lesson15SlideAdapter(Context context){
        this.lesson15Context = context;
    }

    @Override
    public int getCount() {
        return lesson15ListTitles.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return (view == (LinearLayout)object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        lesson15Inflater= (LayoutInflater) lesson15Context.getSystemService(lesson15Context.LAYOUT_INFLATER_SERVICE);
        View view = lesson15Inflater.inflate(R.layout.lesson15_slide,container,false);
        LinearLayout lesson15LayoutSlide = view.findViewById(R.id.lesson15SlideLinearLayout);
        TextView lesson15headlineTextView = view.findViewById(R.id.lesson15SlideHeadlineId);
        TextView lesson15TitleView = view.findViewById(R.id.lesson15SlideTextViewId);
        TextView lesson15DescriptionTextView = view.findViewById(R.id.lesson15SlideTextDescriptionId);
        lesson15LayoutSlide.setBackgroundColor(lesson15FirstBackground[position]);
        lesson15headlineTextView.setText(lesson15ListHeadlines[position]);
        lesson15TitleView.setText(lesson15ListTitles[position]);
        lesson15DescriptionTextView.setText(lesson15ListDescription[position]);
        container.addView(view);
        return view;

    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((LinearLayout)object);
    }
}


