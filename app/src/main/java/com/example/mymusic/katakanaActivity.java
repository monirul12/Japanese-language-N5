package com.example.mymusic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class katakanaActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private katakanaSlideAdapter myAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_katakana);
        viewPager = findViewById(R.id.viewpager);
        myAdapter = new katakanaSlideAdapter(this);
        viewPager.setAdapter(myAdapter);
    }
}
