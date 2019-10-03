package main.bignner.contest086;

import java.util.Scanner;

public class A_Product {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());

        System.out.println(a * b % 2 == 0 ? "Even" : "Odd");
    }
}
