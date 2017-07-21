package com.followers.sept.feed;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends Activity{

    ListView list;

    String[] date ={
            "1 km away",
            "",
            "",
            "",
            "",
    };
    String[] bloodtype ={
            "Just now",
            "10 minutes ago",
            "6 hours ago",
            "23 hours ago",
            "1 day ago",
    };

    String[] desc ={
            "Million Volunteer Run.\nJoin the biggest run for humanity.",
            "World Blood Donor Day \nDo your part and help save lives through St. Luke’s Global City’s Blood Letting Program.",
            "Give Blood, Save Lives! Join MDH Bloodletting Activity today",
    };

    String[] itemname ={
            "Philippine Red Cross",
            "St. Luke's Hospital",
            "Manila Doctor's Hospital",
    };


    Integer[] pics= {
            R.drawable.prce,
            R.drawable.stlukee,
            R.drawable.mdhe,
    };

    Integer[] imgid={
            R.drawable.n3,
            R.drawable.n9,
            R.drawable.n7,




//            R.drawable.b,
//            R.drawable.c,
//            R.drawable.e,
//            R.drawable.f,
//            R.drawable.g,
//            R.drawable.h,
//            R.drawable.l,
//            R.drawable.i,
//            R.drawable.j,
//            R.drawable.o,
//            R.drawable.m,
//            R.drawable.n,
//            R.drawable.k,
//            R.drawable.p,
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adapter adapter=new adapter(this, itemname, imgid, bloodtype, date, pics, desc);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter((ListAdapter) adapter);

        list.setOnItemClickListener(new OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                // TODO Auto-generated method stub
                String Slecteditem= itemname[+position];
                Toast.makeText(getApplicationContext(), Slecteditem, Toast.LENGTH_SHORT).show();

            }
        });
    }
}