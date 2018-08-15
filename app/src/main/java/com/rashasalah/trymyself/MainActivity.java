package com.rashasalah.trymyself;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button firstFragment, secondFragment,thirdFragment, fourthFragment , fifthFragment;
    boolean flag =false ;
    View row;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstFragment = (Button) findViewById(R.id.firstFragment);
        secondFragment = (Button) findViewById(R.id.secondFragment);
        thirdFragment = (Button) findViewById(R.id.thirdFragment);
        fourthFragment = (Button) findViewById(R.id.fourthFragment);
        fifthFragment = (Button) findViewById(R.id.fifthFragment);

        if (flag){
     setContentView(R.layout.grid_item);
         ArrayList<ActivitesData> myDatas= new ArrayList<>();

        ActivitesData myData;
        for (int i = 0; i <5 ; i++) {
        myData= new ActivitesData("title"+i,"poster"+i,"date "+i,"",""+i," "+(i+2));
        myDatas.add(myData);
        }

            ActivitiesAdapter activitesDataAdapter= new ActivitiesAdapter(MainActivity.this);
        activitesDataAdapter.adapter(myDatas);
        ((ListView)findViewById(R.id.online_list)).setAdapter(activitesDataAdapter);
        ((ListView)findViewById(R.id.offline_list )).setAdapter(activitesDataAdapter);
        flag=false;
        }

        firstFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                loadFragment1(new UserLaunch3());

            }
        });
        secondFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                loadFragment2(new PayLaunch());

            }
        });
        thirdFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

              flag=true;
               loadFragment3(new ActivityLaunch());
//                setContentView(R.layout.grid_launch);
//                ArrayList<ActivitesData> myDatas= new ArrayList<>();
//      ActivitesData myData;
//                for (int i = 0; i <5 ; i++) {
//                    myData= new ActivitesData("title"+i,"pster"+i,"date "+i,"",""+i," "+(i+2));
//                    myDatas.add(myData);
//                }
//
//                ActivitiesAdapter gridAdapter= new ActivitiesAdapter(MainActivity.this);
//                gridAdapter.adapter(myDatas);
//                ((ListView)findViewById(R.id.online_list)).setAdapter(gridAdapter);
//                ((ListView)findViewById(R.id.offline_list )).setAdapter(gridAdapter);

            }
        });
        fourthFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                loadFragment4(new InboxLaunch());

            }
        });
        fifthFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                loadFragment5(new AccountsLaunch());

            }
        });


    }
    private void loadFragment5(AccountsLaunch fragment) {
// create a FragmentManager
        android.app.FragmentManager fm = getFragmentManager();
// create a FragmentTransaction to begin the transaction and replace the Fragment
        android.app.FragmentTransaction fragmentTransaction = fm.beginTransaction();
// replace the FrameLayout with new Fragment
        fragmentTransaction.replace(R.id.frameLayout, fragment);
        fragmentTransaction.commit(); // save the changes
    }
    private void loadFragment4(InboxLaunch fragment) {
// create a FragmentManager
        android.app.FragmentManager fm = getFragmentManager();
// create a FragmentTransaction to begin the transaction and replace the Fragment
        android.app.FragmentTransaction fragmentTransaction = fm.beginTransaction();
// replace the FrameLayout with new Fragment
        fragmentTransaction.replace(R.id.frameLayout, fragment);
        fragmentTransaction.commit(); // save the changes
    }
    private void loadFragment3(ActivityLaunch fragment) {
// create a FragmentManager
        android.app.FragmentManager fm = getFragmentManager();
// create a FragmentTransaction to begin the transaction and replace the Fragment
        android.app.FragmentTransaction fragmentTransaction = fm.beginTransaction();
// replace the FrameLayout with new Fragment
        fragmentTransaction.replace(R.id.frameLayout, fragment);
        fragmentTransaction.commit(); // save the changes
    }
    private void loadFragment2(PayLaunch fragment) {
// create a FragmentManager
        android.app.FragmentManager fm = getFragmentManager();
// create a FragmentTransaction to begin the transaction and replace the Fragment
        android.app.FragmentTransaction fragmentTransaction = fm.beginTransaction();
// replace the FrameLayout with new Fragment
        fragmentTransaction.replace(R.id.frameLayout, fragment);
        fragmentTransaction.commit(); // save the changes
    }


    private void loadFragment1(UserLaunch3 fragment) {
// create a FragmentManager
        android.app.FragmentManager fm = getFragmentManager();
// create a FragmentTransaction to begin the transaction and replace the Fragment
        android.app.FragmentTransaction fragmentTransaction = fm.beginTransaction();
// replace the FrameLayout with new Fragment
        fragmentTransaction.replace(R.id.frameLayout, fragment);
        fragmentTransaction.commit(); // save the changes
    }

}
