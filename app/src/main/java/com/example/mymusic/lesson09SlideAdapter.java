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

class lesson09SlideAdapter extends PagerAdapter {

    Context lesson9Context;
    LayoutInflater lesson9Inflater;
    //list of lessons

    public String[] lesson9ListHeadlines = {
            "ほしい,たいএর ব্যাবহার ",
            "ほしい,たいএর ব্যাবহার ",
            "Group of verb",
            "Group of verb",
    };

    public String[] lesson9ListTitles = {
            "১) ほしい হচ্ছে い adjectiveほしい অর্থ চাওয়া।কোন কিছু চাওয়া বা ইচ্ছা বুঝাতে ほしい এর object টি কে নির্দেশ করতে object ও ほしい এর মাঝে が　particle টি বসে।\n" +
                    "২) たい অর্থ নিজে নিজে কিছু করতে চাওয়া। verb এর মূল অংশের  সাথে たい　যোগ করে কোন কিছু চাওয়া বুঝায়।\n" +
                    "৩) কোন কিছু করতে না চাওয়া বুঝাতে verb এর মূল অংশের সাথে たくないবসে।\n"+
                    "যেমনঃ ",
            "৪) কোন বাক্যে দুটি verb থাকলে প্রথম verb এর ます টাকে বাদ দিয়ে ঐ স্থানে にবসে।\n" +
                    "৫) どこか　অর্থ কোথাও বা যে কোনস্থানে এবং なにかঅর্থ কোনকিছু বা যেকোনকিছু। どこか　এর পরে へ　particle এবং なにか এর পর をparticle বসে।কিন্তু どこか ও なにか এর পর へ ওを particle বাদ দেওয়া যায়।\n\n" +
                    "যেমনঃ ",

            "Verb এর group তিনটি-\n\n" +
                    "\t Group- I\n" +
                    "\t Group- II\n" +
                    "\t Group- III\n",

                    "*ব্যাতিক্রমঃকিছু ব্যাতিক্রমী verb আছে যে verb গুলো দেখতে Group- I এর verb এর মতো হলেও verb গুলো মূলত Group- II এর verb এর অন্তর্ভুক্ত।\n\n" +
                    "যেমনঃいます、きます、みます、あびます、かります、たります、おります、おきます、できます\n",
    } ;
    public String[] lesson9ListDescription = {
            "•\t わたしはくるまがほしいです。\n" +
                    "আমি গাড়ি চায় ।\n" +
                    "•\t　わたしはカメラをかいたいです。\n" +
                    "আমি ক্যামেরা কিনতে চাই।\n" +
                    "•\t わたしはにほんへいきたくないです。\n" +
                    "আমি জাপান এ যাইতে চাই না।\n" ,
            "•\t こうべへインドりょうりをたべにいきます。\n" +
                    "কউবেতে ইন্ডিয়ান রান্না খাইতে চাই।\n"+
                    "•\t ふゆやすみはどこかへいきましたか。\n" +
                    "শীতের ছুটিতে কোথাও গিয়েছিলেন কি ?\n" +
                    "・\t・・はい、いきました。\n" +
                    "হ্যাঁ গিয়েছিলাম ।",

            "Group- I：\n" +
                    "ます　যুক্ত শব্দের ます এর পূর্বের বর্ণটি যদি いー column এর বর্ণ হয় তাহলে verb টি Group- I এর verb. \n" +
                    "যেমনঃ  かいます、あります、いりますইত্যাদি।\n\n" +
                    "Group- II：\n" +
                    "ます　যুক্ত শব্দের ます এর পূর্বের বর্ণটি যদি え　column এর বর্ণ হয় তাহলে verb টি Group- II এর verb.\n" +
                    "যেমনঃ  おしえます、かけます、たべますইত্যাদি।\n\n"+
                    "ますযুক্ত শব্দের ます এর পূর্বে  যদি একটি মাত্র বর্ণ থাকে তাহলে ます যুক্ত শব্দটি সাধারণত Group- II এর  verb হয় ।\n" +
                    "যেমনঃ います、みます、ねます　ইত্যাদি।\n\n",
                    "Group- III: \n" +
                    "Group- III এর verb গুলোর します、きます　থাকে এবং verb গুলো সাধারণত একটু বড় হয়।\n" +
                    "যেমনঃ  きます、します、かいものします、うんてんします\n",
    } ;

    public int[] lesson9FirstBackground = {
            Color.rgb(245,255,250),
            Color.rgb(245,255,250),
            Color.rgb(245,255,250),
            Color.rgb(245,255,250),
    };

    public lesson09SlideAdapter(Context context){
        this.lesson9Context = context;
    }

    @Override
    public int getCount() {
        return lesson9ListTitles.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return (view == (LinearLayout)object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        lesson9Inflater= (LayoutInflater) lesson9Context.getSystemService(lesson9Context.LAYOUT_INFLATER_SERVICE);
        View view = lesson9Inflater.inflate(R.layout.lesson09_slide,container,false);
        LinearLayout lesson9LayoutSlide = view.findViewById(R.id.lesson9SlideLinearLayout);
        TextView lesson9headlineTextView = view.findViewById(R.id.lesson9SlideHeadlineId);
        TextView lesson9TitleView = view.findViewById(R.id.lesson9SlideTextViewId);
        TextView lesson9DescriptionTextView = view.findViewById(R.id.lesson9SlideTextDescriptionId);
        lesson9LayoutSlide.setBackgroundColor(lesson9FirstBackground[position]);
        lesson9headlineTextView.setText(lesson9ListHeadlines[position]);
        lesson9TitleView.setText(lesson9ListTitles[position]);
        lesson9DescriptionTextView.setText(lesson9ListDescription[position]);
        container.addView(view);
        return view;

    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((LinearLayout)object);
    }
}

