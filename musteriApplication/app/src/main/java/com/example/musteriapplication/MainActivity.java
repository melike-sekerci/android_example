package com.example.musteriapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText txtAd;
    EditText txtAdres;
    Button btnKaydet;
    Button btnListele;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tanimla();
        tikla();
        Musteri musteri = new Musteri("ad", "adres");
        Database db = new Database(getApplicationContext());
        long id = db.ekleMusteri(musteri);
        if (id > 0) {
            Toast.makeText(getApplicationContext(), "Kayıt Başarılı! ID=" + id, Toast.LENGTH_LONG).show();
            txtAd.setText("");
            txtAdres.setText("");
        } else {
            Toast.makeText(getApplicationContext(), "Kayıt Başarısız.", Toast.LENGTH_LONG).show();
        }
    }

    public void tanimla() {
        txtAd = findViewById(R.id.txtAd);
        txtAdres = findViewById(R.id.txtAdres);
        btnKaydet = findViewById(R.id.btnKaydet);
        btnListele = findViewById(R.id.btnListele);
    }

    public void tikla() {
        btnKaydet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ad = txtAd.getText().toString();
                String adres = txtAdres.getText().toString();
                if (ad.isEmpty() || adres.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Lütfen boş alanları doldurunuz.", Toast.LENGTH_LONG).show();
                    return;
                }
            }
        });
        btnListele.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Listele.class);
                startActivity(intent);
            }
        });
    }
}
