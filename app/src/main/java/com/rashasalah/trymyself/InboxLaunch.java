package com.rashasalah.trymyself;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class InboxLaunch extends Fragment {


    View view;
    TextView text ;
    InboxData inboxData;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
// Inflate the layout for this fragment

        view = inflater.inflate(R.layout.inbox_activity, container, false);
        inboxData = new InboxData("No Messeges");
        text = (TextView) view.findViewById(R.id.inbox_text);
        text.setText(inboxData.gettext());


// perform setOnClickListener on first Button
        return view;
    }
}


