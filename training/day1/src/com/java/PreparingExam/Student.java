package com.java.PreparingExam;

import java.util.ArrayList;
import java.util.Scanner;

public class Student extends Person {

    int number;

    Student(int age, String name, int number) {
        super(age, name);
        this.number = number;
    }

    public void parentsClassMethod() {
        super.eat();
        super.sleep();
    }

    public void study() {
        System.out.println(name + "이 공부중");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("사람 수 입력 : ");
        int count = scan.nextInt();

        ArrayList<Student> students = new ArrayList<Student>();

        for (int i = 0; i < count; i++)
            students.add(new Student(10,"홍길동",7));

        for (Student student : students) {
            student.howManyPeopleInThere();
            student.parentsClassMethod();
            student.study();
        }
    }
}
