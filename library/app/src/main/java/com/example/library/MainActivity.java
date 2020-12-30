package com.example.library;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnSingUp;
    Button btnSingIn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSingUp = findViewById(R.id.btnSingUp);
        btnSingIn = findViewById(R.id.btnSingIn);

        final EditText txtmail = findViewById(R.id.mail);
        final EditText txtpassword = findViewById(R.id.password);

        btnSingUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gecisYapKaydol();
            }
        });
        btnSingIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mail=txtmail.getText().toString();
                String password=txtpassword.getText().toString();
                if (mail.isEmpty()||password.isEmpty()){
                    Toast.makeText(getApplicationContext(),"Alanları Boş Gecemezsiniz!",Toast.LENGTH_LONG).show();
                    return;
                }

                Kullanici kullanici1 = new Kullanici(mail,password);
                Database db = new Database(getApplicationContext());
                int say = db.giris(kullanici1);
                if(say>0){
                    Toast.makeText(getApplicationContext(),"Giriş Başarılı. :)",Toast.LENGTH_LONG).show();
                    Intent intent=new Intent(getApplicationContext(),anaSayfa.class);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(getApplicationContext(),"Girilen Değerleri Kontrol Ediniz!",Toast.LENGTH_LONG).show();
                }



            }
            });

        }



    public void gecisYapKaydol() {
        Intent intent = new Intent(this, singUp.class);
        startActivity(intent);
    }

    public void gecisYapAnasayfa() {
        Intent intent = new Intent(this, anaSayfa.class);
        startActivity(intent);
    }


}
