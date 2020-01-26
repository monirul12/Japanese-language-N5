package com.example.mymusic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class kanji_07Activity extends AppCompatActivity {

    private ViewPager viewPager;
    private kanji7SlideAdapter myAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kanji_07);

        viewPager = findViewById(R.id.viewpager);
        myAdapter = new kanji7SlideAdapter(this);
        viewPager.setAdapter(myAdapter);
    }
}
