package com.example.library;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class singUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sing_up);
        Button save = findViewById(R.id.save);
        ImageView carpi = findViewById(R.id.carpi);
        final EditText txtad = findViewById(R.id.ad);
        final EditText txtmail = findViewById(R.id.mail);
        final EditText txtpassword = findViewById(R.id.password);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ad = txtad.getText().toString();
                String mail = txtmail.getText().toString();
                String password = txtpassword.getText().toString();
                if (ad.isEmpty() || mail.isEmpty() || password.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Alanları Boş Gecemezsiniz!", Toast.LENGTH_LONG).show();
                    return;
                }
                Kullanici kullanici = new Kullanici(ad,  mail, password);
                Database db = new Database(getApplicationContext());
                long id = db.ekleKullanici(kullanici);
                if (id > 0) {
                    Toast.makeText(getApplicationContext(), "Kaydetme İşlemi Başarılı. :)", Toast.LENGTH_LONG).show();
                    txtad.setText("");
                    txtmail.setText("");
                    txtpassword.setText("");
                    gecisYap();
                } else {
                    Toast.makeText(getApplicationContext(), "Kaydetme İşlemi Başarısız!!", Toast.LENGTH_LONG).show();
                }
            }
        });
        carpi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gecisYap();
            }
        });
    }

    public void gecisYap() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }


}
