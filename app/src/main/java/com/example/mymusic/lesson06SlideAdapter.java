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

public class lesson06SlideAdapter extends PagerAdapter {

    Context lesson6Context;
    LayoutInflater lesson6Inflater;
    //list of lessons

    public String[] lesson6ListHeadlines = {
            "に particle এর ব্যাবহার",
            "もう এর ব্যাবহার",
            "Adjective",
            "な　Adjective এর ব্যাবহার",
            "い　Adjective এর ব্যাবহার",
    };

    public String[] lesson6ListTitles = {
            "১) কারো কাছ থেকে কোন কিছু পাওয়া,ধারকরা,নেওয়া,শেখা অথবা কাউকে কোন কিছু দেওয়া,শেখানো ইত্যাদি ক্ষেত্রে যাকে দেওয়া হলো বা যার কাছ থেকে পাওয়া হলো তার নামের পর にparticle বসে ।\n" +
                    "২) কোন দিক নির্দেশ করলে তার পর に particle বসে।\n" +
                    "৩) কোন স্থান বুঝালে তারপর に particle বসে।\n\n" +
                    "যেমনঃ ",

            "もう অর্থ ইতিমধ্যে যা ঘটেগেছে বা হয়েগেছে।もう এরপরে verb এর Vましたবসে।",

            "জাপানি ভাষায় দুই প্রকারের adjective আছে ।なadjective এবংいadjective. যে word এর শেষে い অক্ষর যুক্ত আছে তাকে い adjective বলে।আর বাকী adjective গুলোকেな adjective বলে।\n\n" +
                    "যেমনঃ ",

            "১ ）সাধারনত বাক্যে な　adjective な ব্যতিত ব্যবহার হয়। Sentence এ なadjective এর পর noun থাকলে なadjective এর な যুক্ত হয়। なadjective এর নাবোধক করলে এরসাথেじゃありません　যুক্ত হয়। \n" +
                    "\n" +
                    " ২ ）な　adjective গুলোর past from করার জন্য adjective এর শেষে です এর পরিবর্তে でした　বসে।Noun এর ক্ষেত্রেও でした বসে।আবার な　adjective এর negative করার জন্য じゃありませんでした　বসে।\n\n" +
                    "যেমনঃ ",

            " ১ ）সাধারনত বাক্যে い　adjective　এর কোন পরিবর্তন হয় না ।\n" +
                    "い adjective এর নাবোধক করার জন্য শেষের い বাদ দিয়েくないযোগ করতে হয়।\n\n" +
                    "\n" +
                    " ২ ）い　adjective গুলোর past from করার জন্য adjective এর শেষের い টাকে বাদদিয়ে かった　যোগ করতে হয়।আবার い　adjective এর নাবোধক করার সময় かった এর পরিবর্তে くなかった　বসে।\n\n" +
                    "যেমনঃ ",
    } ;
    public String[] lesson6ListDescription = {
            "•\t やまださんはきむらさんにはなをあげました。\n" +
                    "ইয়ামাদা সাহেব কিমুরা সাহেবকে ফুল দিয়েছেন । \n" +
                    "•\t スーパーのまえにきっさてんがあります。\n" +
                    "সুপারমার্কেট এর সামনে ক্যান্টিন আছে ।\n" +
                    "•\t ミラーさんはかいぎしつにいます。\n" +
                    "মিরা সাহেব মিটিং রুমে আছে ।",

            "•\t もうにもつをおくりました。\n" +
                    "•\t もうおおさかじょうへいきました。\n"+
                    "•\t もうひるごはんをたべました。\n",

            "なAdjective : ハンサムな・きれいな・しずかな・にぎやかな・ゆうめいな・しんせつな\n\n"+
            "いAdjective : おおきい・ちいさい・ふるい・わるい・あつい・さむい\n",

            "•\t ミラーさんはしんせつです。\n" +
                    "•\t ならはきれいなまちです。\n" +
                    "•\t ミラーさんはしんせつなひとです。\n" +
                    "•\t ならはしずかなまちです。\n" +
                    "•\t きれいですーきれいじゃありません\n" +
                    "•\t げんきですーげんきじゃありません\n",

            "•\t きょうはあついです。\n" +
                    "•\t あたたかいコーヒーをのみます。\n" +
                    "•\t このりょうりはおいいしいくないです。\n" +
                    "•\t にほんごはむずかしくないです。\n" +
                    "•\t きのうはあつかったです。\n" +
                    "•\t きのうのパーティはあまりたのしくなかったです。\n" +
                    "•\t きのうはしずかでした。\n" +
                    "•\t きのうはしずかじゃありませんでした。\n" +
                    "•\t きのうはあめでした。\n" +
                    "•\t きのうはあめじゃありませんでした。\n",
    } ;

    public int[] lesson6FirstBackground = {
            Color.rgb(245,255,250),
            Color.rgb(245,255,250),
            Color.rgb(245,255,250),
            Color.rgb(245,255,250),
            Color.rgb(245,255,250),
    };

    public lesson06SlideAdapter(Context context){
        this.lesson6Context = context;
    }

    @Override
    public int getCount() {
        return lesson6ListTitles.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return (view == (LinearLayout)object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        lesson6Inflater= (LayoutInflater) lesson6Context.getSystemService(lesson6Context.LAYOUT_INFLATER_SERVICE);
        View view = lesson6Inflater.inflate(R.layout.lesson06_slide,container,false);
        LinearLayout lesson6LayoutSlide = view.findViewById(R.id.lesson6SlideLinearLayout);
        TextView lesson6headlineTextView = view.findViewById(R.id.lesson6SlideHeadlineId);
        TextView lesson6TitleView = view.findViewById(R.id.lesson6SlideTextViewId);
        TextView lesson6DescriptionTextView = view.findViewById(R.id.lesson6SlideTextDescriptionId);
        lesson6LayoutSlide.setBackgroundColor(lesson6FirstBackground[position]);
        lesson6headlineTextView.setText(lesson6ListHeadlines[position]);
        lesson6TitleView.setText(lesson6ListTitles[position]);
        lesson6DescriptionTextView.setText(lesson6ListDescription[position]);
        container.addView(view);
        return view;

    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((LinearLayout)object);
    }
}

