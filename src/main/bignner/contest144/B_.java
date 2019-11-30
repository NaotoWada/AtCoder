package main.bignner.contest144;

import java.util.Scanner;

public class B_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean canMultiple = false;
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if (i * j == n) {
                    canMultiple = true;
                }
            }
        }

        if (canMultiple) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
