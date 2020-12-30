package com.example.library;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class kesiflerim extends AppCompatActivity {
    LinearLayout anasayfa;
    LinearLayout bul;
    LinearLayout dahaFazla;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kesiflerim);
        tanimla();
        tikla();
    }

    public void tanimla() {
        anasayfa = findViewById(R.id.anasayfa);
        bul = findViewById(R.id.bul);
        dahaFazla = findViewById(R.id.dahaFazla);
    }

    public void gecAnaSayfa() {
        Intent intent = new Intent(this, anaSayfa.class);
        startActivity(intent);
    }

    public void gecAra() {
        Intent intent = new Intent(this, ara.class);
        startActivity(intent);
    }

    public void gecDahaFazla() {
        Intent intent = new Intent(this, dahafazla.class);
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
        dahaFazla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gecDahaFazla();
            }
        });
    }

}
