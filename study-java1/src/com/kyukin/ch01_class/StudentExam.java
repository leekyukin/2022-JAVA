package com.kyukin.ch01_class;

class Student {
    private String name;
    private int grade;

    public Student() {};
    public Student(String name) {
        this.name = name;
    }

    public Student(String name, int grade) {
//        this.name = name;
        this(name);
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}

public class StudentExam {
    public static void main(String[] args) {
        Student lee = new Student();
        lee.setName("lee");
        System.out.println(lee.getName());
        Student kim = new Student("kim", 1);

        System.out.println("이름 : "+ lee.getName()+", 학년 : "+lee.getGrade());
    }
}
