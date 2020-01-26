package com.example.mymusic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class kanji_10Activity extends AppCompatActivity {

    private ViewPager viewPager;
    private kanji10SlideAdapter myAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kanji_10);

        viewPager = findViewById(R.id.viewpager);
        myAdapter = new kanji10SlideAdapter(this);
        viewPager.setAdapter(myAdapter);
    }
}
