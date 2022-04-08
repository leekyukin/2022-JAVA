package com.java.day04.TEST;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Q9 {

    public static void main(String[] args) {
        ArrayList<Integer> numbers =new ArrayList<>(Arrays.asList(1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 5));
        System.out.println(numbers);  // [1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 5] 출력

        List number = numbers.stream().distinct().collect(Collectors.toList());

        System.out.println(number);
    }
}
