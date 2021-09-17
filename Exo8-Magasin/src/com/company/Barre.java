package com.company;

public class Barre implements Produit {
    private float prix = 0;
    private String descriptif;
    private float longueur;

    public Barre() {

    }

    public void setDescriptif(String descriptif) {
        this.descriptif = descriptif;
    }

    public float getLongueur() {
        return this.longueur;
    }

    public void setLongueur(float longueur) {
        this.longueur = longueur;
    }

    @Override
    public float getPrix() {
        return prix;
    }

    @Override
    public String getDescriptif() {
        return descriptif;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }


}
