package com.example.mymusic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class vocabulary_01Activity extends AppCompatActivity {
    private ViewPager viewPager;
    private vocabulary1SlideAdapter myAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vocabulary_01);

        viewPager = findViewById(R.id.viewpager);
        myAdapter = new vocabulary1SlideAdapter(this);
        viewPager.setAdapter(myAdapter);
    }
}
