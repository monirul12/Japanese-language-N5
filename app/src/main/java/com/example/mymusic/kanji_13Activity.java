package com.example.mymusic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class kanji_13Activity extends AppCompatActivity {
    private ViewPager viewPager;
    private kanji13SlideAdapter myAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kanji_13);

        viewPager = findViewById(R.id.viewpager);
        myAdapter = new kanji13SlideAdapter(this);
        viewPager.setAdapter(myAdapter);
    }
}
