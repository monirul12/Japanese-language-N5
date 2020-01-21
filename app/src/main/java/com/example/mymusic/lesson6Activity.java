package com.example.mymusic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class lesson6Activity extends AppCompatActivity  implements View.OnClickListener {
    private CardView grammer6CardView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson6);

        grammer6CardView = findViewById(R.id.grammer6CardViewId);
        grammer6CardView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.grammer6CardViewId)
        {
            Intent lesson06 = new Intent(lesson6Activity.this,lesson_06Activity.class);
            startActivity(lesson06);
        }
    }
}
