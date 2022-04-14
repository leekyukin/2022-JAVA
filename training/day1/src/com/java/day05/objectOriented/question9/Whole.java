package com.java.day05.objectOriented.question9;

interface Predator {
    String bark();
}

abstract class Animal {
	public String hello() {
		return "hello";
    }
}

class Dog extends Animal {
}

class Lion extends Animal implements Predator {
	public String bark() {
		return "Bark bark!!";
    }
}

class Sample {
public static void main(String[] args) {
        Animal a =new Lion();
        Lion b =new Lion();
        Predator c =new Lion();

        System.out.println(a.hello());  // 1번
        System.out.println(c.bark());   // 2번
        System.out.println(b.hello());  // 3번
        System.out.println(b.bark());   // 4번
        System.out.println(a.hello());  // 5번
        System.out.println(c.bark());   // 6번
    }
}

