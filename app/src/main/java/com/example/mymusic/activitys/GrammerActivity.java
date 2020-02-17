package com.example.mymusic.activitys;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ExpandableListView;

import com.example.mymusic.adapters.CustomAdapter1;
import com.example.mymusic.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GrammerActivity extends AppCompatActivity {

    private int lessonId;

    private ExpandableListView expandableListView;
    private CustomAdapter1 customAdapter1;

    List<String> listDataHeader;
    HashMap<String,List<String>> listDataChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grammer);

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
                headerString = getResources().getStringArray(R.array.grammer01_titles);
                childString = getResources().getStringArray(R.array.grammer01_details);
                break;
            case 2:
                headerString = getResources().getStringArray(R.array.grammer02_titles);
                childString = getResources().getStringArray(R.array.grammer02_details);
                break;
            case 3:
                headerString = getResources().getStringArray(R.array.grammer03_titles);
                childString = getResources().getStringArray(R.array.grammer03_details);
                break;
            case 4:
                headerString = getResources().getStringArray(R.array.grammer04_titles);
                childString = getResources().getStringArray(R.array.grammer04_details);
                break;
            case 5:
                headerString = getResources().getStringArray(R.array.grammer05_titles);
                childString = getResources().getStringArray(R.array.grammer05_details);
                break;
            case 6:
                headerString = getResources().getStringArray(R.array.grammer06_titles);
                childString = getResources().getStringArray(R.array.grammer06_details);
                break;
            case 7:
                headerString = getResources().getStringArray(R.array.grammer07_titles);
                childString = getResources().getStringArray(R.array.grammer07_details);
                break;
            case 8:
                headerString = getResources().getStringArray(R.array.grammer08_titles);
                childString = getResources().getStringArray(R.array.grammer08_details);
                break;
            case 9:
                headerString = getResources().getStringArray(R.array.grammer09_titles);
                childString = getResources().getStringArray(R.array.grammer09_details);
                break;
            case 10:
                headerString = getResources().getStringArray(R.array.grammer10_titles);
                childString = getResources().getStringArray(R.array.grammer10_details);
                break;
            case 11:
                headerString = getResources().getStringArray(R.array.grammer11_titles);
                childString = getResources().getStringArray(R.array.grammer11_details);
                break;
            case 12:
                headerString = getResources().getStringArray(R.array.grammer12_titles);
                childString = getResources().getStringArray(R.array.grammer12_details);
                break;
            case 13:
                headerString = getResources().getStringArray(R.array.grammer13_titles);
                childString = getResources().getStringArray(R.array.grammer13_details);
                break;
            case 14:
                headerString = getResources().getStringArray(R.array.grammer14_titles);
                childString = getResources().getStringArray(R.array.grammer14_details);
                break;
            case 15:
                headerString = getResources().getStringArray(R.array.grammer15_titles);
                childString = getResources().getStringArray(R.array.grammer15_details);
                break;

                default:
                    headerString = getResources().getStringArray(R.array.grammer01_titles);
                    childString = getResources().getStringArray(R.array.grammer01_details);
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
