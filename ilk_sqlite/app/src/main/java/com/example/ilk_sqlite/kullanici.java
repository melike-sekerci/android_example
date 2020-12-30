package com.example.ilk_sqlite;

public class kullanici { // geçici kullanıcı
    String isim;
    int id;

    public kullanici(String isim, int id) {
        this.isim = isim;
        this.id = id;
    }

    @Override
    public String toString() {
        return "kullanici{" +
                "isim='" + isim + '\'' +
                ", id=" + id +
                '}';
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
