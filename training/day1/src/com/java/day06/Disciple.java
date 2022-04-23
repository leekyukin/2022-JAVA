package com.java.day06;

public class Disciple extends Human {

    String master;
    boolean isPerforming;

    public Disciple(String name, String master, Religion religion) {
        super(name, religion);
        this.master = master;
        this.isPerforming = false;
    }

    public void receiveRevelation() {
        System.out.println("Disciple " + name + "이 " + master + "에게 계시를 받습니다.");
    }

    public void writeScripture() {
        System.out.println("제자 " + name + "이 경전을 기록합니다.");
    }

    public void startPerform() {
        System.out.println("수행시작!");
        this.isPerforming = true;
    }

    @Override
    public void eat() {
        if(isPerforming) {
            System.out.println("수행중입니다.");
            System.out.println(name + "이 먹지 않습니다.");
        }
        else {
            System.out.println(name + "이 먹습니다.");
        }
    }
}
