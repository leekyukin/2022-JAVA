package com.kyukin.ch01_class;

class Student1 {
    String name;
    static String school = "Busan-somago";
    int grade;
    int ban;
    int number;
}

public class StudentTest {
    public static void main(String[] args) {
        Student1 choi = new Student1();
        Student1 kim = new Student1();
        Student1 lee = new Student1();

        System.out.println(choi.school);
        System.out.println(kim.school);
        System.out.println(lee.school);

        System.out.println(Student1.school);
    }
}
