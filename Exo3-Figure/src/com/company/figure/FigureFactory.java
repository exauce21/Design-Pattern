/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.figure;

import com.company.AbstractFactory;

public class FigureFactory implements AbstractFactory<Figure> {
    @Override
    public Figure getProduct(String typeFigure) {
    if (typeFigure.equalsIgnoreCase("CERCLE")) {
            return new Cercle();

        } else if (typeFigure.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();

        } else if (typeFigure.equalsIgnoreCase("CARRE")) {
            return new Carre();
        }

        return null;
    }
}
