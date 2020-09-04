package com.leonardostc.designpatterns.creationalpatterns.prototypePattern.example2;

/**
 * @author Leonardo Samuel Tolosa Contreras
 */
public class BlueColor extends Color{

    public BlueColor() {
        this.colorName = "Blue";
    }

    @Override
    void addColor() {
        System.out.println("Blue color added!");
    }
}
