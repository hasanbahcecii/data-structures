package Oop1;

import java.util.ArrayList;
import java.util.List;

public class Uye 
{
    private String ad;
    private int yas;
    private List <Kitap> oduncListesi;

    public Uye (String ad, int yas)
    {
        this.ad = ad;
        this.yas = yas;
        this.oduncListesi = new ArrayList<>();
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public List<Kitap> getOduncListesi() {
        return oduncListesi;
    }

    public void setOduncListesi(List<Kitap> oduncListesi) {
        this.oduncListesi = oduncListesi;
    }


    public Boolean kitapEkle(Kitap k)
    {
        return oduncListesi.add(k);
    }

    public Boolean kitapIade(String kitapAdi)
    {
        for(Kitap k : oduncListesi)
        {
            if(k.getAd().equalsIgnoreCase(kitapAdi))
            {
                return true;
            }
        }
        return false;
    }

    public int kitapSayisi()
    {
        return oduncListesi.size();
    }

    public String yazdir()
    {
        return "Üye adı: " + ad + " Yaşı: " + yas + " Ödünç alınan kitap listesi: " + oduncListesi;
    }
}
