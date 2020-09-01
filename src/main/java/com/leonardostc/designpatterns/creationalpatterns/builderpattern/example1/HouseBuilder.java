package com.leonardostc.designpatterns.creationalpatterns.builderpattern.example1;

/**
 * @author Leonardo Samuel Tolosa Contreras
 */
public interface HouseBuilder {

    void buildBasement();
    void buildStructure();
    void buildInterior();
    void buildRoof();
    House getHouse();

}
