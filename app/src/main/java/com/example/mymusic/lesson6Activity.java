package com.example.mymusic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class lesson6Activity extends AppCompatActivity  implements View.OnClickListener {
    private CardView grammer6CardView,kanji6CardView,vocabulary6CardView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson6);

        grammer6CardView = findViewById(R.id.grammer6CardViewId);
        grammer6CardView.setOnClickListener(this);
        kanji6CardView = findViewById(R.id.kanji6CardViewId);
        kanji6CardView.setOnClickListener(this);
        vocabulary6CardView = findViewById(R.id.vocabulary06CardViewId);
        vocabulary6CardView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.grammer6CardViewId)
        {
            Intent lesson06 = new Intent(lesson6Activity.this,lesson_06Activity.class);
            startActivity(lesson06);
        }else if (v.getId() == R.id.kanji6CardViewId)
        {
            Intent kanji06 = new Intent(lesson6Activity.this,kanji_06Activity.class);
            startActivity(kanji06);

        }else if (v.getId() == R.id.vocabulary06CardViewId){
            Intent vocabulary06 =  new Intent(lesson6Activity.this,vocabulary_06Activity.class);
            startActivity(vocabulary06);
        }
    }
}
