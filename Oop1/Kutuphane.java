package Oop1;

public class Kutuphane 
{
    public static void main(String[] args) 
    {

        Uye u1 = new Uye("Tylor", 28);
        Kitap k1 = new Kitap("Suç ve Ceza", "Dostoyevski", 600);
        Kitap k2 = new Kitap("Karamazov Kardeşler", "Dostoyevski", 500);

        u1.kitapEkle(k1);
        u1.kitapEkle(k2);

        System.out.println(u1.yazdir());
    }
    
}
