package com.example.xmlscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.xmlscreen.Api.ApiService;
import com.example.xmlscreen.Api.RetrofitClient;
import com.example.xmlscreen.Model.SignInModel;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SignInActivity extends AppCompatActivity {
    Button btn;
    EditText phone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        phone = findViewById(R.id.phoneSignin);
        phone.setText("+919048514599");
        ApiService apiService = RetrofitClient.getClient().create(ApiService.class);
        btn = findViewById(R.id.reqOtp);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Call<SignInModel> call = apiService.generateOTP(phone.getText().toString());
                call.enqueue(new Callback<SignInModel>() {
                    @Override
                    public void onResponse(Call<SignInModel> call, Response<SignInModel> response) {
                        if (response.isSuccessful()) {
                            SignInModel responseString = response.body();
                            if(responseString.getStatus()){
                                Intent intent = new Intent(SignInActivity.this, OtpActivity.class);
                                intent.putExtra("phone",phone.getText().toString());
                                startActivity(intent);
                            }
                        } else {
                            Toast.makeText(
                                    SignInActivity.this, "Error", Toast.LENGTH_SHORT).show();
                        }
                    }
                    @Override
                    public void onFailure(Call<SignInModel> call, Throwable t) {
                        Toast.makeText(SignInActivity.this, "Error", Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });
    }
}
