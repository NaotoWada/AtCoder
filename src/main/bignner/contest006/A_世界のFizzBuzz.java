package main.bignner.contest006;

import java.util.Scanner;

public class A_世界のFizzBuzz {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        System.out.println(N % 3 == 0 ? "YES" : "NO");
    }
}
