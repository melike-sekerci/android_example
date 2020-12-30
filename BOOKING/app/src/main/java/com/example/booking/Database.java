package com.example.booking;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Database extends SQLiteOpenHelper {
    private static final String veritabaniAdi = "bilgiler";
    private static final String tablo = "yenitabloKullanici";
    private static final int veritabaniVersiyon = 1;

    public Database(Context context) {
        super(context, veritabaniAdi, null, veritabaniVersiyon);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sqlKullaniciTablosuOlusturma = "CREATE TABLE " + tablo + " (ID INTEGER PRIMARY KEY AUTOINCREMENT, kAd TEXT,kMail TEXT,kParola TEXT,ktparola TEXT,kctelefonu TEXT )";
        db.execSQL(sqlKullaniciTablosuOlusturma);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + tablo);
    }

    public long ekleKullanici(Kullanıcı kullanici) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("kAd", kullanici.getAdsoyad());
        cv.put("kMail", kullanici.getEmail());
        cv.put("kparola", kullanici.getParola());
        cv.put("ktparola", kullanici.getTparola());
        cv.put("kctelefonu", kullanici.getCtelefonu());
        long id = db.insert(tablo, null, cv);

        return id;

    }
}
