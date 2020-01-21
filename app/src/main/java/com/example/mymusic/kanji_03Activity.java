package com.example.mymusic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;

public class kanji_03Activity extends AppCompatActivity {
    private ViewPager viewPager;
    private kanji3SlideAdapter myAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kanji_03);

        viewPager = findViewById(R.id.viewpager);
        myAdapter = new kanji3SlideAdapter(this);
        viewPager.setAdapter(myAdapter);
    }

}
