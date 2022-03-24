package com.java.day02;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForeachRambdaLotto {

    public static void main(String[] args) {
        List<Integer> mmlists = Arrays.asList(1,6,16,22,33);

        mmlists.forEach(
                m-> {
                    System.out.println(m + "\t");
                }
        );
        System.out.println();

        Consumer<Integer> consume = (Integer m) -> {
            System.out.println(m + "\t");
        };
    }
}
