package com.leonardostc.designpatterns.creationalpatterns.factorymethodpattern.example1;

/**
 * @author Leonardo Samuel Tolosa Contreras
 */
public class ShapeFactory {

    public Shape getShape(String shapeType){
        Shape shape;

        switch (shapeType){
            case "CIRCLE":
                shape = new Circle();
                break;
            case "RECTANGLE":
                shape = new Rectangle();
                break;
            case "SQUARE":
                shape = new Square();
                break;
            default:
                shape = null;
        }
        return shape;
    }
}
