package main.bignner.contest144;

import java.util.Scanner;

public class A_FavoriteSound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > 9 || b > 9) {
            System.out.println(-1);
        } else {
            System.out.println(a * b);
        }
    }
}
