package com.java.day01.abstractex;

public class ComputerTest {

    public static void main(String[] args) {
        // Computer c1 = new Computer();

        Computer c2 = new DeskTop();
        Computer c3 = new LapTop();
        Computer c4 = new MyLapTop();

        c2.turnOff();
    }
}