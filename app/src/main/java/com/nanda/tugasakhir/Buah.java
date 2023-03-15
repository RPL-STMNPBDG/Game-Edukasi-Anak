package com.nanda.tugasakhir;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Buah extends Activity {

    Dialog myDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buah);

        myDialog = new Dialog(this);

    }

    public void kembali(View view) {
        Intent i = new Intent(Buah.this, Menu.class);
        startActivity(i);
        finish();
    }

    public void apel(View view) {
        ImageView img;
        ImageView btnsuara;
        myDialog.setContentView(R.layout.popupapel);
        btnsuara = (ImageView) myDialog.findViewById(R.id.suara);
        MediaPlayer apl = MediaPlayer.create(this,R.raw.apel);
        myDialog.show();

        btnsuara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {apl.start();
            }
        });
    }

    public void nanas(View view) {
        ImageView img;
        ImageView btnsuara;
        myDialog.setContentView(R.layout.popupnanas);
        btnsuara = (ImageView) myDialog.findViewById(R.id.suara);
        MediaPlayer nns = MediaPlayer.create(this,R.raw.nanas);
        myDialog.show();

        btnsuara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {nns.start();
            }
        });
    }

    public void mangga(View view) {
        ImageView img;
        ImageView btnsuara;
        myDialog.setContentView(R.layout.popupmangga);
        btnsuara = (ImageView) myDialog.findViewById(R.id.suara);
        MediaPlayer mga = MediaPlayer.create(this,R.raw.mangga);
        myDialog.show();

        btnsuara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {mga.start();
            }
        });
    }

    public void jeruk(View view) {
        ImageView img;
        ImageView btnsuara;
        myDialog.setContentView(R.layout.popupjeruk);
        btnsuara = (ImageView) myDialog.findViewById(R.id.suara);
        MediaPlayer jrk = MediaPlayer.create(this,R.raw.jeruk);
        myDialog.show();

        btnsuara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {jrk.start();
            }
        });
    }

    public void pepaya(View view) {
        ImageView img;
        ImageView btnsuara;
        myDialog.setContentView(R.layout.popuppepaya);
        btnsuara = (ImageView) myDialog.findViewById(R.id.suara);
        MediaPlayer ppy = MediaPlayer.create(this,R.raw.pepaya);
        myDialog.show();

        btnsuara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {ppy.start();
            }
        });
    }

    public void anggur(View view) {
        ImageView img;
        ImageView btnsuara;
        myDialog.setContentView(R.layout.popupanggur);
        btnsuara = (ImageView) myDialog.findViewById(R.id.suara);
        MediaPlayer agr = MediaPlayer.create(this,R.raw.anggur);
        myDialog.show();

        btnsuara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {agr.start();
            }
        });
    }

    public void durian(View view) {
        ImageView img;
        ImageView btnsuara;
        myDialog.setContentView(R.layout.popupdurian);
        btnsuara = (ImageView) myDialog.findViewById(R.id.suara);
        MediaPlayer drn = MediaPlayer.create(this,R.raw.durian);
        myDialog.show();

        btnsuara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {drn.start();
            }
        });
    }

    public void sirsak(View view) {
        ImageView img;
        ImageView btnsuara;
        myDialog.setContentView(R.layout.popupsirsak);
        btnsuara = (ImageView) myDialog.findViewById(R.id.suara);
        MediaPlayer srk = MediaPlayer.create(this,R.raw.sirsak);
        myDialog.show();

        btnsuara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {srk.start();
            }
        });
    }

    public void semangka(View view) {
        ImageView img;
        ImageView btnsuara;
        myDialog.setContentView(R.layout.popupsemangka);
        btnsuara = (ImageView) myDialog.findViewById(R.id.suara);
        MediaPlayer smk = MediaPlayer.create(this,R.raw.semangka);
        myDialog.show();

        btnsuara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {smk.start();
            }
        });
    }

    public void stroberi(View view) {
        ImageView img;
        ImageView btnsuara;
        myDialog.setContentView(R.layout.popupstroberi);
        btnsuara = (ImageView) myDialog.findViewById(R.id.suara);
        MediaPlayer str = MediaPlayer.create(this,R.raw.strawberry);
        myDialog.show();

        btnsuara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {str.start();
            }
        });
    }

    public void alpukat(View view) {
        ImageView img;
        ImageView btnsuara;
        myDialog.setContentView(R.layout.popupalpukat);
        btnsuara = (ImageView) myDialog.findViewById(R.id.suara);
        MediaPlayer apk = MediaPlayer.create(this,R.raw.alpukat);
        myDialog.show();

        btnsuara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                apk.start();
            }
        });

    }
}