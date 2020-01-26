package com.example.mymusic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class alphabetScreenActivity extends AppCompatActivity implements View.OnClickListener {

    private CardView alphabetScreenCardView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet_screen);
        alphabetScreenCardView = findViewById(R.id.hiraganaAlphabetCardViewId);
        alphabetScreenCardView.setOnClickListener(this);
        alphabetScreenCardView = findViewById(R.id.katakanaAlphabetCardViewId);
        alphabetScreenCardView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.hiraganaAlphabetCardViewId){

            Intent hiraganaDtails = new Intent(alphabetScreenActivity.this,KanjiActivity.class);
            startActivity(hiraganaDtails);
        }else if (v.getId() == R.id.katakanaAlphabetCardViewId){
            Intent katakanaDetails = new Intent(alphabetScreenActivity.this,katakanaActivity.class);
            startActivity(katakanaDetails);
        }

    }
}
