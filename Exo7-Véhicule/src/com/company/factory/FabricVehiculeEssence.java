package com.company.factory;

import com.company.classe.Automobile;
import com.company.classe.AutomobileElectricite;
import com.company.classe.Scooter;
import com.company.classe.ScooterElectricite;

public class FabricVehiculeEssence implements FabriqueVehicule{
    @Override
    public Automobile creatAutomobile(String modele, String couleur, String puissance, int espace) {
        return new AutomobileElectricite(modele, couleur, puissance, espace);
    }

    @Override
    public Scooter creatScooter(String modele, String couleur, String puissance, int espace) {
        return new ScooterElectricite(modele, couleur, puissance, espace);
    }
}
