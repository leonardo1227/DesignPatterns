package com.leonardostc.designpatterns.creationalpatterns.abstractfactorypattern.example1;

/**
 * @author Leonardo Samuel Tolosa Contreras
 */
public class AbstractFactoryPatternDemo {

    public static void main(String[] args) {

        //Gets Shape Factory
        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);

        Shape shape1 = getRectangle(shapeFactory);
        shape1.draw();

        Shape shape2 = getSquare(shapeFactory);
        shape2.draw();

        //Gets Rounded Shape Factory
        AbstractFactory rounderShapeFactory = FactoryProducer.getFactory(true);

        Shape shape3 = getRectangle(rounderShapeFactory);
        shape3.draw();

        Shape shape4 = getSquare(rounderShapeFactory);
        shape4.draw();
    }

    private static Shape getRectangle(AbstractFactory factory){
        return factory.getShape("RECTANGLE");
    }

    private static Shape getSquare(AbstractFactory factory){
        return factory.getShape("SQUARE");
    }
}
