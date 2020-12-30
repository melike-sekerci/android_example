package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<KullaniciModel> kullaniciList;
    KullaniciLisAdapter adp;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tanimla();
        listeDoldur();
    }
    public void listeDoldur(){
        kullaniciList=new ArrayList<>();
        KullaniciModel k1=new KullaniciModel("murat","22","Cınar","GalataSaray");
        KullaniciModel k2=new KullaniciModel("melike","21","Sekerci","GalataSaray");
        KullaniciModel k3=new KullaniciModel("halil","22","bayram","GalataSaray");
        KullaniciModel k4=new KullaniciModel("mehmet","54","kaya","Trabzon");
        KullaniciModel k5=new KullaniciModel("özge","47","dogan","FenerBahce");
        kullaniciList.add(k1);
        kullaniciList.add(k2);
        kullaniciList.add(k3);
        kullaniciList.add(k4);
        kullaniciList.add(k5);
        adp =new KullaniciLisAdapter(kullaniciList,this);
        listView.setAdapter(adp);

    }
    public void tanimla(){
        listView=findViewById(R.id.listView);
    }
}
