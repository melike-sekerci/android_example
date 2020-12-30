package com.example.booking;

public class Kullanıcı {
    private String adsoyad;
    private String email;
    private String parola;
    private String tparola;
    private String ctelefonu;

    public Kullanıcı(String adsoyad, String email, String parola, String tparola, String ctelefonu) {
        this.adsoyad = adsoyad;
        this.email = email;
        this.parola = parola;
        this.tparola = tparola;
        this.ctelefonu = ctelefonu;
    }


    public String getAdsoyad() {
        return adsoyad;
    }

    public void setAdsoyad(String adsoyad) {
        this.adsoyad = adsoyad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public String getTparola() {
        return tparola;
    }

    public void setTparola(String tparola) {
        this.tparola = tparola;
    }

    public String getCtelefonu() {
        return ctelefonu;
    }

    public void setCtelefonu(String ctelefonu) {
        this.ctelefonu = ctelefonu;
    }
}
