package com.java.day06;

public class Human {

    Religion religion;
    String name;

    public Human(String name, Religion religion) {
        this.name = name;
        this.religion = religion;
    }

    public void eat() {
        System.out.println("Human " + name + "이 밥을 먹습니다");
    }

    public void sleep() {
        System.out.println("Human " + name + "이 잡니다");
    }
}
