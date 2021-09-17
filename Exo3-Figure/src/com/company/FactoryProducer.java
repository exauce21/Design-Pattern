/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.company;

import com.company.couleur.CouleurFactory;
import com.company.figure.FigureFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String typeFactory){   
      if(typeFactory.equalsIgnoreCase("FIGURE")){
         return new FigureFactory();
      }else if(typeFactory.equalsIgnoreCase("COULEUR")){
         return new CouleurFactory();
      }
      
      return null;
   }
}
