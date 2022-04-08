package com.java.day04.TEST;

public class Q1 {

    int kor;
    int eng;
    int mat;

    Q1(int kor, int eng, int mat) {
        this.kor = kor;
        this.eng = eng;
        this.mat = mat;
    }

    double getAverage() {
        double sum = this.mat + this.eng + this.kor;
        return sum / 3;
    }

    public static void main(String[] args) {

        Q1 average = new Q1(18, 57, 25);

        System.out.println("평균: " + average.getAverage());
    }
}
