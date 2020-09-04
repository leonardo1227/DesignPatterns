package com.leonardostc.designpatterns.creationalpatterns.prototypePattern.example2;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Leonardo Samuel Tolosa Contreras
 */
public class ColorStore {

    private static Map<String,Color> colorMap = new HashMap<>();

    static {
        colorMap.put("Blue",new BlueColor());
        colorMap.put("Black", new BlackColor());
    }

    public static Color getColor(String colorName){
        return (Color) colorMap.get(colorName).clone();
    }
}
