package com.example.mymusic;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

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
                Intent japaneseLesson = new Intent(MainActivity.this, MenuItem.class);
                startActivity(japaneseLesson);

            }
        });

//click for kanji activity run

        alphabetText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent alphabet = new Intent(MainActivity.this,KanjiActivity.class);
                startActivity(alphabet);

            }
        });
    }
}
