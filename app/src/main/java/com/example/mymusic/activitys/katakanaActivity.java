package com.example.mymusic.activitys;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.mymusic.R;
import com.example.mymusic.adapters.katakanaSlideAdapter;

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
