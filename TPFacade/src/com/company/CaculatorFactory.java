package com.company;

public class CaculatorFactory {
    public CalculatorFacade getCalculator(){
        return new CalculatorFacade(new Adder(), new Subtrator(), new Multiplier(), new Divider());
    }
}
