package com.example.mymusic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class lesson_13Activity extends AppCompatActivity {
    private ViewPager viewPager;
    private lesson13SlideAdapter myAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_13);

        viewPager = findViewById(R.id.viewpager);
        myAdapter = new lesson13SlideAdapter(this);
        viewPager.setAdapter(myAdapter);
    }
}
