package Oop2;

public class Kare extends Cokgen {

    public Kare(int a) {
        // Karenin 4 kenarı eşit
        for (int i = 0; i < 4; i++) {
            addKenar(a);
        }
        alan = a * a;
    }
}
