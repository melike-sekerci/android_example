package com.example.musteriapplication;

public class Musteri {
    String id;
    String ad;
    String adres;

    public Musteri(String ad, String adres) {

        this.ad = ad;
        this.adres = adres;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }
}
