package com.java.day01.abstractex;

public abstract class Computer {

    public abstract void display();
    public abstract void typing();

    public void turnOn() {
        System.out.println("TurnOn");
    }

    public void turnOff() {
        System.out.println("TurnOff");
    }
}
