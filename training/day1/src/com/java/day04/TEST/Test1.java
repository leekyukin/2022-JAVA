package com.java.day04.TEST;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Test1 {
    public String solution(String[] part, String[] comp) {

        Arrays.sort(part);
        Arrays.sort(comp);
        for (int i = 0; i < part.length - 1; i++) {
            if (!part[i].equals(comp[i]))
                return part[i];

        }
        return part[part.length - 1];
    }
}
