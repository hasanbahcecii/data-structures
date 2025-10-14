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
        if(tutar >= 0)
        {
            bakiye += tutar;
            System.out.println(tutar + " para yatırıldı. Yeni bakiye: " + bakiye);            
        }
        else
        System.out.println("Tutar pozitif olmalıdır.");
    }


        public void paraCek(double tutar)
    {
        if(tutar >= 0 && bakiye >= tutar)
        {
        bakiye -= tutar;
        System.out.println(tutar + " kadar para çekildi. Kalan bakiye: " + bakiye);
        }
        else if(tutar > bakiye)
        System.out.println("Yetersiz bakiye.");
        else
        System.out.println("Tutar geçerli değil.");
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {

        if(bakiye >= 0)
        this.iban = iban;
        else
        System.out.println("Bakiye negatif olamaz!");
    }

    public double getBakiye() {
        return bakiye;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }


        public String yazdir()
    {
        return  "IBAN: " + iban + " Bakiye: " + bakiye + " TL";
    }



}
