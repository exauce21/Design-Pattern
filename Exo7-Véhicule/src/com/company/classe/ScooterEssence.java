package com.company.classe;

import java.util.Date;

public class ScooterEssence extends Scooter{

    public ScooterEssence(String modele, String couleur, String puissance, int espace) {
        super(modele, couleur, puissance, espace);
    }

    @Override
    public void afficherCaracteristique(){
        System.out.println("CARACTERISTIQUE");
        System.out.println("Modèle: "+modele+" Couleur: "+couleur+" Puissance: "+puissance+" Espace: "+espace);
    }
}
