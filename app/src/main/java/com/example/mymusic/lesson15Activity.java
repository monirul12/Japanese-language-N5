package com.example.mymusic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class lesson15Activity extends AppCompatActivity implements View.OnClickListener {
    private CardView grammer15CardView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson15);

        grammer15CardView = findViewById(R.id.grammer15CardViewId);
        grammer15CardView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent lesson15 = new Intent(lesson15Activity.this,lesson_15Activity.class);
        startActivity(lesson15);
    }
}
