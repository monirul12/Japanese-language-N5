package com.example.mymusic.activitys;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ExpandableListView;

import com.example.mymusic.R;
import com.example.mymusic.adapters.CustomAdapter1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class KanjiCharacterActivity extends AppCompatActivity {
    
    private int lessonId;
    
    private ExpandableListView expandableListView;
    private CustomAdapter1 customAdapter1;

    List<String> listDataHeader;
    HashMap<String,List<String>> listDataChild;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kanji_character);

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
                headerString = getResources().getStringArray(R.array.kanji01_titles);
                childString = getResources().getStringArray(R.array.kanji01_details);
                break;
            case 2:
                headerString = getResources().getStringArray(R.array.kanji02_titles);
                childString = getResources().getStringArray(R.array.kanji02_details);
                break;
            case 3:
                headerString = getResources().getStringArray(R.array.kanji03_titles);
                childString = getResources().getStringArray(R.array.kanji03_details);
                break;
            case 4:
                headerString = getResources().getStringArray(R.array.kanji04_titles);
                childString = getResources().getStringArray(R.array.kanji04_details);
                break;
            case 5:
                headerString = getResources().getStringArray(R.array.kanji05_titles);
                childString = getResources().getStringArray(R.array.kanji05_details);
                break;
            case 6:
                headerString = getResources().getStringArray(R.array.kanji06_titles);
                childString = getResources().getStringArray(R.array.kanji06_details);
                break;
            case 7:
                headerString = getResources().getStringArray(R.array.kanji07_titles);
                childString = getResources().getStringArray(R.array.kanji07_details);
                break;
            case 8:
                headerString = getResources().getStringArray(R.array.kanji08_titles);
                childString = getResources().getStringArray(R.array.kanji08_details);
                break;
            case 9:
                headerString = getResources().getStringArray(R.array.kanji09_titles);
                childString = getResources().getStringArray(R.array.kanji09_details);
                break;
            case 10:
                headerString = getResources().getStringArray(R.array.kanji10_titles);
                childString = getResources().getStringArray(R.array.kanji10_details);
                break;
            case 11:
                headerString = getResources().getStringArray(R.array.kanji11_titles);
                childString = getResources().getStringArray(R.array.kanji11_details);
                break;
            case 12:
                headerString = getResources().getStringArray(R.array.kanji12_titles);
                childString = getResources().getStringArray(R.array.kanji12_details);
                break;
            case 13:
                headerString = getResources().getStringArray(R.array.kanji13_titles);
                childString = getResources().getStringArray(R.array.kanji13_details);
                break;
            case 14:
                headerString = getResources().getStringArray(R.array.kanji14_titles);
                childString = getResources().getStringArray(R.array.kanji14_details);
                break;
            case 15:
                headerString = getResources().getStringArray(R.array.kanji15_titles);
                childString = getResources().getStringArray(R.array.kanji15_details);
                break;

            default:
                headerString = getResources().getStringArray(R.array.kanji01_titles);
                childString = getResources().getStringArray(R.array.kanji01_details);
                return;
        }

        listDataHeader = new ArrayList<>();
        listDataChild = new HashMap<>();

        for (int i=0; i<headerString.length;i++) {
            listDataHeader.add(headerString[i]);
            List<String> child = new ArrayList<>();
            child.add(childString[i]);

            listDataChild.put(listDataHeader.get(i),child);
        }
    }
}
