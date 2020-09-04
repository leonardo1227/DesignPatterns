package com.leonardostc.designpatterns.creationalpatterns.prototypePattern.example2;

/**
 * @author Leonardo Samuel Tolosa Contreras
 */
public class PrototypeDemo {

    public static void main(String[] args) {

        ColorStore.getColor("Blue").addColor();
        ColorStore.getColor("Black").addColor();
        ColorStore.getColor("Blue").addColor();
        ColorStore.getColor("Black").addColor();

    }
}
