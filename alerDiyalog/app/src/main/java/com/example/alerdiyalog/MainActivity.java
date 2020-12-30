package com.example.alerdiyalog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewDebug;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button buton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tanimla();

    }

    public void tanimla() {
        buton = findViewById(R.id.dialogAc);
        buton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogAc();
            }
        });
    }

    public void dialogAc() {
        LayoutInflater inflater = getLayoutInflater(); //layot dosyamıza ulaşmak için oluşturduk
        View view = inflater.inflate(R.layout.alertlayout, null);

        final EditText mailEditText = view.findViewById(R.id.mailAdres);
        final EditText kadiEditTex = view.findViewById(R.id.kullanıcı);
        final EditText parolaEditText = view.findViewById(R.id.parola);
        Button button = view.findViewById(R.id.buton);
        Button buttonCik = view.findViewById(R.id.buton2);

        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setView(view);
        alert.setCancelable(false);//sadece butona basıldığında kapanır.
        final AlertDialog dialog = alert.create();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), mailEditText.getText().toString() +
                        " " + kadiEditTex.getText().toString() +
                        " " + parolaEditText.getText().toString(), Toast.LENGTH_SHORT).show();

                dialog.cancel();
            }
        });
        buttonCik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.cancel();
            }
        });
        dialog.show();
    }

}
