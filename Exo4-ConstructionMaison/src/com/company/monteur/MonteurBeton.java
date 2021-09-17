package com.company.monteur;

import com.company.classes.Etage;
import com.company.classes.Maison;
import com.company.classes.Murs;
import com.company.classes.Toit;
import com.company.typeConstruction.*;

public class MonteurBeton extends MonteurMaison {
    @Override
    public Maison createMaison() {
        maison = new MaisonBeton();
        return maison;
    }

    @Override
    public Etage createEtage() {
        etage = new EtageBeton();
        return etage;
    }

    @Override
    public Murs createMurs() {
        murs = new MursBeton();
        return murs;
    }

    @Override
    public Toit createToit() {
        toit = new ToitBeton();
        return toit;
    }
}
