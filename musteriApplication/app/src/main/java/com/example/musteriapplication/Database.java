package com.example.musteriapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class Database extends SQLiteOpenHelper {
    private static final String veritabani_adi = "veritabani_musteri";
    private static final String musteri_tablosu = "tbl_musteri";
    private static final int veritabani_versiyon = 1;

    public Database(@Nullable Context context) {
        super(context, veritabani_adi, null, veritabani_versiyon);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql_musteriTablosuOlusturma = "CREATE TABLE" + musteri_tablosu + "(ID INTEGER PRIMARY KEY AUTOINCREMENT,MusteriAdi TEXT,MusteriAdres TEXT)";
        db.execSQL(sql_musteriTablosuOlusturma);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS" + musteri_tablosu);

    }

    public long ekleMusteri(Musteri musteri) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("Musteri adi", musteri.getAd());
        cv.put("Musteri adresi", musteri.getAdres());
        long id = db.insert("musteri_tablosu", null, cv);
        return id;
    }


    public List<Musteri> getirMusteriList() {
        List<Musteri> musteriList = new ArrayList<Musteri>();
        SQLiteDatabase db = this.getReadableDatabase();
        String sqlSorgulama = "Select * from" + musteri_tablosu;
        Cursor c = db.rawQuery(sqlSorgulama, null);
        int siraNoId = c.getColumnIndex("ID");
        int adSiraNo = c.getColumnIndex("MusteriAdi");
        int siraNoAdres = c.getColumnIndex("MusteriAdres");
        try {

        }
        finally {

        }

        return musteriList;

    }
}
