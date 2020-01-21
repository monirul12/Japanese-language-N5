package com.example.mymusic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExpandableListActivity extends AppCompatActivity {
    private ExpandableListView expandableListView;
    private CustomAdapter1 customAdapter1;
    private int lastExpandedPosition = -1;
    List<String> listDataHeader;
    HashMap<String,List<String>> listDataChild;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expandable_list_view);


        prepareListdata();


        expandableListView = findViewById(R.id.expandableListView1);
        customAdapter1 = new CustomAdapter1(this,listDataHeader,listDataChild);
        expandableListView.setAdapter((ExpandableListAdapter) customAdapter1);
        expandableListView.setOnGroupClickListener(new ExpandableListView.OnGroupClickListener() {
            @Override
            public boolean onGroupClick(ExpandableListView expandableListView, View v, int i, long id) {
               String groupName = listDataHeader.get(i);
                Toast.makeText(getApplicationContext(), "Group Name : " + groupName, Toast.LENGTH_SHORT).show();
                return false;

            }
        });

        expandableListView.setOnGroupCollapseListener(new ExpandableListView.OnGroupCollapseListener() {
            @Override
            public void onGroupCollapse(int i) {
                String groupName = listDataHeader.get(i);
                Toast.makeText(getApplicationContext(), groupName + "is Collapsed", Toast.LENGTH_SHORT).show();


            }
        });


        expandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView expandableListView, View v, int i, int i1, long id) {

                String childString = listDataChild.get(listDataHeader.get(i)).get(i1);
                Toast.makeText(getApplicationContext(),childString ,Toast.LENGTH_SHORT ).show();
                return false;
            }
        });

        expandableListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
            @Override
            public void onGroupExpand(int i) {
                if (lastExpandedPosition != -1 && lastExpandedPosition != i)
                {

                    expandableListView.collapseGroup(lastExpandedPosition);

                }
        lastExpandedPosition = i;
            }
        });
    }
    public void prepareListdata(){


        listDataHeader = new ArrayList<>();
        listDataChild = new HashMap<>();


        listDataHeader.add("পাঠ - ০১");
        List<String> overView1 = new ArrayList<>();
        overView1.add("ব্যাকরণ");
        overView1.add("শব্দার্থ");
        overView1.add("লিসেনিং");
        overView1.add("কানজি");
        listDataChild.put(listDataHeader.get(0),overView1);


        listDataHeader.add("পাঠ - ০২");
        List<String> overView2 = new ArrayList<>();
        overView2.add("ব্যাকরণ");
        overView2.add("শব্দার্থ");
        overView2.add("লিসেনিং");
        overView2.add("কানজি");
        listDataChild.put(listDataHeader.get(1),overView2);


        listDataHeader.add("পাঠ - ০৩");
        List<String> overView3 = new ArrayList<>();
        overView3.add("ব্যাকরণ");
        overView3.add("শব্দার্থ");
        overView3.add("লিসেনিং");
        overView3.add("কানজি");
        listDataChild.put(listDataHeader.get(2),overView3);


        listDataHeader.add("পাঠ - ০৪");
        List<String> overView4 = new ArrayList<>();
        overView4.add("ব্যাকরণ");
        overView4.add("শব্দার্থ");
        overView4.add("লিসেনিং");
        overView4.add("কানজি");
        listDataChild.put(listDataHeader.get(3),overView4);


        listDataHeader.add("পাঠ - ০৫");
        List<String> overView5= new ArrayList<>();
        overView5.add("ব্যাকরণ");
        overView5.add("শব্দার্থ");
        overView5.add("লিসেনিং");
        overView5.add("কানজি");
        listDataChild.put(listDataHeader.get(4),overView5);


        listDataHeader.add("পাঠ - ০৬");
        List<String> overView6= new ArrayList<>();
        overView6.add("ব্যাকরণ");
        overView6.add("শব্দার্থ");
        overView6.add("লিসেনিং");
        overView6.add("কানজি");
        listDataChild.put(listDataHeader.get(5),overView6);


        listDataHeader.add("পাঠ - ০৭");
        List<String> overView7= new ArrayList<>();
        overView7.add("ব্যাকরণ");
        overView7.add("শব্দার্থ");
        overView7.add("লিসেনিং");
        overView7.add("কানজি");
        listDataChild.put(listDataHeader.get(6),overView7);


        listDataHeader.add("পাঠ - ০৮");
        List<String> overView8 = new ArrayList<>();
        overView8.add("ব্যাকরণ");
        overView8.add("শব্দার্থ");
        overView8.add("লিসেনিং");
        overView8.add("কানজি");
        listDataChild.put(listDataHeader.get(7),overView8);


        listDataHeader.add("পাঠ - ০৯");
        List<String> overView9 = new ArrayList<>();
        overView9.add("ব্যাকরণ");
        overView9.add("শব্দার্থ");
        overView9.add("লিসেনিং");
        overView9.add("কানজি");
        listDataChild.put(listDataHeader.get(8),overView9);


        listDataHeader.add("পাঠ - ১০");
        List<String> overView10 = new ArrayList<>();
        overView10.add("ব্যাকরণ");
        overView10.add("শব্দার্থ");
        overView10.add("লিসেনিং");
        overView10.add("কানজি");
        listDataChild.put(listDataHeader.get(9),overView10);


        listDataHeader.add("পাঠ - ১১");
        List<String> overView11 = new ArrayList<>();
        overView11.add("ব্যাকরণ");
        overView11.add("শব্দার্থ");
        overView11.add("লিসেনিং");
        overView11.add("কানজি");
        listDataChild.put(listDataHeader.get(10),overView11);


        listDataHeader.add("পাঠ - ১২");
        List<String> overView12 = new ArrayList<>();
        overView12.add("ব্যাকরণ");
        overView12.add("শব্দার্থ");
        overView12.add("লিসেনিং");
        overView12.add("কানজি");
        listDataChild.put(listDataHeader.get(11),overView12);


        listDataHeader.add("পাঠ - ১৩");
        List<String> overView13 = new ArrayList<>();
        overView13.add("ব্যাকরণ");
        overView13.add("শব্দার্থ");
        overView13.add("লিসেনিং");
        overView13.add("কানজি");
        listDataChild.put(listDataHeader.get(12),overView13);

        listDataHeader.add("পাঠ - ১৪");
        List<String> overView14= new ArrayList<>();
        overView14.add("ব্যাকরণ");
        overView14.add("শব্দার্থ");
        overView14.add("লিসেনিং");
        overView14.add("কানজি");
        listDataChild.put(listDataHeader.get(13),overView14);

        listDataHeader.add("পাঠ - ১৫");
        List<String> overView15 = new ArrayList<>();
        overView15.add("ব্যাকরণ");
        overView15.add("শব্দার্থ");
        overView15.add("লিসেনিং");
        overView15.add("কানজি");
        listDataChild.put(listDataHeader.get(14),overView15);


        listDataHeader.add("পাঠ - ১৬");
        List<String> overView16 = new ArrayList<>();
        overView16.add("ব্যাকরণ");
        overView16.add("শব্দার্থ");
        overView16.add("লিসেনিং");
        overView16.add("কানজি");
        listDataChild.put(listDataHeader.get(15),overView16);


        listDataHeader.add("পাঠ - ১৭");
        List<String> overView17 = new ArrayList<>();
        overView17.add("ব্যাকরণ");
        overView17.add("শব্দার্থ");
        overView17.add("লিসেনিং");
        overView17.add("কানজি");
        listDataChild.put(listDataHeader.get(16),overView17);


        listDataHeader.add("পাঠ - ১৮");
        List<String> overView18 = new ArrayList<>();
        overView18.add("ব্যাকরণ");
        overView18.add("শব্দার্থ");
        overView18.add("লিসেনিং");
        overView18.add("কানজি");
        listDataChild.put(listDataHeader.get(17),overView18);


        listDataHeader.add("পাঠ - ১৯");
        List<String> overView19 = new ArrayList<>();
        overView19.add("ব্যাকরণ");
        overView19.add("শব্দার্থ");
        overView19.add("লিসেনিং");
        overView19.add("কানজি");
        listDataChild.put(listDataHeader.get(18),overView19);


        listDataHeader.add("পাঠ - ২০");
        List<String> overView20 = new ArrayList<>();
        overView20.add("ব্যাকরণ");
        overView20.add("শব্দার্থ");
        overView20.add("লিসেনিং");
        overView20.add("কানজি");
        listDataChild.put(listDataHeader.get(19),overView20);


        listDataHeader.add("পাঠ - ২১");
        List<String> overView21 = new ArrayList<>();
        overView21.add("ব্যাকরণ");
        overView21.add("শব্দার্থ");
        overView21.add("লিসেনিং");
        overView21.add("কানজি");
        listDataChild.put(listDataHeader.get(20),overView21);


        listDataHeader.add("পাঠ - ২২");
        List<String> overView22 = new ArrayList<>();
        overView22.add("ব্যাকরণ");
        overView22.add("শব্দার্থ");
        overView22.add("লিসেনিং");
        overView22.add("কানজি");
        listDataChild.put(listDataHeader.get(21),overView22);


        listDataHeader.add("পাঠ - ২৩");
        List<String> overView23 = new ArrayList<>();
        overView23.add("ব্যাকরণ");
        overView23.add("শব্দার্থ");
        overView23.add("লিসেনিং");
        overView23.add("কানজি");
        listDataChild.put(listDataHeader.get(22),overView23);


        listDataHeader.add("পাঠ - ২৪");
        List<String> overView24 = new ArrayList<>();
        overView24.add("ব্যাকরণ");
        overView24.add("শব্দার্থ");
        overView24.add("লিসেনিং");
        overView24.add("কানজি");
        listDataChild.put(listDataHeader.get(23),overView24);


        listDataHeader.add("পাঠ - ২৫");
        List<String> overView25 = new ArrayList<>();
        overView25.add("ব্যাকরণ");
        overView25.add("শব্দার্থ");
        overView25.add("লিসেনিং");
        overView25.add("কানজি");
        listDataChild.put(listDataHeader.get(24),overView25);










    }
}
