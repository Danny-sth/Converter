package com.danny.app.utils.impl;

import com.danny.app.utils.ConverterToRoman;

public class ConverterIntegerToRoman extends ConverterToRoman {

    @Override
    public String convert(int value) {

        StringBuilder result = new StringBuilder();

        for (var key : intToRomanMap.descendingKeySet()) {
            while (value >= key) {
                value -= key;
                result.append(intToRomanMap.get(key));
            }
        }
        return result.toString();
    }
}
