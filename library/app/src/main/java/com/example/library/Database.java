package com.example.library;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

public class Database extends SQLiteOpenHelper {
    private static final String veritabaniAdi = "bilgiler";
    private static final String tablo = "yenitabloKullanici";
    private static final int veritabaniVersiyon = 2;
    public Database(Context context) {
        super(context, veritabaniAdi, null, veritabaniVersiyon);
    }

    public void onCreate(SQLiteDatabase db) {

        String sqlKullaniciTablosuOlusturma = "CREATE TABLE " + tablo + " (ID INTEGER PRIMARY KEY AUTOINCREMENT, kullaniciAd TEXT,kullaniciMail TEXT,kullaniciPassword TEXT)";
        db.execSQL(sqlKullaniciTablosuOlusturma);
    }

        @Override
        public void onUpgrade (SQLiteDatabase db,int oldVersion, int newVersion){
            db.execSQL("DROP TABLE IF EXISTS " + tablo);
        }
    public long ekleKullanici(Kullanici kullanici) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("kullaniciAd",kullanici.getAd());
        cv.put("kullaniciMail",kullanici.getMail());
        cv.put("kullaniciPassword",kullanici.getPassword());
        long id= db.insert(tablo,null,cv);

        return id;

    }
    public int giris(Kullanici kullanici){
        SQLiteDatabase db =this.getReadableDatabase();
        String sqlSorgusu = "Select * from "+ tablo + " where kullaniciMail = '"+kullanici.getMail()+"' and kullaniciPassword = '"+kullanici.getPassword()+"'";

        Cursor cr =db.rawQuery(sqlSorgusu,null);
        int say=cr.getCount();

        return say;

    }
    public List<Kullanici> listele(){

        SQLiteDatabase db = this.getReadableDatabase();

        String kolonlar[] = {"ID","kullaniciMail","kullaniciParola"};
        List<Kullanici> liste = new ArrayList<Kullanici>();
        Cursor c =db.query("yenitabloKullanici",kolonlar,null,null,null,null,null);
        c.moveToFirst();
        while(!c.isAfterLast()){
            int id =c.getInt(0);
            String mail = c.getString(1);
            String password = c.getString(2);
            Kullanici k =new Kullanici();
            k.setMail(mail);
            k.setPassword(password);
            k.setId(id);
            liste.add(k);
            c.moveToNext();

        }
        c.close();
        return liste;
    }

}
