package com.example.mymusic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class lesson_09Activity extends AppCompatActivity {
    private ViewPager viewPager;
    private lesson09SlideAdapter myAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_09);
        viewPager = findViewById(R.id.viewpager);
        myAdapter = new lesson09SlideAdapter(this);
        viewPager.setAdapter(myAdapter);
    }
}
