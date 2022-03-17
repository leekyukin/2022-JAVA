package com.java.gameLevel;

public class AdvanceLevel extends PlayerLevel {

    @Override
    public void run() {

        System.out.println("빨리 달린다.");

    }

    @Override
    public void jump() {
        System.out.println("높이 점프");
    }

    @Override
    public void turn() {
        System.out.println("턴 못함");
    }

    @Override
    public void showLevelMassage() {
        System.out.println("***중급자 레벨***");
    }
}
