package com.example.mymusic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class KanjiActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private SlideAdapter myAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kanji);
        viewPager = findViewById(R.id.viewpager);
        myAdapter = new SlideAdapter(this);
        viewPager.setAdapter(myAdapter);
    }
}
