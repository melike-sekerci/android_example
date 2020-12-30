package com.example.library;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class anaSayfa extends AppCompatActivity {
    LinearLayout kesif;
    LinearLayout bul;
    LinearLayout dahaFazla;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ana_sayfa);
        tanimla();
        tikla();
    }

    public void tanimla() {
        kesif = findViewById(R.id.kesif);
        bul = findViewById(R.id.bul);
        dahaFazla = findViewById(R.id.dahaFazla);
    }

    public void gecKesif() {
        Intent intent = new Intent(this, kesiflerim.class);
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
        kesif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gecKesif();
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
