package main.bignner.contest065;

import java.util.Scanner;

public class A_Expired {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int out = b - a;
        if (out > x) {
            System.out.println("dangerous");
        } else if (a >= b) {
            // 賞味期限同日は美味しいらしい。
            System.out.println("delicious");
        } else {
            System.out.println("safe");
        }
    }
}
