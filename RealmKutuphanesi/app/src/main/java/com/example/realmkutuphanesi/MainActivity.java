package com.example.realmkutuphanesi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import io.realm.Realm;
import io.realm.RealmResults;

public class MainActivity extends AppCompatActivity {
    Realm realm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        realmTanimla();
        tabloyaEkle();
        goster();
    }

    public void realmTanimla() {
        realm = Realm.getDefaultInstance();
    }
    public void tabloyaEkle(){
        realm.beginTransaction();//araya yazdıklarımızın ya hepsi gerçekleşir ya da hiçbiri gerçekleşmez.
        KisilerTablosu kisilerTablosu=realm.createObject(KisilerTablosu.class);
        kisilerTablosu.setKisiİsmi("melike");
        kisilerTablosu.setSoyisim("şekerci");
        kisilerTablosu.setYas(21);
        kisilerTablosu.setMaas(3000);
        realm.commitTransaction();
    }
    public void goster(){
        realm.beginTransaction();
        RealmResults<KisilerTablosu> sonuc=realm.where(KisilerTablosu.class).findAll();
        for(KisilerTablosu k:sonuc){
            Log.i("çıktı",k.toString());
        }
        realm.commitTransaction();
    }
}
