package com.example.whatsapp;

public class mesajModel {
    private String mesajİcerik;
    private String kisi;
    private int resimid;

    public mesajModel(String mesajİcerik, String kisi, int resimid) {
        this.mesajİcerik = mesajİcerik;
        this.kisi = kisi;
        this.resimid = resimid;
    }

    public String getMesajİcerik() {
        return mesajİcerik;
    }

    public void setMesajİcerik(String mesajİcerik) {
        this.mesajİcerik = mesajİcerik;
    }

    public String getKisi() {
        return kisi;
    }

    public void setKisi(String kisi) {
        this.kisi = kisi;
    }

    public int getResimid() {
        return resimid;
    }

    public void setResimid(int resimid) {
        this.resimid = resimid;
    }
}
