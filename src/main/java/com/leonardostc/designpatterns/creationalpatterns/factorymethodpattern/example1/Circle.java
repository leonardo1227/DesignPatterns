package com.leonardostc.designpatterns.creationalpatterns.factorymethodpattern.example1;

/**
 * @author Leonardo Samuel Tolosa Contreras
 */
public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
