package com.leonardostc.designpatterns.creationalpatterns.builderpattern.example1;

/**
 * @author Leonardo Samuel Tolosa Contreras
 */
public interface HousePlan {

    void setBasement(String basement);

    void setStructure(String structure);

    void setRoof(String roof);

    void setInterior(String interior);

}
