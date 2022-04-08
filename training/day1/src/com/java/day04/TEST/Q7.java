package com.java.day04.TEST;

public class Q7 {
    public static void main(String[] args) {
        String[] myList = new String[] {"Life", "is", "too", "short"};
        System.out.println(myList); // [Life, is, too, short] 출력

        String str = String.join(" " ,myList);
        System.out.println(str);
    }
}