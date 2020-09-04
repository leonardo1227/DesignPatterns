package com.leonardostc.designpatterns.creationalpatterns.prototypePattern.example2;

/**
 * @author Leonardo Samuel Tolosa Contreras
 */
public class BlackColor extends Color{

    public BlackColor() {
        this.colorName = "Black";
    }

    @Override
    void addColor() {
        System.out.println("Black color added!");
    }
}
