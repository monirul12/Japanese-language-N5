package com.example.mymusic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class lesson11Activity extends AppCompatActivity implements View.OnClickListener {
    private CardView grammer11CardView,kanji11CardCiew,vocabulary11CardView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson11);

        grammer11CardView = findViewById(R.id.grammer11CardViewId);
        grammer11CardView.setOnClickListener(this);

        kanji11CardCiew = findViewById(R.id.kanji11CardViewId);
        kanji11CardCiew.setOnClickListener(this);


        vocabulary11CardView = findViewById(R.id.vocabulary11CardViewId);
        vocabulary11CardView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.grammer11CardViewId){

            Intent lesson11 = new Intent(lesson11Activity.this,lesson_11Activity.class);
            startActivity(lesson11);

        }else if (v.getId()==R.id.kanji11CardViewId){

            Intent kanji11 = new Intent(lesson11Activity.this,kanji_11Activity.class);
            startActivity(kanji11);
        }else if (v.getId() == R.id.vocabulary11CardViewId){

            Intent vocabulary11 = new Intent(lesson11Activity.this,vocablary_11Activity.class);
            startActivity(vocabulary11);
        }

    }
}
