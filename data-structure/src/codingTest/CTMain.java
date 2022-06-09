package codingTest;

import java.util.Scanner;

public class CTMain {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    String val = "";
    for(int i = 0; i < n; i++) {
        if(i % 2 == 0)
            val += "수";
        else
            val += "박";
    }

    System.out.println(val);

    }
}
