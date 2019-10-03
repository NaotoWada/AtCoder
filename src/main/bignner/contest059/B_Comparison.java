package main.bignner.contest059;

import java.util.Scanner;

public class B_Comparison {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double A = Double.parseDouble(sc.nextLine());
        double B = Double.parseDouble(sc.nextLine());

        System.out.println(A > B ? "GREATER" : A < B ? "LESS" : "EQUAL");

    }
}
