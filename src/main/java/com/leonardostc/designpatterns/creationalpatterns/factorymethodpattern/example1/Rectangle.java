package com.leonardostc.designpatterns.creationalpatterns.factorymethodpattern.example1;

/**
 * @author Leonardo Samuel Tolosa Contreras
 */
public class Rectangle implements Shape{

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.S");
    }
}
