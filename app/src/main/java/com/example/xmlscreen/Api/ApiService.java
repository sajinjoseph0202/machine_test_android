package com.example.xmlscreen.Api;

import com.example.xmlscreen.Model.AnalyticsModel.AnalyticsModel;
import com.example.xmlscreen.Model.SignInModel;
import com.example.xmlscreen.Model.TrendingModel.TrendingModel;
import com.example.xmlscreen.Model.VerifyModel.VerifyModel;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface ApiService {
    @FormUrlEncoded
    @POST("auth/generate-otp")
    Call<SignInModel> generateOTP(@Field("phone") String phoneNumber);

    @GET("product-orders/analytics")
    Call<AnalyticsModel> getAnalytics(@Header("Authorization") String token);

    @GET("products/trending")
    Call<TrendingModel> getTrending(@Header("Authorization") String token);
    @FormUrlEncoded
    @POST("auth/verify-otp")
    Call<VerifyModel> verifyOTP(@Field("phone") String phoneNumber, @Field("otp") String otp);
}

