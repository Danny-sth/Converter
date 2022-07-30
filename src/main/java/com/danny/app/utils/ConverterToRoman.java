package com.danny.app.utils;

import java.util.TreeMap;

public abstract class ConverterToRoman {

    protected final TreeMap<Integer, String> intToRomanMap = initializeMap();

    private TreeMap<Integer, String> initializeMap() {

        var tmp = new TreeMap<Integer, String>();
        tmp.put(1000, "M");
        tmp.put(900, "CM");
        tmp.put(500, "D");
        tmp.put(400, "CD");
        tmp.put(100, "C");
        tmp.put(90, "XC");
        tmp.put(50, "L");
        tmp.put(40, "XL");
        tmp.put(10, "X");
        tmp.put(9, "IX");
        tmp.put(5, "V");
        tmp.put(4, "IV");
        tmp.put(1, "I");

        return tmp;
    }

    public abstract String convert(int value);
}



