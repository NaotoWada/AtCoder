package main.bignner.contest133;

import java.util.Scanner;

public class A_TorT {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int train = n * a;
        int taxi = b;
        System.out.println(Math.min(train, taxi));
    }
}
