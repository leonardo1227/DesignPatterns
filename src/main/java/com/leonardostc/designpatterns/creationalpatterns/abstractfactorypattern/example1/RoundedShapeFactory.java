package com.leonardostc.designpatterns.creationalpatterns.abstractfactorypattern.example1;

/**
 * @author Leonardo Samuel Tolosa Contreras
 */
public class RoundedShapeFactory extends AbstractFactory {
    Shape getShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new RoundedRectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new RoundedSquare();
        }
        return null;
    }
}
