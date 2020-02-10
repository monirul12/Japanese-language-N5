package com.example.mymusic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class vocabulary_06Activity extends AppCompatActivity {
    private ExpandableListView expandableListView;
    private CustomAdapter1 customAdapter1;

    List<String> listDataHeader;
    HashMap<String,List<String>> listDataChild;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vocabulary_06);

        prepareListdata();

        expandableListView = findViewById(R.id.expandableListView1);
        customAdapter1 = new CustomAdapter1(this,listDataHeader,listDataChild);
        expandableListView.setAdapter(customAdapter1);

    }public void prepareListdata()

    {
        String[] headerString = getResources().getStringArray(R.array.vocabulary06_title);
        String[] childString = getResources().getStringArray(R.array.vocabulary06_description);

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
