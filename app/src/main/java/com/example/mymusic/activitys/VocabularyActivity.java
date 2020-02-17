package com.example.mymusic.activitys;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ExpandableListView;
import com.example.mymusic.adapters.CustomAdapter1;
import com.example.mymusic.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class VocabularyActivity extends AppCompatActivity {

    private int lessonId;
    
    private ExpandableListView expandableListView;
    private CustomAdapter1 customAdapter1;

    List<String> listDataHeader;
    HashMap<String,List<String>> listDataChild;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vocabulary);

        lessonId = getIntent().getIntExtra("lessonId", 0);
        
        prepareListdata();

        expandableListView = findViewById(R.id.expandableListView1);
        customAdapter1 = new CustomAdapter1(this,listDataHeader,listDataChild);
        expandableListView.setAdapter(customAdapter1);

    }
    
    public void prepareListdata() {

        String[] headerString;
        String[] childString;

        switch (lessonId) {
            case 1:
                headerString = getResources().getStringArray(R.array.vocabulary01_title);
                childString = getResources().getStringArray(R.array.vocabulary01_description);
                break;
            case 2:
                headerString = getResources().getStringArray(R.array.vocabulary02_title);
                childString = getResources().getStringArray(R.array.vocabulary02_description);
                break;
            case 3:
                headerString = getResources().getStringArray(R.array.vocabulary03_title);
                childString = getResources().getStringArray(R.array.vocabulary03_description);
                break;
            case 4:
                headerString = getResources().getStringArray(R.array.vocabulary04_title);
                childString = getResources().getStringArray(R.array.vocabulary04_description);
                break;
            case 5:
                headerString = getResources().getStringArray(R.array.vocabulary05_title);
                childString = getResources().getStringArray(R.array.vocabulary05_description);
                break;
            case 6:
                headerString = getResources().getStringArray(R.array.vocabulary06_title);
                childString = getResources().getStringArray(R.array.vocabulary06_description);
                break;
            case 7:
                headerString = getResources().getStringArray(R.array.vocabulary07_title);
                childString = getResources().getStringArray(R.array.vocabulary07_description);
                break;
            case 8:
                headerString = getResources().getStringArray(R.array.vocabulary08_title);
                childString = getResources().getStringArray(R.array.vocabulary08_description);
                break;
            case 9:
                headerString = getResources().getStringArray(R.array.vocabulary09_title);
                childString = getResources().getStringArray(R.array.vocabulary09_description);
                break;
            case 10:
                headerString = getResources().getStringArray(R.array.vocabulary10_title);
                childString = getResources().getStringArray(R.array.vocabulary10_description);
                break;
            case 11:
                headerString = getResources().getStringArray(R.array.vocabulary11_title);
                childString = getResources().getStringArray(R.array.vocabulary11_description);
                break;
            case 12:
                headerString = getResources().getStringArray(R.array.vocabulary12_title);
                childString = getResources().getStringArray(R.array.vocabulary12_description);
                break;
            case 13:
                headerString = getResources().getStringArray(R.array.vocabulary13_title);
                childString = getResources().getStringArray(R.array.vocabulary13_description);
                break;
            case 14:
                headerString = getResources().getStringArray(R.array.vocabulary14_title);
                childString = getResources().getStringArray(R.array.vocabulary14_description);
                break;
            case 15:
                headerString = getResources().getStringArray(R.array.vocabulary15_title);
                childString = getResources().getStringArray(R.array.vocabulary15_description);
                break;

            default:
                headerString = getResources().getStringArray(R.array.vocabulary01_title);
                childString = getResources().getStringArray(R.array.vocabulary01_description);
                return;
        }

        listDataHeader = new ArrayList<>();
        listDataChild = new HashMap<>();

        for (int i=0; i<headerString.length;i++)
        {

            listDataHeader.add(headerString[i]);
            List<String> child = new ArrayList<>();
            child.add(childString[i]);

            listDataChild.put(listDataHeader.get(i),child);

        }
    }
}
