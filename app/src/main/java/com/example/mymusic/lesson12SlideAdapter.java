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

class lesson12SlideAdapter extends PagerAdapter {

    Context lesson12Context;
    LayoutInflater lesson12Inflater;
    //list of lessons

    public String[] lesson12ListHeadlines = {
            "どうやって এর ব্যবহার",
            "ない – form ",
            "ない　― form ないでください",
            "ない　ーform なければなりません ",
            "ない　ーform なくてもいいです ",
    };

    public String[] lesson12ListTitles = {
            "どうやって　এর অর্থ হলো কিভাবে বা কি করে।কোন  স্থানে কিভাবে যাবে এটা জানার জন্য どうやって　ব্যবহার করা হয়।\n\n" +
                    "যেমনঃ ",

            "ます – form থেকে ない – form এ পরিবর্তনের ক্ষেত্রে ます – এর আগের い　column  এর বর্ণ গুলো পরিবর্তন হয়ে あ- column এর বর্ণ গুলো বসবে এবং ます উঠে যাবে।\n\n" +
                    "যেমনঃ ",

            "কোন কিছু না করার জন্য অনুরোধ করতে এই ないでください ব্যবহৃত হয়।\n\n" +
                    "যেমনঃ ",

            "কোন কাজ অবশ্যই করতে হবে বুঝাতে এই word টিなければなりません ব্যবহৃত হয়। এই word টি নাবোধক অর্থে ব্যবহৃত হয় না।\n\n" +
                    "যেমনঃ ",
            "ককোন কাজ করতে হবে না বা করার প্রয়োজন নেই এমন কিছু বুঝাতে এই なくてもいいです টি ব্যবহৃত হয়।\n\n" +
                    "যেমনঃ ",
    } ;
    public String[] lesson12ListDescription = {
            "•\t だいがくまでどうやっていきますか。\n" +
                    "বিশ্ববিদ্যালয় পর্যন্ত কেমন করে যাব?\n" +
                    "・・きょうとえきから１６ばんのバスにのって、だいがくまえでおります。\n" +
                    "কিয়উত স্টেশন থেকে ১৬ নম্বর এর বাসে উঠে বিশ্ববিদ্যালয়ের সামনে নামবো। \n",

            "1.\tかきます　　　　―  かかない\n" +
                    "2.\tよみます　　　　― よまない\n" +
                    "3.\tとります　　　　― とらない\n" +
                    "4.\tすいます　　　　― すわない\n" +
                    "\n" +
                    "*ব্যাতিক্রমঃ い এর পরিবর্তে あ　না হয়ে わ　হয়।\n" +
                    "\n" +
                    "1.\tあいます　― あわない\n" +
                    "2.\tいいます　― いわない\n",

            "•\t ここでしゃしんをとらないでください。\n" +
                    "দয়া করে ছবি তোলা মানা।\n " +
                    "•\t わたしはげんきですから、しんぱいしないでください。\n" +
                    "আমি ভাল আছি তাই দয়া করে চিন্তা করবেন না ।\n",

            "•\t くすりをのまなければなりません。\n" +
                    "মেডিসিন না পান করলেই নয় ।\n" +
                    "•\t ごはんをたべなけらばなりません。\n" +
                    "ভাত না খেলে চলবে না ।\n" +
                    "•\t くにへかえらなければなりません。\n" +
                    "দেশে না ফিরলে চলবে না ।\n",

            "•\t あしたこなくてもいいです。。\n" +
                    "আগামীকাল না আসলে চলবে ।\n" +
                    "•\t なまえ をかかなくてもいいです。\n" +
                    "নাম না লিখলে চলবে ।\n" +
                    "•\t くにへかえらなくてもいいです。\n" +
                    "দেশে না ফিরলে চলবে।\n",
    } ;

    public int[] lesson12FirstBackground = {
            Color.rgb(245,255,250),
            Color.rgb(245,255,250),
            Color.rgb(245,255,250),
            Color.rgb(245,255,250),
            Color.rgb(245,255,250),
    };

    public lesson12SlideAdapter(Context context){
        this.lesson12Context = context;
    }

    @Override
    public int getCount() {
        return lesson12ListTitles.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return (view == (LinearLayout)object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        lesson12Inflater= (LayoutInflater) lesson12Context.getSystemService(lesson12Context.LAYOUT_INFLATER_SERVICE);
        View view = lesson12Inflater.inflate(R.layout.lesson12_slide,container,false);
        LinearLayout lesson12LayoutSlide = view.findViewById(R.id.lesson12SlideLinearLayout);
        TextView lesson12headlineTextView = view.findViewById(R.id.lesson12SlideHeadlineId);
        TextView lesson12TitleView = view.findViewById(R.id.lesson12SlideTextViewId);
        TextView lesson12DescriptionTextView = view.findViewById(R.id.lesson12SlideTextDescriptionId);
        lesson12LayoutSlide.setBackgroundColor(lesson12FirstBackground[position]);
        lesson12headlineTextView.setText(lesson12ListHeadlines[position]);
        lesson12TitleView.setText(lesson12ListTitles[position]);
        lesson12DescriptionTextView.setText(lesson12ListDescription[position]);
        container.addView(view);
        return view;

    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((LinearLayout)object);
    }
}


