package com.example.mymusic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class lesson7Activity extends AppCompatActivity implements View.OnClickListener {
    private CardView grammer7CardView,kanji7CardView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson7);

        grammer7CardView = findViewById(R.id.grammer7CardViewId);
        grammer7CardView.setOnClickListener(this);
        kanji7CardView = findViewById(R.id.kanji7CardViewId);
        kanji7CardView.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.grammer7CardViewId)
        {
            Intent lesson07 = new Intent(lesson7Activity.this,lesson_07Activity.class);
            startActivity(lesson07);
        }else if (v.getId() == R.id.kanji7CardViewId)
        {
            Intent kanji07 = new Intent(lesson7Activity.this,kanji_07Activity.class);
            startActivity(kanji07);

        }
    }
}
