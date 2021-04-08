package com.sujina.jinasmarthome;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    Context context;
    int[] imagesData;
    String[] sData;
    public MyAdapter(Context ct, String[] s, int[] images){
        context = ct;
        sData = s;
        imagesData = images;

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.recy_v_item_home,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.text.setText(sData[position]);
        holder.image.setImageResource(imagesData[position]);

    }

    @Override
    public int getItemCount() {
        return imagesData.length;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView text;
        ImageView image;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            text = itemView.findViewById(R.id.txt_recy_home);
            image = itemView.findViewById(R.id.img_recy_home);
        }
    }
}
