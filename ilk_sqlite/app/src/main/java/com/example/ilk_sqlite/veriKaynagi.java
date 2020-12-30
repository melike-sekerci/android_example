package com.example.ilk_sqlite;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class veriKaynagi { //veriye erişim içinkullanır.Veriyi ekleme silme
    SQLiteDatabase db; // kütüphaneden gelen bilgileri kullanır.
    sqlite_katmani bdb; // bizim oluşturduğumuz bilgileri kullanır.

    public veriKaynagi(Context c) {
        bdb = new sqlite_katmani(c);
    }

    public void ac() {
        db = bdb.getWritableDatabase();
    }

    public void kapat() {
        bdb.close();
    }

    public void kullaniciOlustur(kullanici k) {
        // String isim = "melike şekerci";
        //kullanici k = new kullanici();
        // k.setIsim(isim);
        ContentValues val = new ContentValues(); // Parametre geçirmeye yarayan obje
        val.put("isim", k.getIsim());
        db.insert("kullanici", null, val);
    }

    public void kullaniciSil(kullanici k) {
        int id = k.getId();
        db.delete("kullanici", "id=" + id, null);

    }

    public List<kullanici> listele() {
        String kolonlar[] = {"id", "isim"};
        List<kullanici> liste = new ArrayList<kullanici>();
        Cursor c = db.query("kllanici", kolonlar, null, null, null, null, null);
        //Cursor:kayitların üzerinden teker teker geçmemizi saglar. query: kayıtları döndürür.
        c.moveToFirst(); //Gelen kümedeki ilk elemana git.

        while (!c.isAfterLast()) {
            int id = c.getInt(0); //idsi 0 olan ve
            String isim = c.getString(1); //ismi 1 olanla bagdaştır.
            String eleman = "" + id + "-" + isim;
            kullanici k = new kullanici(isim,id);
            liste.add(k);
            c.moveToNext();
        }
        c.close();
        return liste;
    }
}
