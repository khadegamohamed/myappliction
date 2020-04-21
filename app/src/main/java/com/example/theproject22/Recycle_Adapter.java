package com.example.theproject22;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Objects;

public class Recycle_Adapter extends RecyclerView.Adapter <Recycle_Adapter.ViewHolder>{
    ArrayList<Name> lectures;
Recycle_listner listner;
Name name;
    public Recycle_Adapter(ArrayList<Name> lectures, Recycle_listner listner) {
        this.lectures = lectures;
        this.listner = listner;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v=LayoutInflater.from(parent.getContext() ).inflate(R.layout.layout,null,false);
        ViewHolder viewHolder=new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
         name=lectures.get(position);
         holder.lec_name.setText(name.getName());
    }

    @Override
    public int getItemCount() {
        return lectures.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView lec_name;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            lec_name=itemView.findViewById(R.id.lec_name_layout);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                listner.onRecyclerListner(name);


                }

            });
        }
    }
}
