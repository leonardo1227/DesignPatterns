package com.leonardostc.designpatterns.creationalpatterns.abstractfactorypattern.example1;

/**
 * @author Leonardo Samuel Tolosa Contreras
 */
public abstract class AbstractFactory {
    abstract Shape getShape(String shapeType);
}
