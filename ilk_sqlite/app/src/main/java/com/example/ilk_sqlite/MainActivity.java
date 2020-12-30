package com.example.ilk_sqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;

import java.util.List;

public class MainActivity extends AppCompatActivity { //arayüz
    veriKaynagi vk;
    Button buttonadd;
    Button buttondelete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vk = new veriKaynagi(this); //veri tabanının main activity ile eş zamanlı çalışması için yazdık
        vk.ac();
        tanimla();
        List<kullanici> kullanicilar = vk.listele(); //Tüm kullanicilari listeler
        final ArrayAdapter<kullanici> adaptor = new ArrayAdapter<kullanici>(this, android.R.layout.simple_list_item_1, kullanicilar);
        // arrayAdapterı dönüştürmek için kullanırız.
        setListAdapter(adaptor);
        buttonadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kullanici k = new kullanici("melike şekerci", 1);
                vk.kullaniciOlustur(k);
                adaptor.add(k);
            }
        });
        buttondelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kullanici k = (kullanici) getListAdapter().getItem(0);
                vk.kullaniciSil(k);
                adaptor.remove(k);
            }
        });

    }

    public void tanimla() {
        buttonadd = findViewById(R.id.add);
        buttondelete = findViewById(R.id.delete);
    }
    protected void onResume(){
        vk.ac();
        super.onResume();
    }
    protected void onPause(){
        vk.kapat();
        super.onPause();
    }

}
