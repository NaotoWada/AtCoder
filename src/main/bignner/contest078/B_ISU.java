package main.bignner.contest078;

import java.util.Scanner;

public class B_ISU {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        System.out.println((x - z) / (y + z));
    }
}
