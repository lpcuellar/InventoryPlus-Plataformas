package com.example.inventory;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private static final String TAG = "MyAdapter";
    private ArrayList<String> Products = new ArrayList<>();
    private ArrayList<Integer> Quantity = new ArrayList<>();
    private Context context;

    public MyAdapter(ArrayList<String> products, ArrayList<Integer> quantity, Context context) {
        Products = products;
        Quantity = quantity;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.productos, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        Log.d(TAG, "onBindViewHolder: called.");

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        RelativeLayout parentLayout;
        CardView formato;
        TextView producto;
        TextView cantidad;
        Button add;
        Button sustract;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            parentLayout = itemView.findViewById(R.id.parent_layout);
            formato = itemView.findViewById(R.id.formato);
            producto = itemView.findViewById(R.id.producto);
            cantidad = itemView.findViewById(R.id.cantidad);
            add = itemView.findViewById(R.id.sumar);
            sustract = itemView.findViewById(R.id.restar);

        }
    }
}
