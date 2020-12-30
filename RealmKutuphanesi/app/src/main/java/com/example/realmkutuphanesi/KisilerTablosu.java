package com.example.realmkutuphanesi;

import android.content.Intent;

import io.realm.RealmObject;
import io.realm.annotations.RealmClass;

@RealmClass
public class KisilerTablosu extends RealmObject {
    private String kisiİsmi;
    private String soyisim;
    private Integer maas;
    private Integer yas;

    public String getKisiİsmi() {
        return kisiİsmi;
    }

    public void setKisiİsmi(String kisiİsmi) {
        this.kisiİsmi = kisiİsmi;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public Integer getMaas() {
        return maas;
    }

    public void setMaas(Integer maas) {
        this.maas = maas;
    }

    public Integer getYas() {
        return yas;
    }

    public void setYas(Integer yas) {
        this.yas = yas;
    }

    @Override
    public String toString() {
        return "KisilerTablosu{" +
                "kisiİsmi='" + kisiİsmi + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", maas=" + maas +
                ", yas=" + yas +
                '}';
    }
}
