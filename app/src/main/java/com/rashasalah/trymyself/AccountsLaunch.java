package com.rashasalah.trymyself;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class AccountsLaunch extends Fragment {


    View view;
    TextView  txt;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
// Inflate the layout for this fragment

        view = inflater.inflate(R.layout.accounts_activity, container, false);
        txt = (TextView) view.findViewById(R.id.text);


// perform setOnClickListener on first Button
        return view;
    }
}
