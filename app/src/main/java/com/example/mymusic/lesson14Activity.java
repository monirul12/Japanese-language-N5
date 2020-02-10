package com.example.mymusic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class lesson14Activity extends AppCompatActivity implements View.OnClickListener {
    private CardView grammer14CardView,kanji14CardView,vocabulary14CardView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson14);

        grammer14CardView = findViewById(R.id.grammer14CardViewId);
        grammer14CardView.setOnClickListener(this);
        kanji14CardView = findViewById(R.id.kanji14CardViewId);
        kanji14CardView.setOnClickListener(this);
        vocabulary14CardView= findViewById(R.id.vocabulary14CardViewId);
        vocabulary14CardView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if (v.getId()==R.id.grammer14CardViewId){


            Intent lesson14 = new Intent(lesson14Activity.this,lesson_14Activity.class);
            startActivity(lesson14);
        }else if (v.getId()== R.id.kanji14CardViewId){

            Intent kanji14 = new Intent(lesson14Activity.this,kanji_14Activity.class);
            startActivity(kanji14);
        }else if (v.getId() == R.id.vocabulary14CardViewId){

            Intent vocabulary14 = new Intent(lesson14Activity.this,vocabulary_14Activity.class);
            startActivity(vocabulary14);
        }
    }
}
