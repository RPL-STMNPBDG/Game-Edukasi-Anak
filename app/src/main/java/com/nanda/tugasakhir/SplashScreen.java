package com.nanda.tugasakhir;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.time.OffsetDateTime;

public class SplashScreen extends Activity {

    ProgressBar progressBar;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        progressBar = findViewById(R.id.progressbar);
        progressBar.setMax(100);
        progressBar.setScaleY(2f);
        progressAnimation();

    }

    private void progressAnimation(){
        ProgressAnimation animation = new ProgressAnimation(this, textView, progressBar, 0f, 100f);
        animation.setDuration(3000);
        progressBar.setAnimation(animation);

    }
}