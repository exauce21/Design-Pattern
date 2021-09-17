package com.company;

public class Main {

    public static void main(String[] args) {

        CompteBancaire cb1 = new CompteBancaire(2073812090);
        cb1.deposerArgent(200000);
        cb1.retirerArgent(10000);

        CompteBancaire cb2 = new CompteBancaire(03732321);
        cb2.deposerArgent(-800000);
        cb2.retirerArgent(90000);

        String s = Journalisation.getInstance().afficherLog();
        System.out.println(s);
    }
}
