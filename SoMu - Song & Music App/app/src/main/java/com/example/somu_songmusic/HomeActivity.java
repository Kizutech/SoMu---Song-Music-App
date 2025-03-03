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

public class HomeActivity extends AppCompatActivity {

    //Artist Playlist
    ImageButton Artist1;
    ImageButton Artist2;
    ImageButton Artist3;
    ImageButton Artist4;
    ImageButton Artist5;
    ImageButton Artist6;
    ImageButton Artist7;
    ImageButton Artist8;
    ImageButton Artist9;
    ImageButton Artist10;
    ImageButton Artist11;
    ImageButton Artist12;

    //Alert Dialog
    AlertDialog.Builder builder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home);

        //Button
        Button button = (Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, HomeActivity2.class);
                startActivity(intent);
            }
        });

        //Playlist

        //Alan Walker Playlist nxt page
        Artist1 = findViewById(R.id.imageButton2);
        builder = new AlertDialog.Builder(this);

        Artist1.setOnClickListener(new View.OnClickListener() {
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
                Intent intent = new Intent(HomeActivity.this, AlanWalkerPlaylist.class);
                startActivity(intent);
            }
        });

        //Marshmello Playlist nxt page
        Artist2 = findViewById(R.id.imageButton3);
        builder = new AlertDialog.Builder(this);

        Artist2.setOnClickListener(new View.OnClickListener() {
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
                Intent intent = new Intent(HomeActivity.this, MarshmelloPlaylist.class);
                startActivity(intent);
            }
        });

        //BoyWithUke Playlist nxt page
        Artist3 = findViewById(R.id.imageButton4);
        builder = new AlertDialog.Builder(this);

        Artist3.setOnClickListener(new View.OnClickListener() {
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
                Intent intent = new Intent(HomeActivity.this, BowWithUkePlaylist.class);
                startActivity(intent);
            }
        });

        //1nonly Playlist nxt page
        Artist4 = findViewById(R.id.imageButton5);
        builder = new AlertDialog.Builder(this);

        Artist4.setOnClickListener(new View.OnClickListener() {
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
                Intent intent = new Intent(HomeActivity.this, oneNonlyPlaylist.class);
                startActivity(intent);
            }
        });

        //Brxkenbxy Playlist nxt page
        Artist5 = findViewById(R.id.imageButton6);
        builder = new AlertDialog.Builder(this);

        Artist5.setOnClickListener(new View.OnClickListener() {
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
                Intent intent = new Intent(HomeActivity.this, BrxkenbxyPlaylist.class);
                startActivity(intent);
            }
        });

        //Rarin Playlist nxt page
        Artist6 = findViewById(R.id.imageButton7);
        builder = new AlertDialog.Builder(this);

        Artist6.setOnClickListener(new View.OnClickListener() {
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
                Intent intent = new Intent(HomeActivity.this, RarinPlaylist.class);
                startActivity(intent);
            }
        });

        //NEFFEX Playlist nxt page
        Artist7 = findViewById(R.id.imageButton8);
        builder = new AlertDialog.Builder(this);

        Artist7.setOnClickListener(new View.OnClickListener() {
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
                Intent intent = new Intent(HomeActivity.this, NEFFEXPlaylist.class);
                startActivity(intent);
            }
        });

        //TheFatRat Playlist nxt page
        Artist8 = findViewById(R.id.imageButton9);
        builder = new AlertDialog.Builder(this);

        Artist8.setOnClickListener(new View.OnClickListener() {
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
                Intent intent = new Intent(HomeActivity.this, TheFatRatPlaylist.class);
                startActivity(intent);
            }
        });

        //Unknown Brain Playlist nxt page
        Artist9 = findViewById(R.id.imageButton10);
        builder = new AlertDialog.Builder(this);

        Artist9.setOnClickListener(new View.OnClickListener() {
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
                Intent intent = new Intent(HomeActivity.this, UnknownBrainPlaylist.class);
                startActivity(intent);
            }
        });

        //Shiloh Dynasty Playlist nxt page
        Artist10 = findViewById(R.id.imageButton11);
        builder = new AlertDialog.Builder(this);

        Artist10.setOnClickListener(new View.OnClickListener() {
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
                Intent intent = new Intent(HomeActivity.this, ShilohDynastyPlaylist.class);
                startActivity(intent);
            }
        });

        //Alec Benjamin Playlist nxt page
        Artist11 = findViewById(R.id.imageButton12);
        builder = new AlertDialog.Builder(this);

        Artist11.setOnClickListener(new View.OnClickListener() {
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
                Intent intent = new Intent(HomeActivity.this, AlecBenjaminPlaylist.class);
                startActivity(intent);
            }
        });

        //JVKE Playlist nxt page
        Artist12 = findViewById(R.id.imageButton13);
        builder = new AlertDialog.Builder(this);

        Artist12.setOnClickListener(new View.OnClickListener() {
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
                Intent intent = new Intent(HomeActivity.this, JVKEPlaylist.class);
                startActivity(intent);
            }
        });

    }
}