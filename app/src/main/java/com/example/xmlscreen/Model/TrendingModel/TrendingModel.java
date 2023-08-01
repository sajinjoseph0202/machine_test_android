package com.example.xmlscreen.Model.TrendingModel;

import java.util.ArrayList;

public class TrendingModel {
    private boolean status;
    private String message;
    private ArrayList<TrendingData> data;

    public boolean getStatus() { return status; }
    public void setStatus(boolean value) { this.status = value; }

    public String getMessage() { return message; }
    public void setMessage(String value) { this.message = value; }

    public ArrayList<TrendingData> getData() { return data; }
    public void setData(ArrayList<TrendingData> value) { this.data = value; }
}
