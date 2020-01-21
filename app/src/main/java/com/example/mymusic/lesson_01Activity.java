package com.example.mymusic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class lesson_01Activity extends AppCompatActivity {

    private ViewPager viewPager;
    private LessonSlideAdapter myAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_01);

        viewPager = findViewById(R.id.viewpager);
        myAdapter = new LessonSlideAdapter(this);
        viewPager.setAdapter(myAdapter);
    }
}
