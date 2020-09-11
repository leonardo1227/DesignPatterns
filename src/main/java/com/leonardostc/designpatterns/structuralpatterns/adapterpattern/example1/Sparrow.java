package com.leonardostc.designpatterns.structuralpatterns.adapterpattern.example1;

/**
 * @author Leonardo Samuel Tolosa Contreras
 */
public class Sparrow implements Bird{

    @Override
    public void fly() {
        System.out.println("Sparrow Flying");
    }

    @Override
    public void makeSound() {
        System.out.println("Chirp Chirp");
    }
}
