package com.company;

public class Poids implements Produit{
    private float poids = 0;
    private float prix = 0;
    private String descriptif;

    public Poids() {

    }

    public float getPoids() {
        return poids;
    }

    public void setPoids(float poids) {
        this.poids = poids;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public void setDescriptif(String descriptif) {
        this.descriptif = descriptif;
    }

    @Override
    public float getPrix() {
        return prix;
    }

    @Override
    public String getDescriptif() {
        return descriptif;
    }
}
