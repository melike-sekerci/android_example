package com.example.ilk_sqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class sqlite_katmani extends SQLiteOpenHelper { // Bizim oluşturduğumuz veri tabanı ya da versiyon yükseltmek
    public sqlite_katmani(Context c) {
        super(c, "kullanici", null, 1);

    }

    public void onCreate(SQLiteDatabase db) {
        String sql = "create table kullanici(id integer primary key autoincrement" +
                ",isim text not null)";
        db.execSQL(sql);

    }

    public void onUpgrade(SQLiteDatabase db, int eski, int yeni) {
        db.execSQL("drop table if exists kullanici");
    }
}

