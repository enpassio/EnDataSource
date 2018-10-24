package com.enpassio.endatasource.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Seller implements Parcelable {
    private int sellerId;
    private String sellerName;


    Seller(int id, String name){
        this.sellerId = id;
        this.sellerName = name;
    }

    private Seller(Parcel in) {
        sellerId = in.readInt();
        sellerName = in.readString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(sellerId);
        dest.writeString(sellerName);
    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<Seller> CREATOR = new Parcelable.Creator<Seller>() {
        @Override
        public Seller createFromParcel(Parcel in) {
            return new Seller(in);
        }

        @Override
        public Seller[] newArray(int size) {
            return new Seller[size];
        }
    };
}
