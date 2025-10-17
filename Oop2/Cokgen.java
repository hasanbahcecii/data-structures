package Oop2;

import java.util.ArrayList;

public class Cokgen {
    protected ArrayList<Integer> kenarlar = new ArrayList<>();
    protected int cevre = 0;
    protected double alan = 0;

    public void addKenar(int uzunluk) {
        kenarlar.add(uzunluk);
        hesaplaCevre();
    }

    protected void hesaplaCevre() {
        cevre = 0;
        for (int k : kenarlar) {
            cevre += k;
        }
    }

    public int getCevre() {
        return cevre;
    }

    public double getAlan() {
        return alan;
    }
}
