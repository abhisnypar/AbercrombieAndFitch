package com.example.saiabhinaypidugu.af.retrofitService;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.saiabhinaypidugu.af.R;

import java.util.ArrayList;

/**
 * Created by saiabhinaypidugu on 1/24/18.
 */

public class CustomRecylerAdapter extends RecyclerView.Adapter<CustomRecylerAdapter.ViewHolder> {

    private ArrayList<ViewModel> viewModels;

    public CustomRecylerAdapter(ArrayList<ViewModel> viewModels) {
        this.viewModels = viewModels;

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_main, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return viewModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(View itemView) {
            super(itemView);
        }
    }
}
