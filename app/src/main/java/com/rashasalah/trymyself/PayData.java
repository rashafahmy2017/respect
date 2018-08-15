package com.rashasalah.trymyself;

import android.os.Parcel;
import android.os.Parcelable;

public class PayData implements Parcelable {
    private String pay_1 = "";
    private String pay_2 = "";
    private String pay_3 = "";
    private String pay_4 = "";
    private String pay_type = "";

    public PayData() {
    }

    public PayData(String pay_1,String pay_2,String pay_3 , String pay_4,  String pay_type) {
        this.pay_1 = pay_1;
        this.pay_2 = pay_2;
        this.pay_3 = pay_3;
        this.pay_4 = pay_4;
        this.pay_type=pay_type;
    }


    protected PayData(Parcel in) {
        pay_1 = in.readString();
        pay_2 = in.readString();
        pay_3 = in.readString();
        pay_4 = in.readString();
        pay_type = in.readString();
    }

    public static final Creator<UserData> CREATOR = new Creator<UserData>() {
        @Override
        public UserData createFromParcel(Parcel in) {
            return new UserData(in);
        }

        @Override
        public UserData[] newArray(int size) {
            return new UserData[size];
        }
    };


    public void setPay_1(String pay_1) {
        this.pay_1 = pay_1;
    }

    public String getPay_1() {
        return pay_1;
    }
    public void setPay_2(String title) {
        this.pay_2 = pay_2;
    }

    public String getPay_2() {
        return pay_2;
    }

    public String getPay_3() {
        return pay_3;
    }
    public void setPay_3(String pay_3) {
        this.pay_3 = pay_3;
    }
    public void setPay_4(String pay_4) {
        this.pay_4 = pay_4;
    }
    public String getPay_4() {
        return pay_4;
    }
    public void getPayType(String pay_type) {
        this.pay_type = pay_type;
    }
    public String getPay_type() {
        return pay_type;
    }




    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(pay_1);
        parcel.writeString(pay_2);
        parcel.writeString(pay_3);
        parcel.writeString(pay_4);
        parcel.writeString(pay_type);
    }


}
