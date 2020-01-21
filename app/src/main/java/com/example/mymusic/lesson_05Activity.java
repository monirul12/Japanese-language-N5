package com.example.mymusic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class lesson_05Activity extends AppCompatActivity {
    private ViewPager viewPager;
    private lesson05SlideAdapter myAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_05);
        viewPager = findViewById(R.id.viewpager);
        myAdapter = new lesson05SlideAdapter(this);
        viewPager.setAdapter(myAdapter);
    }
}
