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

public class katakanaSlideAdapter extends PagerAdapter {
    Context katakanaContext;
    LayoutInflater katakanaInflater;

    //list of lessons

    public String[] katakanaListHeadlines = {
            "ア","イ","ウ","エ","オ",
            "カ","キ","ク","ケ","コ",
            "サ","シ","ス","セ","ソ",
            "タ","チ","ツ","テ","ト",
            "ナ","ニ","ヌ","ネ","ノ",
            "マ","ミ","ム","メ","モ",
            "ハ","ヒ","フ","へ","ホ",
            "ヤ","ユ","ヨ",
            "ラ","リ","ル","レ","ロ",
            "ワ","ヲ","ン",
    };

    public String[] kanaPronounciations= {
            "আ" ,  "ই" ,"উ" ,"এ" ,"ও",
            "কা" ,  "কি" ,"কু" ,"কে" ,"কো",
            "সা" ,  "শি" ,"সু" ,"সে" ,"সো",
            "তা" ,  "চি" ,"ৎসু" ,"তে" ,"তো",
            "না" ,  "নি" ,"নু" ,"নে" ,"নো",
            "মা" ,  "মি" ,"মু" ,"মে" ,"মো",
            "হা" ,  "হি" ,"ফু" ,"হে" ,"হো",
            "ইয়া" ,  "ইউ" ,"ইয়ো" ,
            "রা" ,  "রি" ,"রু" ,"রে" ,"রো",
            "ওয়া" ,  "ও" ,"ন" ,
    };

    public String[] katakanaListTitles = {
            "アイスクリーム" ,  "インド" ,"ウッド" ,"エスカレーター" ,"オーナー",
            "カレンダー" ,  "キャベツ" ,"クリスマス" ,"ケーキ" ,"コーラ",
            "サイズ" ,  "シンガポール" ,"スープ" ,"セールテープ" ,"ソフト",
            "タイトル" ,  "チーム" ,"ツール" ,"テーマ" ,"トースター",
            "ナイフ" ,  "ニュース" ,"ヌードル" ,"ネパール" ,"ノート",
            "マレーシア" ,  "ミャンマー" ,"ムーブメント" ,"メール" ,"モード",
            "ハロウィン" ,  "ヒューマン" ,"フィリピン" ,"ヘアカラー" ,"ホンダ",
            "ヤフー" ,  "ユニクロ" ,"ヨーロッパ" ,
            "ラーメン" ,  "リモート" ,"ルール" ,"レモン" ,"ローストビーフ",
            "ワンピース" ,  "----" ,"インドネシア" ,
    } ;
    public String[] katakanaListDescription = {
            "আইসক্রিম" ,  "ইন্ডিয়া" ,"কাঠ" ,"চলন্ত সিঁড়ি" ,"মালিক",
            "ক্যালেন্ডার" ,  "বাঁধা কপি" ,"ক্রিসমাস" ,"কেক" ,"কোকা কোলা",
            "সাইজ" ,  "সিঙ্গাপুর" ,"সুপ" ,"সাদা কস্টপ" ,"সফটওয়্যার",
            "টাইটেল" ,  "টিম" ,"সরঞ্জামসমূহ" ,"বিষয়" ,"টোস্ট করার বৈদু্যতিক যন্ত্র",
            "ছুরি" ,  "নিউজ" ,"নুডুলস" ,"নেপাল" ,"নোট বুক",
            "মালয়েশিয়া" ,  "মিয়ানমার" ,"চলাচল" ,"ই-মেইল" ,"ধরন",
            "হ্যাঁলোইন" ,  "মানুষ" ,"ফিলিপিন" ,"চুলের রং" ,"হোন্ডা",
            "ইয়াহু" ,  "ইউনিকুলো" ,"ইউরোপ" ,
            "নুডুলস" ,  "রিমোট জব " ,"নিয়ম" ,"লেবু" ,"গরুর মাংস রোষ্ট",
            "অয়ানপিছ" ,  "----" ,"ইন্দোনেশিয়া" ,
    } ;

    public int[] katakanaFirstBackground = {
            Color.rgb(245,255,250),Color.rgb(245,255,250),
            Color.rgb(245,255,250),Color.rgb(245,255,250),
            Color.rgb(245,255,250),Color.rgb(245,255,250),
            Color.rgb(245,255,250),Color.rgb(245,255,250),
            Color.rgb(245,255,250),Color.rgb(245,255,250),
            Color.rgb(245,255,250),Color.rgb(245,255,250),
            Color.rgb(245,255,250),Color.rgb(245,255,250),
            Color.rgb(245,255,250),Color.rgb(245,255,250),
            Color.rgb(245,255,250),Color.rgb(245,255,250),
            Color.rgb(245,255,250),Color.rgb(245,255,250),
            Color.rgb(245,255,250),Color.rgb(245,255,250),
            Color.rgb(245,255,250),Color.rgb(245,255,250),
            Color.rgb(245,255,250),Color.rgb(245,255,250),
            Color.rgb(245,255,250),Color.rgb(245,255,250),
            Color.rgb(245,255,250),Color.rgb(245,255,250),
            Color.rgb(245,255,250),Color.rgb(245,255,250),
            Color.rgb(245,255,250),Color.rgb(245,255,250),
            Color.rgb(245,255,250),Color.rgb(245,255,250),
            Color.rgb(245,255,250),Color.rgb(245,255,250),
            Color.rgb(245,255,250),Color.rgb(245,255,250),
            Color.rgb(245,255,250),Color.rgb(245,255,250),
            Color.rgb(245,255,250),Color.rgb(245,255,250),
    };

    public katakanaSlideAdapter(Context context){
        this.katakanaContext = context;
    }


    @Override
    public int getCount() {
        return katakanaListTitles.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return (view == (LinearLayout)object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        katakanaInflater= (LayoutInflater) katakanaContext.getSystemService(katakanaContext.LAYOUT_INFLATER_SERVICE);
        View view = katakanaInflater.inflate(R.layout.katakana_slide,container,false);
        LinearLayout katakanaLayoutSlide = view.findViewById(R.id.katakanaSlideLinearLayout);
        TextView katakanaheadlineTextView = view.findViewById(R.id.katakanaSlideHeadlineId);
        TextView kanaPronounciationTextView = view.findViewById(R.id.kanaPronounciationTextId);
        TextView katakanaTitleView = view.findViewById(R.id.katakanaSlideTextViewId);
        TextView katakanaDescriptionTextView = view.findViewById(R.id.katakanaSlideTextDescriptionId);
        katakanaLayoutSlide.setBackgroundColor(katakanaFirstBackground[position]);
        katakanaheadlineTextView.setText(katakanaListHeadlines[position]);
        kanaPronounciationTextView.setText(kanaPronounciations[position]);
        katakanaTitleView.setText(katakanaListTitles[position]);
        katakanaDescriptionTextView.setText(katakanaListDescription[position]);
        container.addView(view);
        return view;

    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((LinearLayout)object);
    }
}
