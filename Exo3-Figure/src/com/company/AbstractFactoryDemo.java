package com.company;
import com.company.couleur.Couleur;
import com.company.figure.Figure;

public class AbstractFactoryDemo {

    public static void main(String[] args) {
      
     //get figure factory
      AbstractFactory figureFactory = FactoryProducer.getFactory("figure");

      //dessiner rectangle
      Figure figure1 = (Figure) figureFactory.getProduct("rectangle");
      figure1.dessiner();


       //get couleur factory
      AbstractFactory couleurFactory = FactoryProducer.getFactory("couleur");
      //prendre  couleur
      Couleur couleur1 = (Couleur) couleurFactory.getProduct("rouge");
      couleur1.remplir();
    }
}
