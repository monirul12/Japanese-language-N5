package com.example.mymusic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class lesson12Activity extends AppCompatActivity implements View.OnClickListener {
    private CardView grammer12CardView,kanji12CardView,vocabulary12CardView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson12);

        grammer12CardView = findViewById(R.id.grammer12CardViewId);
        grammer12CardView.setOnClickListener(this);
        kanji12CardView = findViewById(R.id.kanji12CardViewId);
        kanji12CardView.setOnClickListener(this);
        vocabulary12CardView = findViewById(R.id.vocabulary12CardViewId);
        vocabulary12CardView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.grammer12CardViewId){

            Intent lesson12 = new Intent(lesson12Activity.this,lesson_12Activity.class);
            startActivity(lesson12);
        }else if (v.getId()==R.id.kanji12CardViewId){

            Intent kanji12 = new Intent(lesson12Activity.this,kanji_12Activity.class);
            startActivity(kanji12);
        }else if (v.getId() == R.id.vocabulary12CardViewId){

            Intent vocabulary12 = new Intent(lesson12Activity.this,vocabulary_12Activity.class);
            startActivity(vocabulary12);
        }

    }
}
