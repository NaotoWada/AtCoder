package main.bignner.contest139;

import java.util.Scanner;

public class D_ModSum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long N = Long.parseLong(sc.nextLine());

        long max = 0;
        for (long i = 1; i <= N; i++) {
            max += i;
        }
        System.out.println(max - N);
    }
}
