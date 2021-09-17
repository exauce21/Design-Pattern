package com.company;

public class Main {

    public static void main(String[] args) {
	    Adder add = new Adder();
        System.out.println("254 + 113 = "+add.add(254, 113));
        Divider divider = new Divider();
        System.out.println("256 / 8 = "+divider.divide(256, 8));

    }
}
