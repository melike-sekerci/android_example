package com.example.faktriyel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    Button button;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tanimla();
        tıklama();
    }
    private void tanimla(){
        editText=(EditText) findViewById(R.id.text);
        button= findViewById(R.id.hesaplaButonu);
        textView=findViewById(R.id.sonucText);
    }

    private void tıklama(){
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String deger=editText.getText().toString();
                int fakHesaplanacakSayi=Integer.parseInt(deger);
                int faktoriyel=hesapla(fakHesaplanacakSayi);
                textView.setText("Sonuc= "+faktoriyel);

            }
        });

        }
    private int hesapla(int sayi) {
        int sonuc =1 ;
        int a=1;
        for (int i = sayi; i > 1; i--) {
            sonuc = sonuc * i;
        }
        return sonuc;
    }

}
