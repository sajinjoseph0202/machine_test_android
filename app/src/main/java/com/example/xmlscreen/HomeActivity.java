package com.example.xmlscreen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.example.xmlscreen.Adapter.RecyclerSecondAdapter;
import com.example.xmlscreen.Adapter.RecyclerViewAdapter;
import com.example.xmlscreen.Model.AnalyticsModel.AnalyticsData;
import com.example.xmlscreen.Model.AnalyticsModel.AnalyticsModel;
import com.example.xmlscreen.Api.ApiService;
import com.example.xmlscreen.Api.RetrofitClient;
import com.example.xmlscreen.Model.TrendingModel.TrendingData;
import com.example.xmlscreen.Model.TrendingModel.TrendingModel;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HomeActivity extends AppCompatActivity {

    private RecyclerView recyclerView, r3;
    private AnalyticsData dataList;

    private ArrayList<TrendingData> dataList1;

    String accessToken;

    String name;

    TextView nameTxt;
    private RecyclerViewAdapter adapter;
    private RecyclerSecondAdapter adapter2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        accessToken = getIntent().getStringExtra("access");
        name = getIntent().getStringExtra("name");
        recyclerView = findViewById(R.id.recyclerView);
        nameTxt = findViewById(R.id.name);
        nameTxt.setText(name);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(layoutManager);
        r3 = findViewById(R.id.r3);
        GridLayoutManager layoutMager = new GridLayoutManager(this, 2);
        r3.setLayoutManager(layoutMager);
        loadAnalytics(accessToken);
        loadTrending(accessToken);

    }

    private void loadTrending(String accessToken) {
        ApiService apiService = RetrofitClient.getClient().create(ApiService.class);

        Call<TrendingModel> call2 = apiService.getTrending("Bearer "+accessToken);
        call2.enqueue(new Callback<TrendingModel>() {
            @Override
            public void onResponse(Call<TrendingModel> call, Response<TrendingModel> response) {
                if (response.isSuccessful()) {
                    TrendingModel responseString = response.body();
                    if(responseString.getStatus()){
                        dataList1 = responseString.getData();
                        adapter2 = new RecyclerSecondAdapter(dataList1);
                        r3.setAdapter(adapter2);
                    }
                } else {
                    Toast.makeText(
                            HomeActivity.this, "Error", Toast.LENGTH_SHORT).show();
                }
            }
            @Override
            public void onFailure(Call<TrendingModel> call, Throwable t) {
                Toast.makeText(HomeActivity.this, "Error", Toast.LENGTH_SHORT).show();
            }
        });
    }

    void loadAnalytics(String accessToken){
        ApiService apiService = RetrofitClient.getClient().create(ApiService.class);
        Call<AnalyticsModel> call = apiService.getAnalytics("Bearer "+accessToken);
        call.enqueue(new Callback<AnalyticsModel>() {
            @Override
            public void onResponse(Call<AnalyticsModel> call, Response<AnalyticsModel> response) {
                if (response.isSuccessful()) {
                    AnalyticsModel responseString = response.body();
                    if(responseString.getStatus()){
                        dataList = responseString.getData();
                        adapter = new RecyclerViewAdapter(dataList);
                        recyclerView.setAdapter(adapter);
                    }
                } else {
                    Toast.makeText(
                            HomeActivity.this, "Error", Toast.LENGTH_SHORT).show();
                }
            }
            @Override
            public void onFailure(Call<AnalyticsModel> call, Throwable t) {
                Toast.makeText(HomeActivity.this, "Error", Toast.LENGTH_SHORT).show();
            }
        });
    }
}