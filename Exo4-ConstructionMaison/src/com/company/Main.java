package com.company;

import com.company.classes.Maison;
import com.company.monteur.MonteurBois;
import com.company.monteur.MonteurBeton;
import com.company.monteur.MonteurMaison;

public class Main {

    public static void main(String[] args) {
        MaisonDirector director = new MaisonDirector();
        MonteurMaison monteurBois = new MonteurBois();
        MonteurBeton monteurBeton = new MonteurBeton();

        Maison maisonBois = director.construcHouse(monteurBois);
        System.out.println();

        Maison maisonBriques = director.construcHouse(monteurBeton);
    }
}
