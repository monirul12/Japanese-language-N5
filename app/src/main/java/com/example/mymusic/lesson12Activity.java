package com.example.mymusic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class lesson12Activity extends AppCompatActivity implements View.OnClickListener {
    private CardView grammer12CardView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson12);

        grammer12CardView = findViewById(R.id.grammer12CardViewId);
        grammer12CardView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent lesson12 = new Intent(lesson12Activity.this,lesson_12Activity.class);
        startActivity(lesson12);
    }
}
