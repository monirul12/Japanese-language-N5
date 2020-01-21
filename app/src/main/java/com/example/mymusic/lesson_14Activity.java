package com.example.mymusic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class lesson_14Activity extends AppCompatActivity {
    private ViewPager viewPager;
    private lesson14SlideAdapter myAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_14);

        viewPager = findViewById(R.id.viewpager);
        myAdapter = new lesson14SlideAdapter(this);
        viewPager.setAdapter(myAdapter);
    }
}
