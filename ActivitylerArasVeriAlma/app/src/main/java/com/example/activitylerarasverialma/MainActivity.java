package com.example.activitylerarasverialma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    EditText kadi, kparola;
    Button btn;
    RadioGroup rdGroup;
    String kullaniciAdi, kullaniciParola, kullaniciCinsiyet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tanimla();
        tiklaveGec();
    }

    public void tanimla() {
        kadi = findViewById(R.id.editTektKullanici);
        kparola = findViewById(R.id.editTektParola);
        btn = findViewById(R.id.gonderButton);
        rdGroup = findViewById(R.id.cinsiyet);
    }

    void degerAl() {
        kullaniciAdi = kadi.getText().toString();
        kullaniciParola = kparola.getText().toString();
        kullaniciCinsiyet = ((RadioButton) findViewById(rdGroup.getCheckedRadioButtonId())).getText().toString();//grup içinde seçilen butonun stringini getir
    }

    void tiklaveGec() {
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                degerAl();
                Intent intent = new Intent(getApplicationContext(), activity2.class);
                intent.putExtra("KullaniciAdi",kullaniciAdi);
                intent.putExtra("KullaniciSifre",kullaniciParola);
                intent.putExtra("Cisiyet",kullaniciCinsiyet);
                startActivity(intent);

            }
        });
    }
}
