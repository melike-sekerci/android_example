package com.example.library;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Yardim extends AppCompatActivity {
    ImageView ygeri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yardim);
        tanimla();
        tikla();
    }

    public void tanimla() {
        ygeri = findViewById(R.id.ygeri);
    }


    public void geriAyarlar() {
        Intent intent = new Intent(this, dahafazla.class);
        startActivity(intent);
    }

    public void tikla() {
        ygeri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                geriAyarlar();
            }
        });
    }

}
