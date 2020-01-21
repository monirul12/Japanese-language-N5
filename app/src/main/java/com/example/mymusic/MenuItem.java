package com.example.mymusic;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MenuItem extends AppCompatActivity implements View.OnClickListener {

    private Button expandableButton;
    private CardView lesson01CardView, lesson02CardView,lesson03CardView,
            lesson04CardView,lesson05CardView,lesson06CardView,lesson07CardView,
            lesson08CardView,lesson09CardView,lesson10CardView,lesson11CardView,
            lesson12CardView,lesson13CardView,lesson14CardView,lesson15CardView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_item);

        //adding back button to the tool bar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);


        lesson01CardView = findViewById(R.id.lesson01CardViewId);
        lesson02CardView = findViewById(R.id.lesson02CardViewId);
        lesson03CardView = findViewById(R.id.lesson03CardViewId);
        lesson04CardView = findViewById(R.id.lesson04CardViewId);
        lesson05CardView = findViewById(R.id.lesson05CardViewId);
        lesson06CardView = findViewById(R.id.lesson06CardViewId);
        lesson07CardView = findViewById(R.id.lesson07CardViewId);
        lesson08CardView = findViewById(R.id.lesson08CardViewId);
        lesson09CardView = findViewById(R.id.lesson09CardViewId);
        lesson10CardView = findViewById(R.id.lesson10CardViewId);
        lesson11CardView = findViewById(R.id.lesson11CardViewId);
        lesson12CardView = findViewById(R.id.lesson12CardViewId);
        lesson13CardView = findViewById(R.id.lesson13CardViewId);
        lesson14CardView = findViewById(R.id.lesson14CardViewId);
        lesson15CardView = findViewById(R.id.lesson15CardViewId);

        lesson01CardView.setOnClickListener(this);
        lesson02CardView.setOnClickListener(this);
        lesson03CardView.setOnClickListener(this);
        lesson04CardView.setOnClickListener(this);
        lesson05CardView.setOnClickListener(this);
        lesson06CardView.setOnClickListener(this);
        lesson07CardView.setOnClickListener(this);
        lesson08CardView.setOnClickListener(this);
        lesson09CardView.setOnClickListener(this);
        lesson10CardView.setOnClickListener(this);
        lesson11CardView.setOnClickListener(this);
        lesson12CardView.setOnClickListener(this);
        lesson13CardView.setOnClickListener(this);
        lesson14CardView.setOnClickListener(this);
        lesson15CardView.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.lesson01CardViewId)
        {
            Intent lesson01 = new Intent(MenuItem.this,lessonActivity.class);
                startActivity(lesson01);

        }else if (v.getId() == R.id.lesson02CardViewId)
        {
            Intent lesson02 = new Intent(MenuItem.this,lesson2Activity.class);
            startActivity(lesson02);
        }else if (v.getId() == R.id.lesson03CardViewId)
        {
            Intent lesson03 = new Intent(MenuItem.this,lesson03Activity.class);
            startActivity(lesson03);
        }else if (v.getId() == R.id.lesson04CardViewId)
        {
            Intent lesson04 = new Intent(MenuItem.this,lesson4Activity.class);
            startActivity(lesson04);
        }
        else if (v.getId() == R.id.lesson05CardViewId)
        {
            Intent lesson05 = new Intent(MenuItem.this,lesson5Activity.class);
            startActivity(lesson05);
        }else if (v.getId() == R.id.lesson06CardViewId)
        {
            Intent lesson06 = new Intent(MenuItem.this,lesson6Activity.class);
            startActivity(lesson06);
        }else if (v.getId() == R.id.lesson07CardViewId)
        {
            Intent lesson07 = new Intent(MenuItem.this,lesson7Activity.class);
            startActivity(lesson07);
        }else if (v.getId() == R.id.lesson08CardViewId)
        {
            Intent lesson08 = new Intent(MenuItem.this,lesson8Activity.class);
            startActivity(lesson08);
        }else if (v.getId() == R.id.lesson09CardViewId)
        {
            Intent lesson09 = new Intent(MenuItem.this,lesson9Activity.class);
            startActivity(lesson09);
        }else if (v.getId() == R.id.lesson10CardViewId)
        {
            Intent lesson10 = new Intent(MenuItem.this,lesson10Activity.class);
            startActivity(lesson10);
        }else if (v.getId() == R.id.lesson11CardViewId)
        {
            Intent lesson11 = new Intent(MenuItem.this,lesson11Activity.class);
            startActivity(lesson11);
        }else if (v.getId() == R.id.lesson12CardViewId)
        {
            Intent lesson12 = new Intent(MenuItem.this,lesson12Activity.class);
            startActivity(lesson12);
        }else if (v.getId() == R.id.lesson13CardViewId)
        {
            Intent lesson13 = new Intent(MenuItem.this,lesson13Activity.class);
            startActivity(lesson13);
        }
        else if (v.getId() == R.id.lesson14CardViewId)
        {
            Intent lesson14 = new Intent(MenuItem.this,lesson14Activity.class);
            startActivity(lesson14);
        }else if (v.getId() == R.id.lesson15CardViewId)
        {
            Intent lesson15 = new Intent(MenuItem.this,lesson15Activity.class);
            startActivity(lesson15);
        }

    }


    //for share app
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_layout,menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull android.view.MenuItem item) {

        if (item.getItemId()==R.id.shareId)
        {
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");

            String subject = "japanese language app";
            String body = "This is very helpful to learn japanese language and culture. ";
            intent.putExtra(Intent.EXTRA_SUBJECT,subject);
            intent.putExtra(Intent.EXTRA_TEXT,body);
            startActivity(Intent.createChooser(intent,"Share With"));
        }else if(item.getItemId()==R.id.feedbackId){
            Intent intent = new Intent(getApplicationContext(),FeedbackActivity.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }

}
