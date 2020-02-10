package com.example.mymusic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.annotation.SuppressLint;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class lisening_01Activity extends AppCompatActivity{

    private ArrayList<music> my_main_arrayList;
    private musicAdapter myMusicAdapter;
    private ListView list_view_music;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lisening_01);

        list_view_music = findViewById(R.id.listViewMediaPlayer);

        my_main_arrayList = new ArrayList();
        my_main_arrayList.add(new music("bangladesh","bfsdvvgdfsd", R.raw.lisening_01a));
        my_main_arrayList.add(new music("hello","bfsdvvgdfsd", R.raw.torkotha));
        my_main_arrayList.add(new music("hey","bfsdfgvvgdfsd", R.raw.torkotha));
        my_main_arrayList.add(new music("oh","bfsdvvgdfsd", R.raw.torkotha));
        my_main_arrayList.add(new music("lam","bfsdvvgdfsd", R.raw.torkotha));

        musicAdapter adapter = new musicAdapter (this, R.layout.lisening_item_listview, my_main_arrayList);
        list_view_music.setAdapter(adapter);
        }
    }
