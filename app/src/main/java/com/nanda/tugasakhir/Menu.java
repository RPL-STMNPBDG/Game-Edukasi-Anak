package com.nanda.tugasakhir;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_menu);

    }

    public void angka(View view) {
        Intent i = new Intent(Menu.this, Angka.class);
        startActivity(i);
        finish();
    }

    public void huruf(View view) {
        Intent i = new Intent(Menu.this, huruf.class);
        startActivity(i);
        finish();
    }

    public void hewan(View view) {
        Intent i = new Intent(Menu.this, hewan.class);
        startActivity(i);
        finish();
    }

    public void back(View view) {
        Intent i = new Intent(Menu.this, MainActivity.class);
        startActivity(i);
        finish();
    }

    public void buah(View view) {
        Intent i = new Intent(Menu.this, Buah.class);
        startActivity(i);
        finish();
    }

    public void info(View view) {
        Intent i = new Intent(Menu.this, Info.class);
        startActivity(i);
        finish();
    }
}