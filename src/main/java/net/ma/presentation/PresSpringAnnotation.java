package net.ma.presentation;

import net.ma.metier.IMetier;
import net.ma.metier.MetierImpl;

public class PresAnnotation {
    public static void main(String[] args) {
        IMetier metier = new MetierImpl();
        double calcul = metier.calcul();
        System.out.println(calcul);

    }
}
