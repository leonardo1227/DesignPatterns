package com.leonardostc.designpatterns.creationalpatterns.factorymethodpattern.example1;

/**
 * @author Leonardo Samuel Tolosa Contreras
 */
public class Square implements Shape{

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
