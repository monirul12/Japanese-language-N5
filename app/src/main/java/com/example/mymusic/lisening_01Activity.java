package com.example.mymusic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.IOException;

public class lisening_01Activity extends AppCompatActivity implements View.OnClickListener {
    ImageButton play,pause;
    MediaPlayer mediaPlayer;
    int pauseCurrentPossition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lisening_01);
        play = findViewById(R.id.lisening01PlayButtonId);
        play.setOnClickListener(this);
        pause=findViewById(R.id.lisening01PauseButtonId);
        pause.setOnClickListener(this);
        }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.lisening01PlayButtonId:
                if (mediaPlayer == null) {
                    mediaPlayer = MediaPlayer.create(getApplicationContext(),R.raw.lisening_01a);
                    mediaPlayer.start();

                }else if (!mediaPlayer.isPlaying()){
                    mediaPlayer.seekTo(pauseCurrentPossition);
                    mediaPlayer.start();
                }

                break;
            case R.id.lisening01PauseButtonId:
                if (mediaPlayer!=null){
                    mediaPlayer.pause();
                    pauseCurrentPossition = mediaPlayer.getCurrentPosition();

                }
                break;
        }
    }


}
