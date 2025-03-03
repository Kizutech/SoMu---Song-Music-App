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

public class JVKEPlaylist extends AppCompatActivity {
    ListView listView;
    String[] songs = {"Upside Down","golden hour","i'm not okay","this is what autumn feels like","this is what falling in love feels like","this is what heartbreak feels like","this is what losing someone feels like","this is what sadness feels like","this is what space feels like","this is what winter feels like"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_jvkeplaylist);

        listView = findViewById(R.id.playlist_listview11);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, songs);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener((parent, view, position, id) -> {
            Intent intent = new Intent(getApplicationContext(), MusicPlayer11.class);
            intent.putExtra("name11", songs[position]);
            startActivity(intent);
        });

    }
}