package com.example.mymusic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class lesson5Activity extends AppCompatActivity implements View.OnClickListener {
    private CardView grammer5CardView,kanji5CardView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson5);

        grammer5CardView = findViewById(R.id.grammer5CardViewId);
        grammer5CardView.setOnClickListener(this);
        kanji5CardView = findViewById(R.id.kanji5CardViewId);
        kanji5CardView.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.grammer5CardViewId)
        {
            Intent lesson05 = new Intent(lesson5Activity.this,lesson_05Activity.class);
            startActivity(lesson05);
        }else if (v.getId() == R.id.kanji5CardViewId)
        {

            Intent kanji05 = new Intent(lesson5Activity.this, kanji_05Activity.class);
            startActivity(kanji05);
        }
    }
}
