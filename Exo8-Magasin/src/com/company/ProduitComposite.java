package com.company;

import java.util.ArrayList;
import java.util.Iterator;

public class ProduitComposite implements Produit{
    private ArrayList<Produit> altere = new ArrayList<Produit>();
    private String libelle;

    public void ajouter( Produit produit) {
        altere.add(produit);
    }

    public void remove(Produit produit) {
        if ( altere.contains(produit)) {
            altere.remove(produit);
        }
    }

    @Override
    public float getPrix() {
        float result = 0;
        for (Produit produit : altere ) {
            result += produit.getPrix();
        }
        result = (result * 10)/100;
        return result;
    }

    @Override
    public String getDescriptif() {
        StringBuffer result = new StringBuffer();
        result.append(libelle);
        result.append(" : (");

        for (Produit produit : altere ) {
            result.append(produit.getDescriptif());
        }
        result.append(" )");
        return result.toString();
    }
}
