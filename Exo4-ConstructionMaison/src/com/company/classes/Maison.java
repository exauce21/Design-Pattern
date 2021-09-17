package com.company.classes;

public abstract class Maison {
    protected Etage etage;
    protected Murs mur;
    protected Toit toit;

    public Etage getEtage() {
        return etage;
    }

    public void setEtage(Etage etage) {
        this.etage = etage;
    }

    public Murs getMur() {
        return mur;
    }

    public void setMur(Murs mur) {
        this.mur = mur;
    }

    public Toit getToit() {
        return toit;
    }

    public void setToit(Toit toit) {
        this.toit = toit;
    }

    public abstract String getRepresentation();

}
