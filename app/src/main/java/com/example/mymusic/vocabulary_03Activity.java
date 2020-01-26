package com.example.mymusic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class vocabulary_03Activity extends AppCompatActivity {

    private ViewPager viewPager;
    private vocabulary3SlideAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vocabulary_03);

        viewPager = findViewById(R.id.viewpager);
        myAdapter = new vocabulary3SlideAdapter(this);
        viewPager.setAdapter(myAdapter);
    }
}
