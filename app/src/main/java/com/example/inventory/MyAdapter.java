package com.example.inventory;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class MyAdapter {

    private static final String TAG = "MyAdapter";

    public class ViewHolder extends RecyclerView.ViewHolder {

         TextView producto;
         TextView cantidad;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
