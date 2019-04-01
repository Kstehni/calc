package com.gmail.stehnii.khrystyna;

public class Operations {
    private String oparation;
    private MyNumber a;
    private MyNumber b;

    public Operations(String oparation, MyNumber a, MyNumber b) {
        this.oparation = oparation;
        this.a = a;
        this.b = b;
    }

    public MyNumber calc() throws Exception {
        if (a.getType() != b.getType()) {
            throw new Exception("Arabic and roman invalid types");
        }
        int result = 0;

        switch (oparation) {
            case "+":
                result = a.getValue() + b.getValue();
                break;
            case "-":
                result = a.getValue() - b.getValue();
                break;
            case "*":
                result = a.getValue() * b.getValue();
                break;
            case "/":
                try {
                    result = a.getValue() / b.getValue();
                } catch (ArithmeticException e) {
                    System.out.println("ArithmeticException: / by zero");
                    throw e;
                }
                break;
            default:
                System.out.println("Invalid operation.");
        }
        return new MyNumber(result, a.getType());
    }

    public void setOparation(String oparation) {
        this.oparation = oparation;
    }

    public void setA(MyNumber a) {
        this.a = a;
    }

    public void setB(MyNumber b) {
        this.b = b;
    }
}

