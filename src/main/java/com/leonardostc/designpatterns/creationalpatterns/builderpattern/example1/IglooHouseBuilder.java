package com.leonardostc.designpatterns.creationalpatterns.builderpattern.example1;

/**
 * @author Leonardo Samuel Tolosa Contreras
 */
public class IglooHouseBuilder implements HouseBuilder{

    private House house;

    public IglooHouseBuilder() {
        this.house = new House();
    }

    @Override
    public void buildBasement() {
        house.setBasement("Ice Bars");
    }

    @Override
    public void buildStructure() {
        house.setStructure("Ice Blocks");
    }

    @Override
    public void buildInterior() {
        house.setInterior("Ice Carvings");
    }

    @Override
    public void buildRoof() {
        house.setRoof("Ice Dome");
    }

    @Override
    public House getHouse() {
        return this.house;
    }
}
