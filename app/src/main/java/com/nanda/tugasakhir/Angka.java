package com.nanda.tugasakhir;

import android.app.Dialog;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app. AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Angka extends AppCompatActivity {

    Dialog myDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_angka);

        myDialog = new Dialog(this);

    }

    public void backmenuangka(View view) {
        Intent i = new Intent(Angka.this, Menu.class);
        startActivity(i);
        finish();
    }

    public void satu(View view) {
        ImageView img;
        ImageView btnsuara;
        myDialog.setContentView(R.layout.popup1);
        img = (ImageView) myDialog.findViewById(R.id.close);
        btnsuara = (ImageView) myDialog.findViewById(R.id.suara);
        MediaPlayer satu = MediaPlayer.create(this,R.raw.satu);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myDialog.dismiss();
            }
        });
        myDialog.show();

        btnsuara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                satu.start();
            }
        });
    }

    public void dua(View view) {
        ImageView img;
        ImageView btnsuara;
        myDialog.setContentView(R.layout.popup2);
        img = (ImageView) myDialog.findViewById(R.id.close);
        btnsuara = (ImageView) myDialog.findViewById(R.id.suara);
        MediaPlayer dua = MediaPlayer.create(this,R.raw.dua);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myDialog.dismiss();
            }
        });
        myDialog.show();

        btnsuara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dua.start();
            }
        });
    }

    public void tiga(View view) {
        ImageView img;
        ImageView btnsuara;
        myDialog.setContentView(R.layout.popup3);
        img = (ImageView) myDialog.findViewById(R.id.close);
        btnsuara = (ImageView) myDialog.findViewById(R.id.suara);
        MediaPlayer tiga = MediaPlayer.create(this,R.raw.tiga);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myDialog.dismiss();
            }
        });
        myDialog.show();

        btnsuara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tiga.start();
            }
        });
    }

    public void empat(View view) {
        ImageView img;
        ImageView btnsuara;
        myDialog.setContentView(R.layout.popup4);
        img = (ImageView) myDialog.findViewById(R.id.close);
        btnsuara = (ImageView) myDialog.findViewById(R.id.suara);
        MediaPlayer empat = MediaPlayer.create(this,R.raw.empat);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myDialog.dismiss();
            }
        });
        myDialog.show();

        btnsuara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                empat.start();
            }
        });
    }

    public void lima(View view) {
        ImageView img;
        ImageView btnsuara;
        myDialog.setContentView(R.layout.popup5);
        img = (ImageView) myDialog.findViewById(R.id.close);
        btnsuara = (ImageView) myDialog.findViewById(R.id.suara);
        MediaPlayer lima = MediaPlayer.create(this,R.raw.lima);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myDialog.dismiss();
            }
        });
        myDialog.show();

        btnsuara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lima.start();
            }
        });
    }

    public void enam(View view) {
        ImageView img;
        ImageView btnsuara;
        myDialog.setContentView(R.layout.popup6);
        img = (ImageView) myDialog.findViewById(R.id.close);
        btnsuara = (ImageView) myDialog.findViewById(R.id.suara);
        MediaPlayer enam = MediaPlayer.create(this,R.raw.enam);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myDialog.dismiss();
            }
        });
        myDialog.show();

        btnsuara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enam.start();
            }
        });
    }

    public void tujuh(View view) {
        ImageView img;
        ImageView btnsuara;
        myDialog.setContentView(R.layout.popup7);
        img = (ImageView) myDialog.findViewById(R.id.close);
        btnsuara = (ImageView) myDialog.findViewById(R.id.suara);
        MediaPlayer tujuh = MediaPlayer.create(this,R.raw.tujuh);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myDialog.dismiss();
            }
        });
        myDialog.show();

        btnsuara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tujuh.start();
            }
        });
    }

    public void delapan(View view) {
        ImageView img;
        ImageView btnsuara;
        myDialog.setContentView(R.layout.popup8);
        img = (ImageView) myDialog.findViewById(R.id.close);
        btnsuara = (ImageView) myDialog.findViewById(R.id.suara);
        MediaPlayer delapan = MediaPlayer.create(this,R.raw.delapan);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myDialog.dismiss();
            }
        });
        myDialog.show();

        btnsuara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                delapan.start();
            }
        });
    }

    public void sembilan(View view) {
        ImageView img;
        ImageView btnsuara;
        myDialog.setContentView(R.layout.popup9);
        img = (ImageView) myDialog.findViewById(R.id.close);
        btnsuara = (ImageView) myDialog.findViewById(R.id.suara);
        MediaPlayer sembilan = MediaPlayer.create(this,R.raw.sembilan);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myDialog.dismiss();
            }
        });
        myDialog.show();

        btnsuara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sembilan.start();
            }
        });
    }

    public void sepuluh(View view) {
        ImageView img;
        ImageView btnsuara;
        myDialog.setContentView(R.layout.popup10);
        img = (ImageView) myDialog.findViewById(R.id.close);
        btnsuara = (ImageView) myDialog.findViewById(R.id.suara);
        MediaPlayer sepuluh = MediaPlayer.create(this,R.raw.sepuluh);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myDialog.dismiss();
            }
        });
        myDialog.show();

        btnsuara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sepuluh.start();
            }
        });
    }
}