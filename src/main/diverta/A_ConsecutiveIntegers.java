package main.diverta;

import java.util.Scanner;

public class A_ConsecutiveIntegers {

    public static void main(String[] args) {// 6minAC

        Scanner sc = new Scanner(System.in);
        String[] abt = sc.nextLine().split(" ");
        int N = Integer.parseInt(abt[0]);
        int K = Integer.parseInt(abt[1]);

        if (N == K) {
            System.out.println(1);
        } else {
            System.out.println(N + 1 - K);
        }
    }
}
