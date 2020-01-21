package com.example.mymusic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class lesson5Activity extends AppCompatActivity implements View.OnClickListener {
    private CardView grammer5CardView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson5);

        grammer5CardView = findViewById(R.id.grammer5CardViewId);
        grammer5CardView.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.grammer5CardViewId)
        {
            Intent lesson05 = new Intent(lesson5Activity.this,lesson_05Activity.class);
            startActivity(lesson05);
        }
    }
}
