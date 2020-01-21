package com.example.mymusic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class lesson_07Activity extends AppCompatActivity {
    private ViewPager viewPager;
    private lesson07SlideAdapter myAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_07);

        viewPager = findViewById(R.id.viewpager);
        myAdapter = new lesson07SlideAdapter(this);
        viewPager.setAdapter(myAdapter);
    }
}
