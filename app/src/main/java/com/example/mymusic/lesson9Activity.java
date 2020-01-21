package com.example.mymusic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class lesson9Activity extends AppCompatActivity implements View.OnClickListener {
    private CardView grammer9CardView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson9);
        grammer9CardView = findViewById(R.id.grammer9CardViewId);
        grammer9CardView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

            Intent lesson09 = new Intent(lesson9Activity.this,lesson_09Activity.class);
            startActivity(lesson09);
    }
}
