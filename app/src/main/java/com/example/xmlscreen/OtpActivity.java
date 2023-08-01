package com.example.xmlscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.xmlscreen.Api.ApiService;
import com.example.xmlscreen.Api.RetrofitClient;
import com.example.xmlscreen.Model.VerifyModel.VerifyData;
import com.example.xmlscreen.Model.VerifyModel.VerifyModel;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class OtpActivity extends AppCompatActivity {
    Button btn;

    TextView phoneNumber;
    EditText o1,o2,o3,o4;
    String phone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp);
        btn = findViewById(R.id.otp);
        o1 = findViewById(R.id.otp1);
        o2 = findViewById(R.id.otp2);
        o3 = findViewById(R.id.otp3);
        o4 = findViewById(R.id.otp4);
        phoneNumber = findViewById(R.id.phone);
        phone = getIntent().getStringExtra("phone");
        phoneNumber.setText(phone);

        o1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.length() == 1) {
                    o2.requestFocus();
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        o2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.length() == 1) {
                    o3.requestFocus();
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        o3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.length() == 1) {
                    o4.requestFocus();
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        ApiService apiService = RetrofitClient.getClient().create(ApiService.class);

        btn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String text1 = o1.getText().toString();
            String text2 = o2.getText().toString();
            String text3 = o3.getText().toString();
            String text4 = o4.getText().toString();
            String combinedText = text1 + text2 + text3 + text4;

            Call<VerifyModel> call = apiService.verifyOTP(phone,combinedText);

            call.enqueue(new Callback<VerifyModel>() {
                @Override
                public void onResponse(Call<VerifyModel> call, Response<VerifyModel> response) {

                    Log.d("Verify OTP",response.body().toString());
                    if (response.isSuccessful()) {
                        VerifyModel responseString = response.body();
                        Log.d("Verify OTP",responseString.getMessage());
                        if(responseString.getStatus()){
                            VerifyData token = responseString.getData();
                            Intent intent = new Intent(OtpActivity.this, HomeActivity.class);
                            intent.putExtra("access",token.getAccessToken());
                            intent.putExtra("name",token.getUser().getFirstName() +" "+token.getUser().getLastName());
                            startActivity(intent);
                        }
                    } else {
                        Toast.makeText(OtpActivity.this, "Error", Toast.LENGTH_SHORT).show();
                    }
                }
                @Override
                public void onFailure(Call<VerifyModel> call, Throwable t) {
                    Toast.makeText(OtpActivity.this, "Error", Toast.LENGTH_SHORT).show();
                    Log.d("Verify OTP",t.getMessage());
                }
            });
            }
        });
    }
}


