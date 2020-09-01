package com.leonardostc.designpatterns.creationalpatterns.builderpattern.example1;

/**
 * @author Leonardo Samuel Tolosa Contreras
 */
public class CivilEngineer {

    private HouseBuilder houseBuilder;

    public CivilEngineer(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public House getHouse(){
        return this.houseBuilder.getHouse();
    }

    public void constructHouse(){
        this.houseBuilder.buildBasement();
        this.houseBuilder.buildStructure();
        this.houseBuilder.buildRoof();
        this.houseBuilder.buildInterior();
    }
}
