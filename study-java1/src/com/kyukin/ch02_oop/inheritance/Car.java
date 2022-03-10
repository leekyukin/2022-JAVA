package com.kyukin.ch02_oop.inheritance;

public class Car {
    private String color;
    private String company;
    private int seater;

    public Car() {
        System.out.println("Car constructor");
    }

    public void speedUp() {
        System.out.println("speed 10km/h UP!");
    }

    public void speedDown() {
        System.out.println("speed 10km/h DOWN!");
    }
}
