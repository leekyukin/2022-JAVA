package com.java.day01.template;

public abstract class Car {

    public abstract void drive();
    public abstract void stop();

    public void startCar() {
        System.out.println("시동을 건다.");
    }
    public void turnOff() {
        System.out.println("시동을 끈다");
    }
    final public void run() {
        startCar();
        drive();
        startCar();
        turnOff();
    }
}
