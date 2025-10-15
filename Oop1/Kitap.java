package Oop1;

public class Kitap 
{

    private String ad;
    private String yazar;
    private int sayfaSayisi;

    public Kitap (String ad, String yazar, int sayfaSayisi)
    {
        this.ad  = ad;
        this.yazar = yazar;
        this.sayfaSayisi = sayfaSayisi;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getYazar() {
        return yazar;
    }

    public void setYazar(String yazar) {
        this.yazar = yazar;
    }

    public int getSayfaSayisi() {
        return sayfaSayisi;
    }

    public void setSayfaSayisi(int sayfaSayisi) {
        this.sayfaSayisi = sayfaSayisi;
    }

    public String yazdir()
    {
        return  "Kitap adı: " + ad + "Yazarı: " + yazar + "Sayfa sayısı: " + sayfaSayisi;        
    }

    @Override
    public String toString() 
    {
        return "Kitap adı: " + ad + ", Yazarı: " + yazar + ", Sayfa sayısı: " + sayfaSayisi;
    }

    
}
