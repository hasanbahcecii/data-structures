package Oop2;

public class Main {

    public static void main(String[] args) {
        // Test your classes here
        Kare kare = new Kare(5);
        Ucgen ucgen = new Ucgen(3, 4, 5);

        System.out.println("Karenin çevresi: " + kare.getCevre());
        System.out.println("Karenin alanı: " + kare.getAlan());

        System.out.println("Üçgenin çevresi: " + ucgen.getCevre());
        System.out.println("Üçgenin alanı: " + ucgen.getAlan());
    }
}
