package com.example.tugas1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.tugas1.models.musicPlayer;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvMusicPlayer;
    List<musicPlayer> listMusicPlayer = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvMusicPlayer = findViewById(R.id.rvMusicPlayer);
        musicPlayer musicPlayer = new musicPlayer("Divinity","main\\res\\mipmap-hdpi\\worlds.jpg");
        listMusicPlayer.add(musicPlayer);
        musicPlayer musicPlayer2 = new musicPlayer("Language", "main\\res\\mipmap-hdpi\\language.jpg");
        listMusicPlayer.add(musicPlayer2);
    }
}
