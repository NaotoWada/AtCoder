package main.bignner.contest082;

import java.util.Scanner;

public class A_RoundUpTheMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());

        double ave = (double) (a + b) / 2 + 0.5;
        System.out.println((int) ave);
    }
}
