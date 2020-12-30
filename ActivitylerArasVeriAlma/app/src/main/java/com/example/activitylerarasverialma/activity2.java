package com.example.activitylerarasverialma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class activity2 extends AppCompatActivity {
     String kadi,kparola,kcinsiyet;
     TextView adi,parola,cinsiyet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity2);
        tanimla();
        al();
    }
    public void al(){
        Bundle intent= getIntent().getExtras(); //bundle intentler arası geçis için kullanılır.
        kadi=intent.getString("KullaniciAdi");
        kparola=intent.getString("KullaniciSifre");
        kcinsiyet=intent.getString("Cinsiyet");

        adi.setText(adi.getText()+" "+kadi);
        parola.setText(parola.getText()+" "+kparola);
        cinsiyet.setText(cinsiyet.getText()+" "+kcinsiyet);
    }
    public void tanimla(){
        adi=findViewById(R.id.isim);
        parola=findViewById(R.id.parola);
        cinsiyet=findViewById(R.id.cinsiyet);
    }
}
