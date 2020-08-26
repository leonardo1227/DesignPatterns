package com.leonardostc.designpatterns.creationalpatterns.abstractfactorypattern.example1;

/**
 * @author Leonardo Samuel Tolosa Contreras
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(boolean rounded) {
        if (rounded) {
            return new RoundedShapeFactory();
        } else {
            return new ShapeFactory();
        }
    }
}
