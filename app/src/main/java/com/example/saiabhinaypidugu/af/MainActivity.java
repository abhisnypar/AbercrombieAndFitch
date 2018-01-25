package com.example.saiabhinaypidugu.af;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import com.example.saiabhinaypidugu.af.retrofitService.JsonResponse;
import com.example.saiabhinaypidugu.af.retrofitService.ProductAsynchronous;
import com.example.saiabhinaypidugu.af.retrofitService.RetrofitService;

import java.io.IOException;

import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        ProductAsynchronous productAsynchronous = new ProductAsynchronous(getApplicationContext());
        productAsynchronous.execute(BuildConfig.BASE_URL);
        super.onResume();
    }
}
