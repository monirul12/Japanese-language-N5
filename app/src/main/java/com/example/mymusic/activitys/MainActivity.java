package com.example.mymusic.activitys;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.mymusic.R;

public class MainActivity extends AppCompatActivity{
private Button nextButton;
private CardView japaneseLesson,alphabetText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        alphabetText = findViewById(R.id.japanesealphaCardViewId);
        japaneseLesson = findViewById(R.id.japaneseLessonId);
        japaneseLesson.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                Intent japaneseLesson = new Intent(MainActivity.this, LessonListActivity.class);
                startActivity(japaneseLesson);

            }
        });

        alphabetText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent alphabet = new Intent(MainActivity.this, alphabetScreenActivity.class);
                startActivity(alphabet);

            }
        });


    }
}
