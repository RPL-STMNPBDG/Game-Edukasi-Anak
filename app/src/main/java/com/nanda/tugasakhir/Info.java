package com.nanda.tugasakhir;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Info extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        getSupportActionBar().hide();
    }
    public void backmenuinfo(View view) {
        Intent i = new Intent(Info.this, Menu.class);
        startActivity(i);
        finish();
    }
}