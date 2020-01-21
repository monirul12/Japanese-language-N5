package com.example.mymusic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class lesson11Activity extends AppCompatActivity implements View.OnClickListener {
    private CardView grammer11CardView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson11);

        grammer11CardView = findViewById(R.id.grammer11CardViewId);
        grammer11CardView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent lesson11 = new Intent(lesson11Activity.this,lesson_11Activity.class);
        startActivity(lesson11);
    }
}
