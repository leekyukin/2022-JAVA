package com.java.PreparingExam;

import java.util.ArrayList;
import java.util.Scanner;

public class Person {
    int age;
    String name;
    static int numberOfPerson;

    Person(int age, String name) {
        this.age = age;
        this.name = name;
        numberOfPerson++;
    }

    public void sleep() {
        System.out.println(name + "이 잠. Zzz...");
    }

    public void eat() {
        System.out.println(name + "이 먹음. ");
    }

    public void howManyPeopleInThere() {
        System.out.println("number of person : " + numberOfPerson);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("사람 수 입력 : ");
        int count = scan.nextInt();

        ArrayList<Person> people = new ArrayList<Person>();

        for (int i = 0; i < count; i++)
            people.add(new Person(10,"홍길동"));

        for (Person person : people)
            person.howManyPeopleInThere();

    }
}
