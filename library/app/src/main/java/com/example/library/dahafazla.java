package com.example.library;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class dahafazla extends AppCompatActivity {
    LinearLayout anasayfa;
    LinearLayout bul;
    LinearLayout kesif;
    TextView ayarlar;
    TextView yardim;
    TextView hakkimizda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dahafazla);
        tanimla();
        tikla();
    }

    public void tanimla() {
        anasayfa = findViewById(R.id.anasayfa);
        bul = findViewById(R.id.bul);
        kesif = findViewById(R.id.kesif);
        ayarlar = findViewById(R.id.ayarlar);
        yardim = findViewById(R.id.yardim);
        hakkimizda = findViewById(R.id.hakkimizda);
    }

    public void gecAnaSayfa() {
        Intent intent = new Intent(this, anaSayfa.class);
        startActivity(intent);
    }

    public void gecAra() {
        Intent intent = new Intent(this, ara.class);
        startActivity(intent);
    }

    public void gecKesif() {
        Intent intent = new Intent(this, dahafazla.class);
        startActivity(intent);
    }

    public void gecAyarlar() {
        Intent intent = new Intent(this, Ayarlar.class);
        startActivity(intent);
    }

    public void gecYardim() {
        Intent intent = new Intent(this, Yardim.class);
        startActivity(intent);
    }

    public void gecHakkimizda() {
        Intent intent = new Intent(this, Hakkimizda.class);
        startActivity(intent);
    }

    public void tikla() {
        anasayfa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gecAnaSayfa();
            }
        });
        bul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gecAra();
            }
        });
        kesif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gecKesif();
            }
        });
        ayarlar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gecAyarlar();
            }
        });
        yardim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gecYardim();
            }
        });
        hakkimizda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gecHakkimizda();
            }
        });
    }
}
