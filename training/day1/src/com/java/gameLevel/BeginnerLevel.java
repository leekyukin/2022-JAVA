package com.java.gameLevel;

public abstract class BeginnerLevel extends PlayerLevel {

    @Override
    public void run() {

        System.out.println(" 달린다.");

    }

    @Override
    public void jump() {
        System.out.println(" 점프");
    }

    @Override
    public void turn() {
        System.out.println("턴 못함");
    }

    @Override
    public void showLevelMassage() {
        System.out.println("***초급자 레벨***");
    }
}
