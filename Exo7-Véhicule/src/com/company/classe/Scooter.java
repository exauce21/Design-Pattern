package com.company.classe;

public abstract class Scooter {
    public String modele;
    public String couleur;
    public String puissance;
    public int espace;

    public abstract void afficherCaracteristique();

    public Scooter(String modele, String couleur, String puissance, int espace) {
        this.modele = modele;
        this.couleur = couleur;
        this.puissance = puissance;
        this.espace = espace;
    }
}
