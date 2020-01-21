package com.example.mymusic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class lesson03Activity extends AppCompatActivity implements View.OnClickListener {
    private CardView grammer3CardView,kanji3CardView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson03);

        grammer3CardView = findViewById(R.id.grammer3CardViewId);
        grammer3CardView.setOnClickListener(this);
        kanji3CardView = findViewById(R.id.kanji3CardViewId);
        kanji3CardView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.grammer3CardViewId)
        {
            Intent lesson03 = new Intent(lesson03Activity.this,lesson_03Activity.class);
            startActivity(lesson03);
        }else if (v.getId() == R.id.kanji3CardViewId){
            Intent kanji03 = new Intent(lesson03Activity.this,kanji_03Activity.class);
            startActivity(kanji03);
        }
    }
}
