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

public class ShilohDynastyPlaylist extends AppCompatActivity {
    ListView listView;
    String[] songs = {"Again","Dancing With Me/ Sing To You","Hesitations","I'm Not So Perfect","Losing Interest","Novacaine","So Innocent","So Long","so low","youre mine"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_shiloh_dynasty_playlist);

        listView = findViewById(R.id.playlist_listview9);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, songs);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener((parent, view, position, id) -> {
            Intent intent = new Intent(getApplicationContext(), MusicPlayer9.class);
            intent.putExtra("name9", songs[position]);
            startActivity(intent);
        });
    }
}