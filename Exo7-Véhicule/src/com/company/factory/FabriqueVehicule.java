package com.company.factory;

import com.company.classe.Automobile;
import com.company.classe.Scooter;

public interface FabriqueVehicule {
    Automobile creatAutomobile(String modele, String couleur, String puissance, int espace);
    Scooter creatScooter(String modele, String couleur, String puissance, int espace);
}
