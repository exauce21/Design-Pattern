package com.company;

public class CompteBancaire {

    private int numerocompte;
    private double solde;

    public CompteBancaire(int numerocpt)
    {
        this.numerocompte=numerocpt;
        this.solde=0.0;
    }

    public void deposerArgent(double depot)
    {
        if(depot>0.0){
            solde+=depot;
            Journalisation.getInstance().ajouterLog("Dépôt de: "+depot+" sur le compte: "+numerocompte+".");
        }else{
            Journalisation.getInstance().ajouterLog("Le solde est négative impossible");
        }
    }

    public void retirerArgent(double retrait)
    {
        if(retrait>0.0){
            if(solde>=retrait){
                solde-=retrait;
                Journalisation.getInstance().ajouterLog("Retrait de: "+retrait+" sur le compte: "+numerocompte+".");
            }else{
                Journalisation.getInstance().ajouterLog("La banque n'autorise pas de découvert");
            }
        }else{
            Journalisation.getInstance().ajouterLog("Rerait d'un solde négative impossible");
        }
    }
}
