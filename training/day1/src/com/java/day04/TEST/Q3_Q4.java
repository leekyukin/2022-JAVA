package com.java.day04.TEST;

public class Q3_Q4 {
    public static void main(String[] args) {
        String num = "881120-1068234";
        String birth = num.substring(0,6);

        System.out.println("birth: " + birth);
        System.out.println("sex : " + num.charAt(7));
    }
}
