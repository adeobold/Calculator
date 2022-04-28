package com.android1.calculator;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.RequiresApi;

public class CalcParams implements Parcelable {

    private Boolean operationInProgress;
    private Boolean secondArgInput;
    private Double firstArg;
    private Double secondArg;
    private String operation;
    private String currentOutput;

    public CalcParams() {
        operationInProgress = false;
        secondArgInput = false;
        firstArg = 0.0;
        secondArg = 0.0;
        operation = "";
        currentOutput = "";
    }

    public CalcParams(Boolean operationInProgress, Boolean secondArgInput, Double firstArg, Double secondArg, String operation, String currentOutput) {
        this.operationInProgress = operationInProgress;
        this.secondArgInput = secondArgInput;
        this.firstArg = firstArg;
        this.secondArg = secondArg;
        this.operation = operation;
        this.currentOutput = currentOutput;
    }

    @RequiresApi(api = Build.VERSION_CODES.Q)
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
        operationInProgress = in.readBoolean();
        secondArgInput = in.readBoolean();
        firstArg = in.readDouble();
        secondArg = in.readDouble();
        operation = in.readString();
        currentOutput = in.readString();
    }

    public static final Creator<CalcParams> CREATOR = new Creator<CalcParams>() {
        @RequiresApi(api = Build.VERSION_CODES.Q)
        @Override
        public CalcParams createFromParcel(Parcel in) {
            return new CalcParams(in);
        }

        @Override
        public CalcParams[] newArray(int size) {
            return new CalcParams[size];
        }
    };

    public Boolean getOperationInProgress() {
        return operationInProgress;
    }

    public void setOperationInProgress(Boolean operationInProgress) {
        this.operationInProgress = operationInProgress;
    }

    public Boolean getSecondArgInput() {
        return secondArgInput;
    }

    public void setSecondArgInput(Boolean secondArgInput) {
        this.secondArgInput = secondArgInput;
    }

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

    public String getCurrentOutput() {
        return currentOutput;
    }

    public void setCurrentOutput(String currentOutput) {
        this.currentOutput = currentOutput;
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
