package com.nanda.tugasakhir;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        btn = (findViewById(R.id.mulai));
        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.belajar_bersama_panpan);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.start();
                Intent i = new Intent(MainActivity.this, Menu.class);
                startActivity(i);
                finish();
            }
        });


    }


}