package main.bignner.contest124;

import java.util.Scanner;

public class A_Buttons {

    public static void main(String[] args) { // 7m38sAC

        Scanner sc = new Scanner(System.in);
        String[] abt = sc.nextLine().split(" ");
        int A = Integer.parseInt(abt[0]);
        int B = Integer.parseInt(abt[1]);

        int max = Math.max(A, B) * 2;
        if (A == B) {
            System.out.println(max);
        } else {
            System.out.println(max - 1);
        }
    }

}
