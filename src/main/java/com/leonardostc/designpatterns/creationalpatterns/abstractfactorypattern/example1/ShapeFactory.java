package com.leonardostc.designpatterns.creationalpatterns.abstractfactorypattern.example1;

/**
 * @author Leonardo Samuel Tolosa Contreras
 */

public class ShapeFactory extends AbstractFactory{
    Shape getShape(String shapeType) {
        if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}
