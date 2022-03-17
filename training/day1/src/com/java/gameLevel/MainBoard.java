package com.java.gameLevel;

public class MainBoard {
    public static void main(String[] args) {

        Player player = new Player();
        player.play(1);

        AdvanceLevel advanceLevel = new AdvanceLevel();
        player.upGradeLevel(advanceLevel);
        player.play(2);


    }
}
