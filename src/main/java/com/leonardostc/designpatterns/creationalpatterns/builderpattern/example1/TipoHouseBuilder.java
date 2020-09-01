package com.leonardostc.designpatterns.creationalpatterns.builderpattern.example1;

/**
 * @author Leonardo Samuel Tolosa Contreras
 */
public class TipoHouseBuilder implements HouseBuilder{

    private House house;

    public TipoHouseBuilder() {
        this.house = new House();
    }

    @Override
    public void buildBasement() {
        house.setBasement("Wooden Poles");
    }

    @Override
    public void buildStructure() {
        house.setStructure("Wood and Ice");
    }

    @Override
    public void buildInterior() {
        house.setInterior("Fire Wood");
    }

    @Override
    public void buildRoof() {
        house.setRoof("Wood, caribou and seal skins");
    }

    @Override
    public House getHouse() {
        return this.house;
    }
}
