package com.example.recyclerviewtutorial;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class MyContactAdapter extends RecyclerView.Adapter<MyContactAdapter.ViewHolder> {
     ArrayList<modal>arrayList;
    Context context;
    MyContactAdapter (Context context , ArrayList<modal> arrayList){
        this.context=context;
        this.arrayList=arrayList;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view =  LayoutInflater.from(context).inflate(R.layout.contact_row , parent ,false);
       ViewHolder viewHolder=new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.imgage.setImageResource(arrayList.get(position).img);
        holder.numbers.setText(arrayList.get(position).number);
        holder.name.setText(arrayList.get(position).name);

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView numbers,name;
        ImageView imgage;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name=itemView.findViewById(R.id.tvname);
            numbers =itemView.findViewById(R.id.tvnumber);
            imgage =itemView.findViewById(R.id.imgage);
        }
    }
}
