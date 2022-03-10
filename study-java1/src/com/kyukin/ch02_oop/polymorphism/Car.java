package com.kyukin.ch02_oop.polymorphism;

public class Car {
    private String owner;
    private String color;
    private String company;

    public void start() {
        System.out.println("start");
    }
    public void stop() {
        System.out.println("stop");
    }

    public void
    tankUp(Diesel diesel) {
        System.out.println("Diesel");
    }
    public void tankUp(Gasoline gasoline) {
        System.out.println("Gasoline");
    }
    public void tankUp(LPG lpg) {
        System.out.println("LPG");
    }

}
