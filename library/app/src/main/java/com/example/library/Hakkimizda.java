package com.example.library;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Hakkimizda extends AppCompatActivity {
    ImageView hgeri;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hakkimizda);
        tanimla();
        tikla();
    }
    public void tanimla() {
        hgeri = findViewById(R.id.hgeri);
    }


    public void geriAyarlar() {
        Intent intent = new Intent(this, dahafazla.class);
        startActivity(intent);
    }

    public void tikla() {
        hgeri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                geriAyarlar();
            }
        });
    }

}
