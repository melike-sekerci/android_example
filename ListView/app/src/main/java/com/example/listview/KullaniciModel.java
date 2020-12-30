package com.example.listview;

public class KullaniciModel {
    String isim;
    String yas;
    String soyisim;
    String tuttuguTakım;

    public KullaniciModel(String isim, String yas, String soyisim, String tuttuguTakım) {
        this.isim = isim;
        this.yas = yas;
        this.soyisim = soyisim;
        this.tuttuguTakım = tuttuguTakım;
    }

    public String getIsim() {
        return isim;
    }
    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getYas() {
        return yas;
    }
    public void setYas(String yas) {
        this.yas = yas;
    }
    public String getSoyisim() {
        return soyisim;
    }
    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public String getTuttuguTakım() {
        return tuttuguTakım;
    }
    public void setTuttuguTakım(String tuttuguTakım) {
        this.tuttuguTakım = tuttuguTakım;
    }
}
