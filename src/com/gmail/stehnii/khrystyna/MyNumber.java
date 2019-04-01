package com.gmail.stehnii.khrystyna;

public class MyNumber {
    private int value;
    private NumberType type;

    public MyNumber(int value, NumberType type) {
        this.value = value;
        this.type = type;
    }

    public int getValue() {
        return value;
    }

    public NumberType getType() {
        return type;
    }
}
