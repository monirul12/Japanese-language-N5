package com.example.mymusic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class lesson_04Activity extends AppCompatActivity {
    private ViewPager viewPager;
    private lesson04SlideAdapter myAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_04);
        viewPager = findViewById(R.id.viewpager);
        myAdapter = new lesson04SlideAdapter(this);
        viewPager.setAdapter(myAdapter);
    }
}
