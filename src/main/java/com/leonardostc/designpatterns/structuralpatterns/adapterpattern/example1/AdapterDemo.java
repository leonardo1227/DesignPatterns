package com.leonardostc.designpatterns.structuralpatterns.adapterpattern.example1;

/**
 * @author Leonardo Samuel Tolosa Contreras
 */
public class AdapterDemo {

    public static void main(String[] args) {

        Sparrow sparrow = new Sparrow();
        ToyDuck toyDuck = new PlasticToyDuck();


        ToyDuck birdAdapter = new BirdAdapter(sparrow);

        System.out.println("Sparrow");
        sparrow.fly();
        sparrow.makeSound();


        System.out.println("Toy Duck");
        toyDuck.squeak();

        System.out.println("BirdAdapter");
        birdAdapter.squeak();
    }
}
