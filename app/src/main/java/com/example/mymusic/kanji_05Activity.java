package com.example.mymusic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class kanji_05Activity extends AppCompatActivity {
    private ViewPager viewPager;
    private kanji5SlideAdapter myAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kanji_05);
        viewPager = findViewById(R.id.viewpager);
        myAdapter = new kanji5SlideAdapter(this);
        viewPager.setAdapter(myAdapter);
    }
}
