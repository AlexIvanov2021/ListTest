package com.example.listtest;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class NameAdapter extends RecyclerView.Adapter<NameAdapter.NameAdapterViewHolder> {
 List<Name> lists;

    public NameAdapter(List<Name> lists) {
        this.lists = lists;
    }

    @NonNull
    @Override
    public NameAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        return new NameAdapterViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.name,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull NameAdapterViewHolder holder, int position) {
        Name name = lists.get(position);
        holder.textView.setText(name.getName());
    }

    @Override
    public int getItemCount() {

        return lists.size();
    }

    class   NameAdapterViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
     public NameAdapterViewHolder(@NonNull View itemView) {
         super(itemView);
         textView= itemView.findViewById(R.id.textViewName);




     }
 }
}

