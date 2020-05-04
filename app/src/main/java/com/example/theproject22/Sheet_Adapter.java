package com.example.theproject22;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Sheet_Adapter extends RecyclerView.Adapter <Sheet_Adapter.ViewHolder> {
    ArrayList<byte[]>pitures;
    Recycle_listner listner;

    public Sheet_Adapter(ArrayList<byte[]> pitures, Recycle_listner listner) {
        this.pitures = pitures;
        this.listner = listner;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }

    }
