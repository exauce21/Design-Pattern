package com.company;

import com.company.classes.Maison;
import com.company.monteur.MonteurMaison;

public class MaisonDirector {
    public Maison construcHouse(MonteurMaison monteur) {

        Maison maison = monteur.createMaison();
        System.out.println(maison.getRepresentation());

        maison.setEtage(monteur.createEtage());
        System.out.println(maison.getEtage().getRepresentation());

        maison.setMur(monteur.createMurs());
        System.out.println(maison.getMur().getRepresentation());

        maison.setToit(monteur.createToit());
        System.out.println(maison.getToit().getRepresentation());

        return maison;
    }
}
