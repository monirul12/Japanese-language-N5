package com.example.mymusic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class lesson2Activity extends AppCompatActivity implements View.OnClickListener {
    private CardView grammer2CardView,kanji2CardView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson2);

        //adding back button to the tool bar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        grammer2CardView = findViewById(R.id.grammer2CardViewId);
        grammer2CardView.setOnClickListener(this);
        kanji2CardView = findViewById(R.id.kanji02CardViewId);
        kanji2CardView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.grammer2CardViewId)
        {
            Intent lesson02 = new Intent(lesson2Activity.this,lesson_02Activity.class);
            startActivity(lesson02);
        }else if (v.getId() == R.id.kanji02CardViewId){
            Intent kanji02 = new Intent(lesson2Activity.this,kanji_02Activity.class);
            startActivity(kanji02);
        }
    }
}
