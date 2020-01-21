package com.example.mymusic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class lesson_03Activity extends AppCompatActivity {
    private ViewPager viewPager;
    private lesson03SlideAdapter myAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_03);
        viewPager = findViewById(R.id.viewpager);
        myAdapter = new lesson03SlideAdapter(this);
        viewPager.setAdapter(myAdapter);
    }
}
