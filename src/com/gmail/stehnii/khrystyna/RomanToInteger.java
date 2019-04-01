package com.gmail.stehnii.khrystyna;

public class RomanToInteger {
    private String b;

    public RomanToInteger(String b) {
        this.b = b;
    }

    public int romanToInt() throws Exception {
        int num;

        switch (b) {
            case "I":
                num = 1;
                break;
            case "II":
                num = 2;
                break;
            case "III":
                num = 3;
                break;
            case "IV":
                num = 4;
                break;
            case "V":
                num = 5;
                break;
            case "VI":
                num = 6;
                break;
            case "VII":
                num = 7;
                break;
            case "VIII":
                num = 8;
                break;
            case "IX":
                num = 9;
                break;
            case "X":
                num = 10;
                break;
            default:
                throw new Exception("Not recognized number");
        }
        return num;
    }
}
