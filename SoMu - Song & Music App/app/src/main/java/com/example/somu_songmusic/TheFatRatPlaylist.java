package com.example.somu_songmusic;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class TheFatRatPlaylist extends AppCompatActivity {
    ListView listView;
    String[] songs = {"Close To The Sun","Fly Away","Jackpot","Monody","No No No","Rise Up","Stronger","The Calling","Time Lapse","Unity"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_the_fat_rat_playlist);

        listView = findViewById(R.id.playlist_listview7);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, songs);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener((parent, view, position, id) -> {
            Intent intent = new Intent(getApplicationContext(), MusicPlayer7.class);
            intent.putExtra("name7", songs[position]);
            startActivity(intent);
        });

    }
}