package com.nanda.tugasakhir;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class hewan extends Activity {

    Dialog myDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hewan);

        myDialog = new Dialog(this);

    }

    public void kembalihewan(View view) {
        Intent i = new Intent(hewan.this, Menu.class);
        startActivity(i);
        finish();
    }

    public void kucing(View view) {
        ImageView img;
        ImageView btnsuara;
        myDialog.setContentView(R.layout.popupkucing);
        img = (ImageView) myDialog.findViewById(R.id.close);
        btnsuara = (ImageView) myDialog.findViewById(R.id.suara);
        MediaPlayer kcg = MediaPlayer.create(this,R.raw.kucing);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myDialog.dismiss();
            }
        });
        myDialog.show();

        btnsuara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {kcg.start();
            }
        });

    }

    public void anjing(View view) {
        ImageView img;
        ImageView btnsuara;
        myDialog.setContentView(R.layout.popupanjing);
        img = (ImageView) myDialog.findViewById(R.id.close);
        btnsuara = (ImageView) myDialog.findViewById(R.id.suara);
        MediaPlayer ajg = MediaPlayer.create(this,R.raw.anjing);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myDialog.dismiss();
            }
        });
        myDialog.show();

        btnsuara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {ajg.start();
            }
        });
    }

    public void monyet(View view) {
        ImageView img;
        ImageView btnsuara;
        myDialog.setContentView(R.layout.popupmonyet);
        img = (ImageView) myDialog.findViewById(R.id.close);
        btnsuara = (ImageView) myDialog.findViewById(R.id.suara);
        MediaPlayer myt = MediaPlayer.create(this,R.raw.monyet);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myDialog.dismiss();
            }
        });
        myDialog.show();

        btnsuara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {myt.start();
            }
        });
    }

    public void babi(View view) {
        ImageView img;
        ImageView btnsuara;
        myDialog.setContentView(R.layout.popupbabi);
        img = (ImageView) myDialog.findViewById(R.id.close);
        btnsuara = (ImageView) myDialog.findViewById(R.id.suara);
        MediaPlayer babi = MediaPlayer.create(this,R.raw.babi);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myDialog.dismiss();
            }
        });
        myDialog.show();

        btnsuara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {babi.start();
            }
        });
    }

    public void sapi(View view) {
        ImageView img;
        ImageView btnsuara;
        myDialog.setContentView(R.layout.popupsapi);
        img = (ImageView) myDialog.findViewById(R.id.close);
        btnsuara = (ImageView) myDialog.findViewById(R.id.suara);
        MediaPlayer sai = MediaPlayer.create(this,R.raw.sapi);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myDialog.dismiss();
            }
        });
        myDialog.show();

        btnsuara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {sai.start();
            }
        });
    }

    public void ayam(View view) {
        ImageView img;
        ImageView btnsuara;
        myDialog.setContentView(R.layout.popupayam);
        img = (ImageView) myDialog.findViewById(R.id.close);
        btnsuara = (ImageView) myDialog.findViewById(R.id.suara);
        MediaPlayer aym = MediaPlayer.create(this,R.raw.ayam);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myDialog.dismiss();
            }
        });
        myDialog.show();

        btnsuara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {aym.start();
            }
        });
    }

    public void burung(View view) {
        ImageView img;
        ImageView btnsuara;
        myDialog.setContentView(R.layout.popupburung);
        img = (ImageView) myDialog.findViewById(R.id.close);
        btnsuara = (ImageView) myDialog.findViewById(R.id.suara);
        MediaPlayer brg = MediaPlayer.create(this,R.raw.burung);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myDialog.dismiss();
            }
        });
        myDialog.show();

        btnsuara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {brg.start();
            }
        });
    }

    public void singa(View view) {
        ImageView img;
        ImageView btnsuara;
        myDialog.setContentView(R.layout.popupsinga);
        img = (ImageView) myDialog.findViewById(R.id.close);
        btnsuara = (ImageView) myDialog.findViewById(R.id.suara);
        MediaPlayer snga = MediaPlayer.create(this,R.raw.singa);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myDialog.dismiss();
            }
        });
        myDialog.show();

        btnsuara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {snga.start();
            }
        });
    }

    public void harimau(View view) {
        ImageView img;
        ImageView btnsuara;
        myDialog.setContentView(R.layout.popupharimau);
        img = (ImageView) myDialog.findViewById(R.id.close);
        btnsuara = (ImageView) myDialog.findViewById(R.id.suara);
        MediaPlayer hrmau = MediaPlayer.create(this,R.raw.harimau);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myDialog.dismiss();
            }
        });
        myDialog.show();

        btnsuara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {hrmau.start();
            }
        });
    }

    public void gajah(View view) {
        ImageView img;
        ImageView btnsuara;
        myDialog.setContentView(R.layout.popupgajah);
        img = (ImageView) myDialog.findViewById(R.id.close);
        btnsuara = (ImageView) myDialog.findViewById(R.id.suara);
        MediaPlayer gjh = MediaPlayer.create(this,R.raw.gajah);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myDialog.dismiss();
            }
        });
        myDialog.show();

        btnsuara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {gjh.start();
            }
        });
    }

    public void kuda(View view) {
        ImageView img;
        ImageView btnsuara;
        myDialog.setContentView(R.layout.popupkuda);
        img = (ImageView) myDialog.findViewById(R.id.close);
        btnsuara = (ImageView) myDialog.findViewById(R.id.suara);
        MediaPlayer kda = MediaPlayer.create(this,R.raw.kuda);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myDialog.dismiss();
            }
        });
        myDialog.show();

        btnsuara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {kda.start();
            }
        });
    }

    public void kambing(View view) {
        ImageView img;
        ImageView btnsuara;
        myDialog.setContentView(R.layout.popupkambing);
        img = (ImageView) myDialog.findViewById(R.id.close);
        btnsuara = (ImageView) myDialog.findViewById(R.id.suara);
        MediaPlayer kbg = MediaPlayer.create(this,R.raw.kambing);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myDialog.dismiss();
            }
        });
        myDialog.show();

        btnsuara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {kbg.start();
            }
        });
    }
}