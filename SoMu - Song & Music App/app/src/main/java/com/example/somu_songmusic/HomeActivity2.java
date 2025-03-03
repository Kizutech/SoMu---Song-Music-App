package com.example.somu_songmusic;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity2 extends AppCompatActivity {

    //Artist Playlist
    ImageButton Artist13;
    ImageButton Artist14;
    ImageButton Artist15;

    //Alert Dialog
    AlertDialog.Builder builder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home2);

        //Button
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity2.this, HomeActivity.class);
                startActivity(intent);
            }

        });

        //Playlist

        //Imagine Dragons Playlist nxt page
        Artist13 = findViewById(R.id.imageButton);
        builder = new AlertDialog.Builder(this);

        Artist13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Alert Dialog
                builder.setTitle("")
                        .setMessage("Do you want to proceed")
                        .setCancelable(true)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                finish();
                            }
                        })

                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.cancel();
                            }
                        })
                        .show();

                //Page
                Intent intent = new Intent(HomeActivity2.this, ImagineDragonPlaylist.class);
                startActivity(intent);
            }
        });

        //Maroon 5 Playlist nxt page
        Artist14 = findViewById(R.id.imageButton16);
        builder = new AlertDialog.Builder(this);

        Artist14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Alert Dialog
                builder.setTitle("")
                        .setMessage("Do you want to proceed")
                        .setCancelable(true)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                finish();
                            }
                        })

                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.cancel();
                            }
                        })
                        .show();

                //Page
                Intent intent = new Intent(HomeActivity2.this, MaroonFive.class);
                startActivity(intent);
            }
        });

        //One Direction Playlist nxt page
        Artist15 = findViewById(R.id.imageButton17);
        builder = new AlertDialog.Builder(this);

        Artist15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Alert Dialog
                builder.setTitle("")
                        .setMessage("Do you want to proceed")
                        .setCancelable(true)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                finish();
                            }
                        })

                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.cancel();
                            }
                        })
                        .show();

                //Page
                Intent intent = new Intent(HomeActivity2.this, OneDirection.class);
                startActivity(intent);
            }
        });

    }
}