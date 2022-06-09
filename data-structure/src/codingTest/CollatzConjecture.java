package codingTest;

import java.util.Scanner;

public class CollatzConjecture {

    public int function(int n) {
        for (int i = 0; i < 500; i++) {
            if (n == 1) return i;
            n = (n % 2 == 0) ?
                    n / 2 : n * 3 + 1;
        }
        return -1;
    }
}

class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        CollatzConjecture cc = new CollatzConjecture();

        int n;
        n = scan.nextInt();

        System.out.println(cc.function(n));
    }
}
