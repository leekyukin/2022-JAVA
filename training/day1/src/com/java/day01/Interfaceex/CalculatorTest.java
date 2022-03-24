package com.java.day01.Interfaceex;

public class CalculatorTest {
    public static void main(String[] args) {

        int n1 = 10;
        int n2 = 5;

        ComplateCalc calc = new ComplateCalc();
        System.out.println(calc.add(n1, n2));
        System.out.println(calc.subtract(n1, n2));
        System.out.println(calc.times(n1, n2));
        System.out.println(calc.divide(n1, n2));
    }
}
