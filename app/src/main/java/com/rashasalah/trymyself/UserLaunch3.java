package com.rashasalah.trymyself;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
public class UserLaunch3 extends Fragment {


    View view;
    TextView name , ticket_num , phone_num, email_address ,cash_sar;
    UserData user_data;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
// Inflate the layout for this fragment

      user_data= new UserData("Ahmed","333-444-512-615","+96 0102 814 57","ahmed@yahoo.com","470");
        view = inflater.inflate(R.layout.booking_activity, container, false);
        name = (TextView) view.findViewById(R.id.name);
        name.setText(user_data.getName());
        ticket_num = (TextView) view.findViewById(R.id.ticket_num);
        ticket_num.setText(user_data.get_ticket_num());
        phone_num = (TextView) view.findViewById(R.id.mobile_edit);
        phone_num.setText(user_data.get_phone_num());
        email_address = (TextView) view.findViewById(R.id.email_edit);
        email_address.setText(user_data.get_email_addreaa());
        cash_sar = (TextView) view.findViewById(R.id.sar_data);
        cash_sar.setText(user_data.get_Sar_data());

// perform setOnClickListener on first Button
        return view;
    }
}

