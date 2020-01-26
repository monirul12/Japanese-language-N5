package com.example.mymusic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class kanji_04Activity extends AppCompatActivity  {

    private ViewPager viewPager;
    private kanji4SlideAdapter myAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kanji_04);

        viewPager = findViewById(R.id.viewpager);
        myAdapter = new kanji4SlideAdapter(this);
        viewPager.setAdapter(myAdapter);
    }
}
