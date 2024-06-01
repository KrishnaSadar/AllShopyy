package com.example.allshoppy.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.allshoppy.R;
import com.example.allshoppy.activitys.websiteActivity;
import com.example.allshoppy.databinding.ItemProductBinding;
import com.example.allshoppy.model.BigIcon;

import java.util.ArrayList;

public class BigIconAdapter extends RecyclerView.Adapter<BigIconAdapter.BigIconViewHolder> {

    private Context context;
    private ArrayList<BigIcon> products;

    public BigIconAdapter(Context context, ArrayList<BigIcon> products) {
        this.context = context;
        this.products = products;
    }

    @NonNull
    @Override
    public BigIconViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        ItemProductBinding binding = ItemProductBinding.inflate(layoutInflater, parent, false);
        return new BigIconViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull BigIconViewHolder holder, int position) {
        BigIcon product = products.get(position);
        holder.binding.label.setText(product.getName());

        // Load image using Glide
        Glide.with(context)
                .load(product.getImage())
                .placeholder(R.drawable.placeholder) // Placeholder image while loading
                .into(holder.binding.image);

        // Handle item click
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start WebView activity with intent extras
                Intent intent = new Intent(context, websiteActivity.class);
                intent.putExtra("url", product.getUrl());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return products.size();
    }

    public static class BigIconViewHolder extends RecyclerView.ViewHolder {
        ItemProductBinding binding;

        public BigIconViewHolder(@NonNull ItemProductBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
