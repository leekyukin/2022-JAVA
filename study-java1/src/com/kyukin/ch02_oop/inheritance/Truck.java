package com.kyukin.ch02_oop.inheritance;

public class Truck extends Car {
    public Truck () {
        System.out.println("Truck constructor");
    }

    @Override
    public void speedUp() {
        System.out.println("speed 5km/h UP!");
    }

    @Override
    public void speedDown() {
        System.out.println("speed 5km/h DOWN!");
    }
}
