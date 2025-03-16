package net.ma.presentation;

import net.ma.ext.DaoImplV2;
import net.ma.metier.MetierImpl;

public class Pres1 {
    public static void main(String[] args) {
        DaoImplV2 dao = new DaoImplV2();
        MetierImpl metier = new MetierImpl(dao);
        //metier.setiDao(dao);

        System.out.println( metier.calcul());
    }
}
