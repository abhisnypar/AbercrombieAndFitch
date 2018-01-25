package com.example.saiabhinaypidugu.af;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.saiabhinaypidugu.af.retrofitService.ProductAsynchronous;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recyler_view_layout);
        RecyclerView recyclerView = findViewById(R.id.recyler_view);
        ProductAsynchronous productAsynchronous = new ProductAsynchronous(getApplicationContext(), recyclerView);
        productAsynchronous.execute(BuildConfig.BASE_URL);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

    }

    @Override
    protected void onResume() {
        super.onResume();
    }
}
