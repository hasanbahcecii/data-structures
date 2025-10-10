package Oop;
public class Musteri {

    private String ad;
    private String soyad;
    private int yas;
    private BankaHesabi hesap;

    public Musteri(String ad, String soyad, int yas) 
    {
        this.ad = ad;
        this.soyad = soyad;
        this.yas = yas;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        if ( yas > 0)
        this.yas = yas;

        else 
        System.out.println("Yaş pozitif olmalı!!!");
    }

    public BankaHesabi getHesap() {
        return hesap;
    }

    public void setHesap(BankaHesabi hesap) {
        this.hesap = hesap;
    }


    public String yazdir()
    {
        return "Musteri: " + ad + " " + soyad + "Yaş: " + yas + "Hesap: " + hesap;
    }


}
