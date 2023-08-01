package com.example.xmlscreen.Model.AnalyticsModel;

public class AnalyticsModel {
    private boolean status;
    private String message;
    private AnalyticsData data;

    public boolean getStatus() { return status; }
    public void setStatus(boolean value) { this.status = value; }

    public String getMessage() { return message; }
    public void setMessage(String value) { this.message = value; }

    public AnalyticsData getData() { return data; }
    public void setData(AnalyticsData value) { this.data = value; }
}