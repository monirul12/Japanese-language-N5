package com.example.mymusic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class lesson8Activity extends AppCompatActivity implements View.OnClickListener {
    private CardView grammer8CardView,kanji8CardView,vocabulary8CardView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson8);
        grammer8CardView = findViewById(R.id.grammer8CardViewId);
        grammer8CardView.setOnClickListener(this);
        kanji8CardView = findViewById(R.id.kanji8CardViewId);
        kanji8CardView.setOnClickListener(this);
        vocabulary8CardView = findViewById(R.id.vocabulary08CardViewId);
        vocabulary8CardView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.grammer8CardViewId) {
            Intent lesson08 = new Intent(lesson8Activity.this,lesson_08Activity.class);
            startActivity(lesson08);
        }else if (v.getId() == R.id.kanji8CardViewId )
        {

            Intent kanji08 = new Intent(lesson8Activity.this,kanji_08Activity.class);
            startActivity(kanji08);

        }else if (v.getId() == R.id.vocabulary08CardViewId){

            Intent vocabulary08 = new Intent(lesson8Activity.this,vocabulary_08Activity.class);
            startActivity(vocabulary08);
        }
    }
    }
