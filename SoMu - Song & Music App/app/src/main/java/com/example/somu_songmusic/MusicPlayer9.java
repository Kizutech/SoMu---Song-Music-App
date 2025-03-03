package com.example.somu_songmusic;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MusicPlayer9 extends AppCompatActivity {
    TextView songNameTextView;
    private SeekBar seekBar;
    private ImageButton playButton, nextButton, prevButton;
    private MediaPlayer mediaPlayer;
    private TextView timerTextView;
    private Handler handler;
    private int currentSongIndex = 0;
    private String[] songTitles = {"Again","Dancing With Me/ Sing To You","Hesitations","I'm Not So Perfect","Losing Interest","Novacaine","So Innocent","So Long","so low","youre mine"};
    private int[] songResources = {R.raw.again1, R.raw.dancewithmeandyou, R.raw.hesitations, R.raw.imnotsoperfect, R.raw.losinginterest, R.raw.novacaine, R.raw.soinoccent, R.raw.solong, R.raw.solow, R.raw.youremine};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_music_player9);

        //Music Player id
        songNameTextView = findViewById(R.id.textview109);
        playButton = findViewById(R.id.play_button9);
        nextButton = findViewById(R.id.next_button9);
        prevButton = findViewById(R.id.previous_button9);
        seekBar = findViewById(R.id.seek_bar9);
        timerTextView = findViewById(R.id.timerTextView9);

        //Music Player 10 Songs From Playlist
        Intent intent = getIntent();
        String songTitle = intent.getStringExtra("name9");

        for (int i = 0; i < songTitles.length; i++) {
            if (songTitle.equals(songTitles[i])) {
                currentSongIndex = i;
                break;
            }
        }

        songNameTextView.setText(songTitle);
        mediaPlayer = MediaPlayer.create(this, songResources[currentSongIndex]);

        //Next Button & Previous Button
        prevButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                previousSong();
            }
        });

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nextSong();
            }
        });

        //SeekBar & Handler
        seekBar.setMax(mediaPlayer.getDuration());

        handler = new Handler();

        //Play And Pause Button
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mediaPlayer.isPlaying()) {
                    mediaPlayer.pause();
                    playButton.setImageResource(android.R.drawable.ic_media_play);
                } else {
                    mediaPlayer.start();
                    playButton.setImageResource(android.R.drawable.ic_media_pause);
                }
            }
        });

        //SeekBar Progress
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                if (fromUser) {
                    mediaPlayer.seekTo(progress);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        updateSeekBar();
    }

    private void previousSong() {
        if (currentSongIndex > 0) {
            currentSongIndex--;
            mediaPlayer.stop();
            mediaPlayer.release();
            mediaPlayer = MediaPlayer.create(this, songResources[currentSongIndex]);
            mediaPlayer.start();
            songNameTextView.setText(songTitles[currentSongIndex]);
            seekBar.setMax(mediaPlayer.getDuration());
            updateSeekBar();
        }
    }

    private void nextSong() {
        if (currentSongIndex < songResources.length - 1) {
            currentSongIndex++;
            mediaPlayer.stop();
            mediaPlayer.release();
            mediaPlayer = MediaPlayer.create(this, songResources[currentSongIndex]);
            mediaPlayer.start();
            songNameTextView.setText(songTitles[currentSongIndex]);
            seekBar.setMax(mediaPlayer.getDuration());
            updateSeekBar();
        }
    }

    private void updateSeekBar() {
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                if (mediaPlayer.isPlaying()) {
                    int currentPosition = mediaPlayer.getCurrentPosition();
                    seekBar.setProgress(currentPosition);
                    timerTextView.setText(formatTime(currentPosition));
                    handler.postDelayed(this, 1000);
                }
            }
        }, 1000);
    }

    private String formatTime(int time) {
        int minutes = time / 60000;
        int seconds = (time % 60000) / 1000;
        return String.format("%02d:%02d", minutes, seconds);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mediaPlayer!= null) {
            mediaPlayer.release();
        }
    }
}