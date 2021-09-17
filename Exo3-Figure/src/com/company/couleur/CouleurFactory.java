/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.company.couleur;

import com.company.AbstractFactory;

public class CouleurFactory implements AbstractFactory<Couleur> {
 @Override
 public Couleur getProduct(String typeCouleur){
     
      if(typeCouleur.equalsIgnoreCase("ROUGE")){
         return new Rouge();
         
      } else if(typeCouleur.equalsIgnoreCase("JAUNE")){
         return new Jaune();
         
      } else if(typeCouleur.equalsIgnoreCase("VERT")){
         return new Vert();
      }
      
      return null;
   }
}
