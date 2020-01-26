package com.example.mymusic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class kanji_06Activity extends AppCompatActivity {
    private ViewPager viewPager;
    private kanji6SlideAdapter myAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kanji_06);

        viewPager = findViewById(R.id.viewpager);
        myAdapter = new kanji6SlideAdapter(this);
        viewPager.setAdapter(myAdapter);
    }
}
