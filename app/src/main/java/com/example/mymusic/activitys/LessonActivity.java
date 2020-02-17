package com.example.mymusic.activitys;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.mymusic.R;

public class LessonActivity extends AppCompatActivity implements View.OnClickListener {

    private int lessonId;

    private CardView grammerCardView;
    private CardView kanjiCardView;
    private CardView liseningCardView;
    private CardView vocabulary1CardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson);

        //adding back button to the tool bar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        lessonId = getIntent().getIntExtra("lessonId", 0);

        grammerCardView = findViewById(R.id.grammerCardViewId);
        grammerCardView.setOnClickListener(this);

        kanjiCardView = findViewById(R.id.kanjiCharacterCardViewId);
        kanjiCardView.setOnClickListener(this);

        liseningCardView = findViewById(R.id.liseningCardViewId);
        liseningCardView.setOnClickListener(this);

        vocabulary1CardView = findViewById(R.id.vocabularyCardViewId);
        vocabulary1CardView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.grammerCardViewId) {
            Intent grammerIntent = new Intent(LessonActivity.this, GrammerActivity.class);
            grammerIntent.putExtra("lessonId", lessonId);
            startActivity(grammerIntent);
        }else if (v.getId() == R.id.kanjiCharacterCardViewId){
            Intent kanjiCharacterIntent = new Intent(LessonActivity.this, KanjiCharacterActivity.class);
            kanjiCharacterIntent.putExtra("lessonId", lessonId);
            startActivity(kanjiCharacterIntent);
        }else if (v.getId() == R.id.liseningCardViewId){
            Intent liseningIntent = new Intent(LessonActivity.this, liseningActivity.class);
            liseningIntent.putExtra("lessonId", lessonId);
            startActivity(liseningIntent);
        }else if (v.getId() == R.id.vocabularyCardViewId) {
            Intent vocabularyIntent = new Intent(LessonActivity.this, VocabularyActivity.class);
            vocabularyIntent.putExtra("lessonId", lessonId);
            startActivity(vocabularyIntent);
        }
    }
}
