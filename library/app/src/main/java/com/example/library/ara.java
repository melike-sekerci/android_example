package com.example.library;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class ara extends AppCompatActivity {
    LinearLayout anasayfa;
    LinearLayout kesif;
    LinearLayout dahaFazla;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ara);
        tanimla();
        tikla();
    }

    public void tanimla() {
        anasayfa = findViewById(R.id.anasayfa);
        kesif = findViewById(R.id.kesif);
        dahaFazla = findViewById(R.id.dahaFazla);
    }

    public void gecAnaSayfa() {
        Intent intent = new Intent(this, anaSayfa.class);
        startActivity(intent);
    }

    public void gecKesif() {
        Intent intent = new Intent(this, kesiflerim.class);
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
        kesif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gecKesif();
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
