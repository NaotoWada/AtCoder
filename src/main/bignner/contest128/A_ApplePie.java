package main.bignner.contest128;

import java.util.Scanner;

public class A_ApplePie {

    public static void main(String[] args) { // msAC

        Scanner sc = new Scanner(System.in);
        String[] abt = sc.nextLine().split(" ");
        int A = Integer.parseInt(abt[0]);
        int P = Integer.parseInt(abt[1]);

        int piece = A * 3 + P;
        int created = piece / 2;
        System.out.println(created);
    }

}
