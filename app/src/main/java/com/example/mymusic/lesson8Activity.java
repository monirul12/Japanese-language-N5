package com.example.mymusic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class lesson8Activity extends AppCompatActivity implements View.OnClickListener {
    private CardView grammer8CardView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson8);
        grammer8CardView = findViewById(R.id.grammer8CardViewId);
        grammer8CardView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent lesson08 = new Intent(lesson8Activity.this,lesson_08Activity.class);
        startActivity(lesson08);
    }
}
