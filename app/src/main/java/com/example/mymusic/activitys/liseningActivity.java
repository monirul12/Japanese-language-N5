package com.example.mymusic.activitys;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.mymusic.R;
import com.example.mymusic.utility.music;
import com.example.mymusic.adapters.musicAdapter;

import java.util.ArrayList;

public class liseningActivity extends AppCompatActivity{

    private ArrayList<music> my_main_arrayList;
    private musicAdapter myMusicAdapter;
    private ListView list_view_music;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lisening);

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
