package com.example.xmlscreen.Model.VerifyModel;

import com.google.gson.annotations.SerializedName;

public class VerifyData {
    private VerifyUser user;
    @SerializedName("access_token")
    private String accessToken;
    @SerializedName("refresh_token")
    private String refreshToken;

    public VerifyUser getUser() { return user; }
    public void setUser(VerifyUser value) { this.user = value; }

    public String getAccessToken() { return accessToken; }
    public void setAccessToken(String value) { this.accessToken = value; }

    public String getRefreshToken() { return refreshToken; }
    public void setRefreshToken(String value) { this.refreshToken = value; }
}
