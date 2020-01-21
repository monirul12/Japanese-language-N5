package com.example.mymusic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class lesson4Activity extends AppCompatActivity implements View.OnClickListener {
    private CardView grammer4CardView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson4);

        grammer4CardView = findViewById(R.id.grammer4CardViewId);
        grammer4CardView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.grammer4CardViewId)
        {
            Intent lesson04 = new Intent(lesson4Activity.this,lesson_04Activity.class);
            startActivity(lesson04);
        }
    }
}
