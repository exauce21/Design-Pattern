package com.company.monteur;

import com.company.classes.Etage;
import com.company.classes.Maison;
import com.company.classes.Murs;
import com.company.classes.Toit;
import com.company.typeConstruction.EtageBois;
import com.company.typeConstruction.MaisonBois;
import com.company.typeConstruction.MursBois;
import com.company.typeConstruction.ToitBois;

public class MonteurBois extends MonteurMaison {

    @Override
    public Maison createMaison() {
        maison = new MaisonBois();
        return maison;
    }

    @Override
    public Etage createEtage() {
        etage = new EtageBois();
        return etage;
    }

    @Override
    public Murs createMurs() {
        murs = new MursBois();
        return murs;
    }

    @Override
    public Toit createToit() {
        toit = new ToitBois();
        return toit;
    }
}
