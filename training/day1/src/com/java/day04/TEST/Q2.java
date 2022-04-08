package com.java.day04.TEST;

public class Q2 {

    int n = 13;

    void checkEven() {
        if (this.n % 2 == 0)
            System.out.println("짝수");
        else
            System.out.println("홀수");
    }

    public static void main(String[] args) {
        Q2 checkEven = new Q2();

        checkEven.checkEven();
    }
}
