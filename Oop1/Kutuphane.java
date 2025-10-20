package Oop1;

public class Kutuphane 
{
    public static void main(String[] args) 
    {

        Uye u1 = new Uye("Tylor", 28);
        Kitap k1 = new Kitap("Suç ve Ceza", "Fyodor Dostoyevski", 688);
        Kitap k2 = new Kitap("Karamazov Kardeşler", "Fyodor Dostoyevski", 1040);

        u1.kitapEkle(k1);
        u1.kitapEkle(k2);

        System.out.println(u1.yazdir());


        // Deep copy
        Kitap k3 = new Kitap(null, null, 0);

        String tempAd = k1.getAd();
        k3.setAd(tempAd);

        String tempYazar = k1.getYazar();
        k3.setYazar(tempYazar);

        int tempSayfaSayisi = k1.getSayfaSayisi();
        k3.setSayfaSayisi(tempSayfaSayisi);

        k1.setAd("İnsan Ne ile Yaşar?");
        k1.setYazar("Leo Tolstoy");
        k1.setSayfaSayisi(112);
        System.out.println(k1); // Kitap adı: İnsan Ne ile Yaşar?, Yazarı: Tolstoy, Sayfa sayısı: 112
        System.out.println(k3); // k3 not effected



    }
    
}
