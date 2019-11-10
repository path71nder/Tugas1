package com.example.tugas1.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tugas1.R;
import com.example.tugas1.models.musicPlayer;

import java.util.List;

public class MusicAdapter extends RecyclerView.Adapter<MusicAdapter.MyViewHolder> {
    List<musicPlayer> musicPlayerList;

    public MusicAdapter(List<musicPlayer> musicPlayerList) {
        this.musicPlayerList = musicPlayerList;
    }

    @NonNull
    @Override
    public MusicAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View musicView = layoutInflater.inflate(R.layout.item_music_player,parent,false);
        MyViewHolder viewHolder = new MyViewHolder(musicView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MusicAdapter.MyViewHolder holder, int position) {
        musicPlayer music = musicPlayerList.get(position);
        holder.musicName.setText(music.getMusicName());
    }

    @Override
    public int getItemCount() {
        return (musicPlayerList != null) ? musicPlayerList.size() : 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView musicName;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            musicName = itemView.findViewById(R.id.musicView);
        }
    }
}
