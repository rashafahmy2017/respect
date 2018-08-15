package com.rashasalah.trymyself;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class PayLaunch extends Fragment {


    View view;
    TextView pay_1 , mobile_num , email_address , pay_4 ,type ;
    PayData pay_data;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
// Inflate the layout for this fragment

        view = inflater.inflate(R.layout.payment_activity, container, false);
            pay_data= new PayData("330","120","650","1000","card");
      pay_1 = (TextView) view.findViewById(R.id.pay_1_1);
        pay_1.setText(pay_data.getPay_1());
        mobile_num = (TextView) view.findViewById(R.id.pay_2_2);
        mobile_num.setText(pay_data.getPay_2());
        email_address = (TextView) view.findViewById(R.id.pay_3_3);
        email_address.setText(pay_data.getPay_3());
         pay_4 = (TextView) view.findViewById(R.id.sum_total);
        pay_4.setText(pay_data.getPay_4());
        type = (TextView) view.findViewById(R.id.cash);
        type.setText(pay_data.getPay_type());

// perform setOnClickListener on first Button
        return view;
    }
}
