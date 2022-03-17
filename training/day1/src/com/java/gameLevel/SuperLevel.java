package com.java.gameLevel;

public class SuperLevel extends PlayerLevel {
    @Override
    public void run() {
        System.out.println("아주 빠름");
    }

    @Override
    public void jump() {
        System.out.println("아주 높음");
    }

    @Override
    public void turn() {
        System.out.println("턴 한다");
    }

    @Override
    public void showLevelMassage() {
        System.out.println("*** 고급자 레벨 ***");
    }
}
