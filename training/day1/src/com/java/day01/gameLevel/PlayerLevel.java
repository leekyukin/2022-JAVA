package com.java.day01.gameLevel;

public abstract class PlayerLevel {
    public abstract void run();
    public abstract void jump();
    public abstract void turn();
    public abstract void showLevelMassage();

    final public void go(int count) {

        run();
        for(int i = 0; i < count; i++) {
            jump();
        }
        turn();
    }
}
