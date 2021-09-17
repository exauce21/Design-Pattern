package com.company;

import java.util.List;

public class CalculatorFacade {

    Adder adder;
    Subtrator subtrato;
    Multiplier multiplier;
    Divider divider;
    String operator;

    public CalculatorFacade(Adder adder, Subtrator subtrato, Multiplier multiplier, Divider divider) {
        this.adder = adder;
        this.subtrato = subtrato;
        this.multiplier = multiplier;
        this.divider = divider;
    }

    public int calculator(String expression){

       // List<> = expl

        switch (operator){
            case "+" :
                return this.adder.add(126, 98);
                break;
            case "-" :
                return this.subtrato.subtrat(126, 98);;
            break;
            case "*" :
                return this.multiplier.multiplier(239, 8);;
            break;
            case "/" :
                return this.divider.divide(56, 2);; 
            break;
        }
    }
}
