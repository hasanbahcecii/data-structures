package Oop;

public class Banka 
{
    public static void main(String[] args) 
    {
        Musteri mus1 = new Musteri("Hasan", "Bahçeci", 22);
        BankaHesabi hesap1 = new BankaHesabi("TR00 0000 0000 0001" , 1500);
        
        mus1.setHesap(hesap1);

        System.out.println(mus1.yazdir());

        hesap1.paraYatir(500);
        hesap1.paraCek(300);
        hesap1.paraCek(5000);

        System.out.println("Güncel Hesap Bilgileri: ");
        System.out.println(mus1.getHesap().yazdir());
    }
}
