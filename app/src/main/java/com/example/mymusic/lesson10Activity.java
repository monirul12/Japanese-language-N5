package com.example.mymusic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class lesson10Activity extends AppCompatActivity implements View.OnClickListener {

    private CardView grammer10CardView,kanji10CardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson10);

        grammer10CardView = findViewById(R.id.grammer10CardViewId);
        grammer10CardView.setOnClickListener(this);

        kanji10CardView = findViewById(R.id.kanji10CardViewId);
        kanji10CardView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if (v.getId()  == R.id.grammer10CardViewId)
        { Intent lesson10 = new Intent(lesson10Activity.this,lesson_10Activity.class);
            startActivity(lesson10);
        }else if (v.getId() == R.id.kanji10CardViewId)
        {
            Intent kanji10 = new Intent(lesson10Activity.this,kanji_10Activity.class);
            startActivity(kanji10);

        }


    }
}
