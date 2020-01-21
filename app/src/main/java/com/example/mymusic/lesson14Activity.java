package com.example.mymusic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class lesson14Activity extends AppCompatActivity implements View.OnClickListener {
    private CardView grammer14CardView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson14);

        grammer14CardView = findViewById(R.id.grammer14CardViewId);
        grammer14CardView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent lesson14 = new Intent(lesson14Activity.this,lesson_14Activity.class);
        startActivity(lesson14);
    }
}
