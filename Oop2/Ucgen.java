package Oop2;

public class Ucgen extends Cokgen {

    public Ucgen(int a, int b, int c) {
        addKenar(a);
        addKenar(b);
        addKenar(c);

        // Heron formülü ile alan hesaplama
        double s = cevre / 2.0;
        alan = Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
