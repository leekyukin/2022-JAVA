package com.java.day01.gameLevel;

public class Player {

    private PlayerLevel level;
//    public Player() {
//        level = new BeginnerLevel();
//        level.showLevelMassage();
//    }

    public void upGradeLevel(PlayerLevel level) {
        this.level = level;
        level.showLevelMassage();
    }
    public void play(int count) {
        level.go(count);
    }
}
