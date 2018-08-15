package com.rashasalah.trymyself;

import android.os.Parcel;
import android.os.Parcelable;

public class InboxData implements Parcelable {
    private String text = "";


    public InboxData() {
    }

    public InboxData(String text) {
        this.text = text;
    }
    protected InboxData(Parcel in) {
        text = in.readString();
    }

    public static final Creator<InboxData> CREATOR = new Creator<InboxData>() {
        @Override
        public InboxData createFromParcel(Parcel in) {
            return new InboxData(in);
        }

        @Override
        public InboxData[] newArray(int size) {
            return new InboxData[size];
        }
    };
    public void settext(String text) {
        this.text = text;
    }

    public String gettext() {
        return text;
    }
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(text);
    }
}
