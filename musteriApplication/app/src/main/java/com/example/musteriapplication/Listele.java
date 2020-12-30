package com.example.musteriapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class Listele extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listele);
        EditText txtMusteriListesi=findViewById(R.id.txtMusteriListesi);
        Database db=new Database(getApplicationContext());

        List<Musteri> musteriList=new ArrayList<Musteri>();
        musteriList=db.getirMusteriList();
    }
}
