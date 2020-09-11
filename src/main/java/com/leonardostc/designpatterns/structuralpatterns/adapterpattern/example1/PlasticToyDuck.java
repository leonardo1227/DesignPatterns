package com.leonardostc.designpatterns.structuralpatterns.adapterpattern.example1;

/**
 * @author Leonardo Samuel Tolosa Contreras
 */

public class PlasticToyDuck implements ToyDuck{
    @Override
    public void squeak() {
        System.out.println("Squeak");
    }
}
