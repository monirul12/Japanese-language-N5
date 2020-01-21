package com.example.mymusic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class lesson13Activity extends AppCompatActivity implements View.OnClickListener {
    private CardView grammer13CardView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson13);

        grammer13CardView = findViewById(R.id.grammer13CardViewId);
        grammer13CardView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent lesson13 = new Intent(lesson13Activity.this,lesson_13Activity.class);
        startActivity(lesson13);
    }
}
