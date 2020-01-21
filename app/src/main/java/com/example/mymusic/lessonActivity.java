package com.example.mymusic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class lessonActivity extends AppCompatActivity implements View.OnClickListener {

    private CardView grammerCardView , kanjiCardView ,liseningCardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson);
        //adding back button to the tool bar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);


        grammerCardView = findViewById(R.id.grammerCardViewId);
        grammerCardView.setOnClickListener(this);
        kanjiCardView = findViewById(R.id.kanji1CardViewId);
        kanjiCardView.setOnClickListener(this);
        liseningCardView = findViewById(R.id.lisening01CardViewId);
        liseningCardView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.grammerCardViewId)
        {
            Intent lesson01Details = new Intent(lessonActivity.this,lesson_01Activity.class);
            startActivity(lesson01Details);

        }else if (v.getId() == R.id.kanji1CardViewId){
            Intent kanji01 = new Intent(lessonActivity.this,kanji_01Activity.class);
            startActivity(kanji01);
        }else if (v.getId() == R.id.lisening01CardViewId){
            Intent lisening01 = new Intent(lessonActivity.this, lisening_01Activity.class);
            startActivity(lisening01);
        }

    }
}
