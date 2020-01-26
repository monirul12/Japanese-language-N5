package com.example.mymusic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class vocabulary_02Activity extends AppCompatActivity {
    private ViewPager viewPager;
    private vocabulary2SlideAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vocabulary_02);

        viewPager = findViewById(R.id.viewpager);
        myAdapter = new vocabulary2SlideAdapter(this);
        viewPager.setAdapter(myAdapter);
    }
}
