package Oop;

public class BankaHesabi {
    
    private String iban;
    private double bakiye;

    public BankaHesabi(String iban, double bakiye)
    {
        this.iban = iban;
        this.bakiye = bakiye;
    }


    public void paraYatir(double tutar)
    {
        bakiye = bakiye + tutar;
    }


        public void paraCek(double tutar)
    {
        if(tutar > bakiye)
        System.out.println("Bakiyeniz yetersiz!");
        else
        bakiye = bakiye - tutar;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public double getBakiye() {
        return bakiye;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }


        public String yazdir(String iban, double bakiye)
    {
        return  "IBAN: " + iban + "Bakiye: " + bakiye;
    }



}
