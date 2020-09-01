package com.leonardostc.designpatterns.creationalpatterns.builderpattern.example1;

/**
 * @author Leonardo Samuel Tolosa Contreras
 */
public class BuilderDemo {

    public static void main(String[] args) {

        HouseBuilder iglooBuilder = new IglooHouseBuilder();
        CivilEngineer engineer = new CivilEngineer(iglooBuilder);

        engineer.constructHouse();

        House house = engineer.getHouse();

        System.out.println("Builder constructed: "+house);

    }
}
