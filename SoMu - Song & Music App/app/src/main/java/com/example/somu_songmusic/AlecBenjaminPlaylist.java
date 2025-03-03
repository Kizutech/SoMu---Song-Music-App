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

public class AlecBenjaminPlaylist extends AppCompatActivity {
    ListView listView;
    String[] songs = {"Boy In The Bubble","Devil Doesn't Bargain","I Built a Friend","If I Killed Someone For You","If We Have Each Other","Let Me Down Slowly","Mind Is A Prison","Must Have Been The Wind","The Way You Felt","Water Fountain"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_alec_benjamin_playlist);

        listView = findViewById(R.id.playlist_listview10);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, songs);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener((parent, view, position, id) -> {
            Intent intent = new Intent(getApplicationContext(), MusicPlayer10.class);
            intent.putExtra("name10", songs[position]);
            startActivity(intent);
        });

    }
}