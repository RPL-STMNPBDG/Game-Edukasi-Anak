package com.nanda.tugasakhir;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class huruf extends Activity {

    Dialog myDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_huruf);

        myDialog = new Dialog(this);

    }



    public void backmenu(View view) {
        Intent i = new Intent(huruf.this, Menu.class);
        startActivity(i);
        finish();
    }

    public void A(View view) {
        ImageView img;
        ImageView btnsuara;
        myDialog.setContentView(R.layout.popupa);
        img = (ImageView) myDialog.findViewById(R.id.close);
        btnsuara = (ImageView) myDialog.findViewById(R.id.suara);
        MediaPlayer a = MediaPlayer.create(this,R.raw.a);
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
                a.start();
            }
        });

    }

    public void B(View view) {
        ImageView img;
        ImageView btnsuara;
        myDialog.setContentView(R.layout.popupb);
        img = (ImageView) myDialog.findViewById(R.id.close);
        btnsuara = (ImageView) myDialog.findViewById(R.id.suara);
        MediaPlayer b = MediaPlayer.create(this,R.raw.b);
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
                b.start();
            }
        });

    }

    public void C(View view) {
        ImageView img;
        ImageView btnsuara;
        myDialog.setContentView(R.layout.popupc);
        img = (ImageView) myDialog.findViewById(R.id.close);
        btnsuara = (ImageView) myDialog.findViewById(R.id.suara);
        MediaPlayer c = MediaPlayer.create(this,R.raw.c);
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
                c.start();
            }
        });
    }

    public void D(View view) {
        ImageView img;
        ImageView btnsuara;
        myDialog.setContentView(R.layout.popupd);
        img = (ImageView) myDialog.findViewById(R.id.close);
        btnsuara = (ImageView) myDialog.findViewById(R.id.suara);
        MediaPlayer d = MediaPlayer.create(this,R.raw.d);
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
                d.start();
            }
        });
    }

    public void E(View view) {
        ImageView img;
        ImageView btnsuara;
        myDialog.setContentView(R.layout.popupe);
        img = (ImageView) myDialog.findViewById(R.id.close);
        btnsuara = (ImageView) myDialog.findViewById(R.id.suara);
        MediaPlayer e = MediaPlayer.create(this,R.raw.e);
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
                e.start();
            }
        });
    }

    public void F(View view) {
        ImageView img;
        ImageView btnsuara;
        myDialog.setContentView(R.layout.popupf);
        img = (ImageView) myDialog.findViewById(R.id.close);
        btnsuara = (ImageView) myDialog.findViewById(R.id.suara);
        MediaPlayer f = MediaPlayer.create(this,R.raw.f);
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
                f.start();
            }
        });
    }

    public void G(View view) {
        ImageView img;
        ImageView btnsuara;
        myDialog.setContentView(R.layout.popupg);
        img = (ImageView) myDialog.findViewById(R.id.close);
        btnsuara = (ImageView) myDialog.findViewById(R.id.suara);
        MediaPlayer g = MediaPlayer.create(this,R.raw.g);
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
                g.start();
            }
        });
    }

    public void H(View view) {
        ImageView img;
        ImageView btnsuara;
        myDialog.setContentView(R.layout.popuph);
        img = (ImageView) myDialog.findViewById(R.id.close);
        btnsuara = (ImageView) myDialog.findViewById(R.id.suara);
        MediaPlayer h = MediaPlayer.create(this,R.raw.h);
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
                h.start();
            }
        });
    }

    public void I(View view) {
        ImageView img;
        ImageView btnsuara;
        myDialog.setContentView(R.layout.popupi);
        img = (ImageView) myDialog.findViewById(R.id.close);
        btnsuara = (ImageView) myDialog.findViewById(R.id.suara);
        MediaPlayer i = MediaPlayer.create(this,R.raw.i);
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
                i.start();
            }
        });
    }

    public void J(View view) {
        ImageView img;
        ImageView btnsuara;
        myDialog.setContentView(R.layout.popupj);
        img = (ImageView) myDialog.findViewById(R.id.close);
        btnsuara = (ImageView) myDialog.findViewById(R.id.suara);
        MediaPlayer j = MediaPlayer.create(this,R.raw.j);
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
                j.start();
            }
        });
    }

    public void K(View view) {
        ImageView img;
        ImageView btnsuara;
        myDialog.setContentView(R.layout.popupk);
        img = (ImageView) myDialog.findViewById(R.id.close);
        btnsuara = (ImageView) myDialog.findViewById(R.id.suara);
        MediaPlayer k = MediaPlayer.create(this,R.raw.k);
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
                k.start();
            }
        });
    }

    public void L(View view) {
        ImageView img;
        ImageView btnsuara;
        myDialog.setContentView(R.layout.popupl);
        img = (ImageView) myDialog.findViewById(R.id.close);
        btnsuara = (ImageView) myDialog.findViewById(R.id.suara);
        MediaPlayer l = MediaPlayer.create(this,R.raw.l);
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
                l.start();
            }
        });
    }

    public void M(View view) {
        ImageView img;
        ImageView btnsuara;
        myDialog.setContentView(R.layout.popupm);
        img = (ImageView) myDialog.findViewById(R.id.close);
        btnsuara = (ImageView) myDialog.findViewById(R.id.suara);
        MediaPlayer m = MediaPlayer.create(this,R.raw.m);
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
                m.start();
            }
        });
    }

    public void N(View view) {
        ImageView img;
        ImageView btnsuara;
        myDialog.setContentView(R.layout.popupn);
        img = (ImageView) myDialog.findViewById(R.id.close);
        btnsuara = (ImageView) myDialog.findViewById(R.id.suara);
        MediaPlayer n = MediaPlayer.create(this,R.raw.n);
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
                n.start();
            }
        });

    }

    public void O(View view) {
        ImageView img;
        ImageView btnsuara;
        myDialog.setContentView(R.layout.popupo);
        img = (ImageView) myDialog.findViewById(R.id.close);
        btnsuara = (ImageView) myDialog.findViewById(R.id.suara);
        MediaPlayer o = MediaPlayer.create(this,R.raw.o);
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
                o.start();
            }
        });

    }

    public void P(View view) {
        ImageView img;
        ImageView btnsuara;
        myDialog.setContentView(R.layout.popupp);
        img = (ImageView) myDialog.findViewById(R.id.close);
        btnsuara = (ImageView) myDialog.findViewById(R.id.suara);
        MediaPlayer p = MediaPlayer.create(this,R.raw.p);
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
                p.start();
            }
        });
    }

    public void Q(View view) {
        ImageView img;
        ImageView btnsuara;
        myDialog.setContentView(R.layout.popupq);
        img = (ImageView) myDialog.findViewById(R.id.close);
        btnsuara = (ImageView) myDialog.findViewById(R.id.suara);
        MediaPlayer q = MediaPlayer.create(this,R.raw.q);
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
                q.start();
            }
        });
    }

    public void R(View view) {
        ImageView img;
        ImageView btnsuara;
        myDialog.setContentView(R.layout.popupr);
        img = (ImageView) myDialog.findViewById(R.id.close);
        btnsuara = (ImageView) myDialog.findViewById(R.id.suara);
        MediaPlayer r = MediaPlayer.create(this,R.raw.r);
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
                r.start();
            }
        });
    }

    public void S(View view) {
        ImageView img;
        ImageView btnsuara;
        myDialog.setContentView(R.layout.popups);
        img = (ImageView) myDialog.findViewById(R.id.close);
        btnsuara = (ImageView) myDialog.findViewById(R.id.suara);
        MediaPlayer s = MediaPlayer.create(this,R.raw.s);
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
                s.start();
            }
        });
    }

    public void T(View view) {
        ImageView img;
        ImageView btnsuara;
        myDialog.setContentView(R.layout.popupt);
        img = (ImageView) myDialog.findViewById(R.id.close);
        btnsuara = (ImageView) myDialog.findViewById(R.id.suara);
        MediaPlayer t = MediaPlayer.create(this,R.raw.t);
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
                t.start();
            }
        });
    }

    public void U(View view) {
        ImageView img;
        ImageView btnsuara;
        myDialog.setContentView(R.layout.popupu);
        img = (ImageView) myDialog.findViewById(R.id.close);
        btnsuara = (ImageView) myDialog.findViewById(R.id.suara);
        MediaPlayer u = MediaPlayer.create(this,R.raw.u);
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
                u.start();
            }
        });
    }

    public void V(View view) {
        ImageView img;
        ImageView btnsuara;
        myDialog.setContentView(R.layout.popupv);
        img = (ImageView) myDialog.findViewById(R.id.close);
        btnsuara = (ImageView) myDialog.findViewById(R.id.suara);
        MediaPlayer v = MediaPlayer.create(this,R.raw.v);
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
                v.start();
            }
        });
    }

    public void W(View view) {
        ImageView img;
        ImageView btnsuara;
        myDialog.setContentView(R.layout.popupw);
        img = (ImageView) myDialog.findViewById(R.id.close);
        btnsuara = (ImageView) myDialog.findViewById(R.id.suara);
        MediaPlayer w = MediaPlayer.create(this,R.raw.w);
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
                w.start();
            }
        });
    }

    public void X(View view) {
        ImageView img;
        ImageView btnsuara;
        myDialog.setContentView(R.layout.popupx);
        img = (ImageView) myDialog.findViewById(R.id.close);
        btnsuara = (ImageView) myDialog.findViewById(R.id.suara);
        MediaPlayer x = MediaPlayer.create(this,R.raw.x);
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
                x.start();
            }
        });
    }

    public void Y(View view) {
        ImageView img;
        ImageView btnsuara;
        myDialog.setContentView(R.layout.popupy);
        img = (ImageView) myDialog.findViewById(R.id.close);
        btnsuara = (ImageView) myDialog.findViewById(R.id.suara);
        MediaPlayer y = MediaPlayer.create(this,R.raw.y);
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
                y.start();
            }
        });
    }

    public void Z(View view) {
        ImageView img;
        ImageView btnsuara;
        myDialog.setContentView(R.layout.popupz);
        img = (ImageView) myDialog.findViewById(R.id.close);
        btnsuara = (ImageView) myDialog.findViewById(R.id.suara);
        MediaPlayer z = MediaPlayer.create(this,R.raw.z);
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
                z.start();
            }
        });
    }
}