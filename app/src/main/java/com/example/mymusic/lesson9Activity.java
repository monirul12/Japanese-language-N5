package com.example.mymusic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class lesson9Activity extends AppCompatActivity implements View.OnClickListener {
    private CardView grammer9CardView,kanji9CardView,vocabulary9CardView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson9);
        grammer9CardView = findViewById(R.id.grammer9CardViewId);
        grammer9CardView.setOnClickListener(this);
        kanji9CardView = findViewById(R.id.kanji9CardViewId);
        kanji9CardView.setOnClickListener(this);

        vocabulary9CardView = findViewById(R.id.vocabulary09CardViewId);
        vocabulary9CardView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.grammer9CardViewId){
            Intent lesson09 = new Intent(lesson9Activity.this,lesson_09Activity.class);
            startActivity(lesson09);
        }else if (v.getId() == R.id.kanji9CardViewId){
            Intent kanji09 = new Intent(lesson9Activity.this,kanji_09Activity.class);
            startActivity(kanji09);
        }else if (v.getId() == R.id.vocabulary09CardViewId){

            Intent vocabulary09 = new Intent(lesson9Activity.this,vocabulary_09Activity.class);
            startActivity(vocabulary09);
        }


    }
}
