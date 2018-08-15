package com.rashasalah.trymyself;

import android.os.Parcel;
import android.os.Parcelable;

public class UserData implements Parcelable {
    private String name = "";
    private String ticket_num = "";
    private String phone_num = "";
    private String email_addreaa = "";
    private String sar_data = "";

    public UserData() {
    }

    public UserData( String name,String ticket_num, String phone_num ,String email_addreaa, String sar_data) {
        this.email_addreaa = email_addreaa;
        this.ticket_num = ticket_num;
        this.phone_num = phone_num;
        this.name = name;
        this.sar_data=sar_data;
    }


    protected UserData(Parcel in) {
        name = in.readString();
        ticket_num = in.readString();
        phone_num = in.readString();
        email_addreaa = in.readString();
        sar_data = in.readString();
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


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void set_email_addreaa(String title) {
        this.email_addreaa = email_addreaa;
    }

    public String get_email_addreaa() {
        return email_addreaa;
    }

    public String get_phone_num() {
        return phone_num;
    }
    public void set_phone_num(String phone_num) {
        this.phone_num = phone_num;
    }
    public void set_sar_data(String paid_date) {
        this.sar_data = sar_data;
    }
    public String get_Sar_data() {
        return sar_data;
    }
    public void set_ticket_num(String ticket_num) {
        this.ticket_num = ticket_num;
    }
    public String get_ticket_num() {
        return ticket_num;
    }




    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeString(ticket_num);
        parcel.writeString(phone_num);
        parcel.writeString(email_addreaa);
        parcel.writeString(sar_data);
    }


}

