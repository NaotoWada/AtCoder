package main.bignner.contest064;

import java.util.Scanner;

public class A_RGBCards {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int g = sc.nextInt();
        int b = sc.nextInt();

        int sum = r * 100 + g * 10 + b;
        System.out.println(sum % 4 == 0 ? "YES" : "NO");
    }
}
