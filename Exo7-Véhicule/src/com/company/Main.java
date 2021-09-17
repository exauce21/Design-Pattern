package com.company;

import com.company.classe.Automobile;
import com.company.classe.AutomobileElectricite;
import com.company.classe.AutomobileEssence;
import com.company.classe.Scooter;
import com.company.factory.FabricVehiculeEssence;
import com.company.factory.FabriqueVehiculeElectricite;

public class Main {

    public static void main(String[] args) {
        FabricVehiculeEssence fabricVehiculeEssence = new FabricVehiculeEssence();
        FabriqueVehiculeElectricite fabriqueVehiculeElectricite = new FabriqueVehiculeElectricite();

        Automobile autoEss = fabricVehiculeEssence.creatAutomobile("Nissan", "Blanc", "2000CV", 5);
        autoEss.afficherCaracteristique();
        Scooter scooterEss  = fabricVehiculeEssence.creatScooter("Yamaha", "Noir", "4500JS", 2);
        scooterEss.afficherCaracteristique();


        Automobile autoElec = fabriqueVehiculeElectricite.creatAutomobile("BMW", "Bleu", "1000OP", 4);
        autoElec.afficherCaracteristique();
        Scooter scooterElec = fabriqueVehiculeElectricite.creatScooter("Honda", "Gris", "5100XD", 1);
        scooterElec.afficherCaracteristique();
    }
}
