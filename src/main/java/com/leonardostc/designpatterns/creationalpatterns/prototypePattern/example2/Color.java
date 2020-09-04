package com.leonardostc.designpatterns.creationalpatterns.prototypePattern.example2;

/**
 * @author Leonardo Samuel Tolosa Contreras
 */
public abstract class Color implements Cloneable{

    protected String colorName;

    abstract void addColor();

    public Object clone(){
        Object clone = null;
        try{
            clone = super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return clone;
    }
}
