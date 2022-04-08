package com.java.day03;

import java.util.Scanner;

public class CodingTest {

    public static void main(String[] args) {

        int[] SuPo = new int[]{};
        Scanner scan = new Scanner(System.in);

        int n,num;
        n = scan.nextInt();

        int[] a = {1,2,3,4,5};
        int[] b = {2,1,2,3,2,4,2,5};
        int[] c = {3,3,1,1,2,2,4,4,5,5};


        for (int i = 0; i < n; i++) {
            num = scan.nextInt();
            if (num == a[i%5]) SuPo[0]++;
            if (num == b[i%8]) SuPo[1]++;
            if (num == c[i%10]) SuPo[2]++;
        }

        for(int nu : SuPo) {
            System.out.print(nu + " ");
        }

    }
}
