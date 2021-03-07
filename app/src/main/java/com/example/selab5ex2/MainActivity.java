package com.example.selab5ex2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int play;
    MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        play=0;
        player = new MediaPlayer();
        player = MediaPlayer.create(this, R.raw.azan);

        Button btn = (Button) findViewById(R.id.button);
        final TextView txtView = (TextView) findViewById(R.id.textView);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch(play){
                    case 0: player.start();
                    txtView.setText("Azan is started");
                    play= 1;
                    break;

                    case 1: player.pause();
                    txtView.setText("Azan is paused");
                    play= 0;
                    break;
                }
            }
        });

    }
}