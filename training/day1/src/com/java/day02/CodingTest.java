package com.java.day02;

import java.util.Scanner;

public class CodingTest {
        public static int[] solution(int[] array, int[][] commands) {
            int[] answer = new int[3];
            for (int i = 0; i < 3; i++) {
                int[] tmp = new int[10];
                for (int j = commands[i][0]; j < commands[i][1]; j++) {
                    tmp[j - commands[i][0]] = array[j];
                }
                for(int j = 0; j < tmp.length - 1; j++) {
                    for(int l = j; l < tmp.length - 1; l++) {
                        if(tmp[l] < tmp[l + 1]) {
                            int temp = tmp[l];
                            tmp[l] = tmp[l + 1];
                            tmp[l + 1] = temp;
                        }
                    }

//                    for (int n:
//                         tmp) {
//                        System.out.print(n + "\t");
//                    }
//                    System.out.println();
                }

                answer[i] = tmp[commands[i][2]];
            }
            return answer;
        }

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] commands = new int[3][3];
        int[] arr = new int[7];

        int n = scan.nextInt();

        for(int q = 0 ; q < n; q++) {
            arr[q] = scan.nextInt();
        }

        for (int n2 : arr) System.out.println(n2);

        for(int q = 0 ; q < 3; q++) {
            for(int p = 0; p < 3; p++) {
                commands[q][p] = scan.nextInt();
            }
        }

        for(int i = 0; i < 3; i++) {
            for (int j : commands[i]) System.out.print(j);
        }
        System.out.println();

        int[] result = solution(arr, commands);

        for (int j : result) System.out.println(j);
    }
}

