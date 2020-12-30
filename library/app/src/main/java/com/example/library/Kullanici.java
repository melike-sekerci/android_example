package com.example.library;

public class Kullanici {
    private String ad;
    private String mail;
    private String password;
    public Kullanici(String ad,  String mail, String password) {
        this.ad = ad;
        this.mail = mail;
        this.password = password;

    }
    public void setId(int ID) {
        this.ID = ID;
    }

    public Kullanici() {
    }
    public Kullanici(String mail, String password) {
        this.mail = mail;
        this.password = password;
    }


    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    private  int ID;

    public int getId() {
        return ID;
    }



}
