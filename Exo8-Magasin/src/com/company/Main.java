package com.company;

public class Main {

    public static void main(String[] args) {
        Barre barre = new Barre();
        barre.setPrix(25f);
        barre.setDescriptif("01PROD-SN");
        barre.setLongueur(2900);

        Poids leger = new Poids();
        leger.setPrix(1300);
        leger.setDescriptif("Poids leger");
        leger.setPoids(2);

        Poids moyen = new Poids();
        moyen.setPrix(2600);
        moyen.setDescriptif("Poids moyen");
        moyen.setPoids(4);

        Poids lourd = new Poids();
        lourd.setPrix(3900);
        lourd.setDescriptif("Poids lourd");
        lourd.setPoids(8);

        ProduitComposite haltere = new ProduitComposite();
        haltere.ajouter(barre);
        haltere. ajouter (leger);
        haltere. ajouter (moyen);
        haltere. ajouter (lourd);

    }
}
