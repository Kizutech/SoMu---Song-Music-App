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
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class UnknownBrainPlaylist extends AppCompatActivity {
    ListView listView;
    String[] songs = {"Begin Again","Control","DEAD","Dancing On The Moon","Don't Go","I'm Sorry Mom","Jungle of Love","Phenomenon","Rooftop","War Game"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_unknown_brain_playlist);

        listView = findViewById(R.id.playlist_listview8);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, songs);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener((parent, view, position, id) -> {
            Intent intent = new Intent(getApplicationContext(), MusicPlayer8.class);
            intent.putExtra("name8", songs[position]);
            startActivity(intent);
        });

    }
}