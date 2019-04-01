package com.gmail.stehnii.khrystyna;

public class NumberParser {

    public static MyNumber parseText(String text) throws Exception {
        MyNumber myNumber;


        try {
            myNumber = new MyNumber(Integer.parseInt(text), NumberType.ARABIC);
        } catch (NumberFormatException e) {
            RomanToInteger rom = new RomanToInteger(text);
            myNumber = new MyNumber(rom.romanToInt(), NumberType.ROMAN);

        }
        return myNumber;
    }

}
