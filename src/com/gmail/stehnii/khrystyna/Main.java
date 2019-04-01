package com.gmail.stehnii.khrystyna;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        MyNumber arg1;
        MyNumber arg2;
        String operation;

        System.out.println("Please input first number and press Enter");
        arg1 = NumberParser.parseText(sc.next());

        System.out.println("Please enter an action and press Enter");
        operation = sc.next();

        System.out.println("Please enter second number and press Enter");
        arg2 = NumberParser.parseText(sc.next());

        Operations action = new Operations(operation, arg1, arg2);
        MyNumber lastResult = action.calc();
        System.out.println("Result = " + lastResult.getValue());

        System.out.println("Do you want to continue? If yes, please write true, if no write false and press Enter.");
        boolean goForward = sc.nextBoolean();

        while (goForward) {
            System.out.println("Please enter next action and press Enter");
            action.setOparation(sc.next());
            System.out.println("Please enter next number and press Enter");
            arg2 = NumberParser.parseText(sc.next());
            action.setA(lastResult);
            action.setB(arg2);
            lastResult = action.calc();
            System.out.println("Result = " + lastResult.getValue());
            System.out.println("Do you want to continue?");
            goForward = sc.nextBoolean();
        }
    }
}




