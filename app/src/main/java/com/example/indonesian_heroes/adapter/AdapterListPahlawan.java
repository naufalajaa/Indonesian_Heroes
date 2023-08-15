package com.example.indonesian_heroes.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.indonesian_heroes.DaftarPahlawanItem;
import com.example.indonesian_heroes.DetailActivityPahlawan;
import com.example.indonesian_heroes.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class AdapterListPahlawan extends RecyclerView.Adapter<AdapterListPahlawan.ViewHolder> {



    Context context;
    List<DaftarPahlawanItem> items;

    public AdapterListPahlawan (Context context, List<DaftarPahlawanItem> items) {
        this.context = context;
        this.items = items;
    }

    public void setItems(List<DaftarPahlawanItem> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_nama_pahlawan,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.tvNamaPahlawan.setText(items.get(position).getNama());

        Picasso.with(context)
                .load(items.get(position).getImg())
                .resize(200,200)
                .into(holder.imagePahlawan);

        holder.tvNama2.setText(items.get(position).getNama2());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(context, DetailActivityPahlawan.class);
                Bundle mBundle=new Bundle();
                mBundle.putString("kategori",items.get(position).getKategori());
                mBundle.putString("image",items.get(position).getImg());
                mBundle.putString("asal",items.get(position).getAsal());
                mBundle.putString("usia",items.get(position).getUsia());
                mBundle.putString("lahir",items.get(position).getLahir());
                mBundle.putString("wafat",items.get(position).getGugur());
                mBundle.putString("makam",items.get(position).getLokasimakam());
                mBundle.putString("riwayat",items.get(position).getHistory());

                intent.putExtras(mBundle);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView imagePahlawan;
        TextView tvNamaPahlawan;
        TextView tvNama2;
        View itemView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imagePahlawan=itemView.findViewById(R.id.imagePahlawan);
            tvNamaPahlawan=itemView.findViewById(R.id.tvNamaPahlawan);
            tvNama2=itemView.findViewById(R.id.tvNama2);

            this.itemView=itemView;
        }
    }
}

