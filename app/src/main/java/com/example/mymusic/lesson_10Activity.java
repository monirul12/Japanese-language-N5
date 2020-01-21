package com.example.mymusic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class lesson_10Activity extends AppCompatActivity {
    private ViewPager viewPager;
    private lesson10SlideAdapter myAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_10);
        viewPager = findViewById(R.id.viewpager);
        myAdapter = new lesson10SlideAdapter(this);
        viewPager.setAdapter(myAdapter);
    }
}
