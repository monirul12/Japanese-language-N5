package com.example.mymusic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class lesson4Activity extends AppCompatActivity implements View.OnClickListener {
    private CardView grammer4CardView,kanji4CardView,vocabulary4CardView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson4);

        grammer4CardView = findViewById(R.id.grammer4CardViewId);
        grammer4CardView.setOnClickListener(this);
        kanji4CardView = findViewById(R.id.kanji4CardViewId);
        kanji4CardView.setOnClickListener(this);
        vocabulary4CardView = findViewById(R.id.vocabulary04CardViewId);
        vocabulary4CardView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.grammer4CardViewId)
        {
            Intent lesson04 = new Intent(lesson4Activity.this,lesson_04Activity.class);
            startActivity(lesson04);
        }else if (v.getId() == R.id.kanji4CardViewId){
            Intent kanji04 = new Intent(lesson4Activity.this,kanji_04Activity.class);
            startActivity(kanji04);
        }else if (v.getId()== R.id.vocabulary04CardViewId){
            Intent vocabulary04 = new Intent (lesson4Activity.this,vocabulary_04Activity.class);
            startActivity(vocabulary04);
        }
    }

}