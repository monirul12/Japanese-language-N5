package com.example.mymusic.activitys;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;

import com.example.mymusic.R;
import com.example.mymusic.adapters.LessonListRecyclerViewAdapter;

public class LessonListActivity extends AppCompatActivity implements LessonListRecyclerViewAdapter.ItemClickListener {

    LessonListRecyclerViewAdapter lessonListRecyclerViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_item);

        //adding back button to the tool bar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        // data to populate the RecyclerView with
        String[] data = {"পাঠঃ ০১", "পাঠঃ ০২", "পাঠঃ ০৩",
                "পাঠঃ ০৪", "পাঠঃ ০৫", "পাঠঃ ০৬", "পাঠঃ ০৭",
                "পাঠঃ ০৮", "পাঠঃ ০৯", "পাঠঃ ১০", "পাঠঃ ১১",
                "পাঠঃ ১২", "পাঠঃ ১৩", "পাঠঃ ১৪", "পাঠঃ ১৫"};

        // set up the RecyclerView
        RecyclerView recyclerView = findViewById(R.id.my_recycler_view);
        int numberOfColumns = 3;

        recyclerView.setLayoutManager(new GridLayoutManager(this, numberOfColumns));
        lessonListRecyclerViewAdapter = new LessonListRecyclerViewAdapter(this, data);
        lessonListRecyclerViewAdapter.setClickListener(this);

        recyclerView.setAdapter(lessonListRecyclerViewAdapter);

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
            Intent intent = new Intent(getApplicationContext(), FeedbackActivity.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onItemClick(View view, int position) {
        int lessonId = position + 1;
        Intent intent = new Intent(this, LessonActivity.class);
        intent.putExtra("lessonId", lessonId);
        startActivity(intent);
    }
}
