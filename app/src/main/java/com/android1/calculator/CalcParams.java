package com.android1.calculator;

import android.os.Parcel;
import android.os.Parcelable;

public class CalcParams implements Parcelable {

    private Double firstArg;
    private Double secondArg;
    private String operation;

    public CalcParams() {
        firstArg = 0.0;
        secondArg = 0.0;
        operation = "";
    }

    public CalcParams(Double firstArg, Double secondArg, String operation) {
        this.firstArg = firstArg;
        this.secondArg = secondArg;
        this.operation = operation;
    }

    protected CalcParams(Parcel in) {
//        if (in.readByte() == 0) {
//            firstArg = null;
//        } else {
//            firstArg = in.readDouble();
//        }
//        if (in.readByte() == 0) {
//            secondArg = null;
//        } else {
//            secondArg = in.readDouble();
//        }
        firstArg = in.readDouble();
        secondArg = in.readDouble();
        operation = in.readString();
    }

    public static final Creator<CalcParams> CREATOR = new Creator<CalcParams>() {
        @Override
        public CalcParams createFromParcel(Parcel in) {
            return new CalcParams(in);
        }

        @Override
        public CalcParams[] newArray(int size) {
            return new CalcParams[size];
        }
    };

    public Double getFirstArg() {
        return firstArg;
    }

    public void setFirstArg(Double firstArg) {
        this.firstArg = firstArg;
    }

    public Double getSecondArg() {
        return secondArg;
    }

    public void setSecondArg(Double secondArg) {
        this.secondArg = secondArg;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        if (firstArg == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeDouble(firstArg);
        }
        if (secondArg == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeDouble(secondArg);
        }
        parcel.writeString(operation);
    }
}
