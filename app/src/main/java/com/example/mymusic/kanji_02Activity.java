package com.example.mymusic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class kanji_02Activity extends AppCompatActivity {
    private ViewPager viewPager;
    private kanji2SlideAdapter myAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kanji_02);
        viewPager = findViewById(R.id.viewpager);
        myAdapter = new kanji2SlideAdapter(this);
        viewPager.setAdapter(myAdapter);
    }
}
