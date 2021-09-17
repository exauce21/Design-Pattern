package com.company.monteur;

import com.company.classes.Etage;
import com.company.classes.Maison;
import com.company.classes.Murs;
import com.company.classes.Toit;

public abstract class MonteurMaison {
    protected Maison maison;
    protected Etage etage;
    protected Murs murs;
    protected Toit toit;

    public abstract Maison createMaison();
    public abstract Etage createEtage();
    public abstract Murs createMurs();
    public abstract Toit createToit();
}
