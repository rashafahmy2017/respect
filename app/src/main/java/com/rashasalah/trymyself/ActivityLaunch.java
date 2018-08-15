package com.rashasalah.trymyself;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ActivityLaunch extends Fragment {


    View view;
    TextView text ;
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
// Inflate the layout for this fragment

        view = inflater.inflate(R.layout.grid_launch, container, false);
        ArrayList<ActivitesData> myDatas= new ArrayList<>();

        ActivitesData myData;
        for (int i = 0; i <5 ; i++) {
            myData= new ActivitesData("title"+i,"poster"+i,"date "+i,"",""+i," "+(i+2));
            myDatas.add(myData);
        }

        ActivitiesAdapter activitesDataAdapter= new ActivitiesAdapter();
        activitesDataAdapter.adapter(myDatas);
        ((ListView)view.findViewById(R.id.online_list)).setAdapter(activitesDataAdapter);
        ((ListView)view.findViewById(R.id.offline_list )).setAdapter(activitesDataAdapter);


        return view;
    }
}