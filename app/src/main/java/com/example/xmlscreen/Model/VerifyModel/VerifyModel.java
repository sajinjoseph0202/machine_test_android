package com.example.xmlscreen.Model.VerifyModel;

public class VerifyModel {
    private boolean status;
    private String message;
    private VerifyData data;

    public boolean getStatus() { return status; }
    public void setStatus(boolean value) { this.status = value; }

    public String getMessage() { return message; }
    public void setMessage(String value) { this.message = value; }

    public VerifyData getData() { return data; }
    public void setData(VerifyData value) { this.data = value; }
}
