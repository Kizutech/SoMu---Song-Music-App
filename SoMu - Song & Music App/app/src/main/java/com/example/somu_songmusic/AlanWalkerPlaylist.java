package com.example.somu_songmusic;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class AlanWalkerPlaylist extends AppCompatActivity {
    ListView listView;
    String[] songs = {"All Falls Down", "Alone", "Darkside", "Faded", "Force", "Lily", "On My Way", "Sing Me To Sleep", "Sky", "The Spectre"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_alan_walker_playlist);

        listView = findViewById(R.id.playlist_listview);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, songs);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener((parent, view, position, id) -> {
            Intent intent = new Intent(getApplicationContext(), MusicPlayer.class);
            intent.putExtra("name", songs[position]);
            startActivity(intent);
        });

    }
}