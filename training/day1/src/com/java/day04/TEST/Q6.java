package com.java.day04.TEST;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Q6 {
        public static void main(String[] args) {
            ArrayList<Integer> myList =new ArrayList<>(Arrays.asList(1, 3, 5, 4, 2));
            System.out.println(myList); // [1, 3, 5, 4, 2] 출력

            Collections.sort(myList, Collections.reverseOrder());
            System.out.println(myList);
        }
}
