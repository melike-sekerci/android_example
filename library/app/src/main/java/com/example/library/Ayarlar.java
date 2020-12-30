package com.example.library;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class Ayarlar extends AppCompatActivity {

    ImageView ageri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ayarlar);
        tanimla();
        tikla();
    }

    public void tanimla() {
        ageri = findViewById(R.id.ageri);
    }


    public void geriAyarlar() {
        Intent intent = new Intent(this, dahafazla.class);
        startActivity(intent);
    }

    public void tikla() {
        ageri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                geriAyarlar();
            }
        });
    }

}
