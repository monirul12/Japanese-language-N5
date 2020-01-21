package com.example.mymusic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class lesson_06Activity extends AppCompatActivity {
    private ViewPager viewPager;
    private lesson06SlideAdapter myAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_06);
        viewPager = findViewById(R.id.viewpager);
        myAdapter = new lesson06SlideAdapter(this);
        viewPager.setAdapter(myAdapter);
    }
}
