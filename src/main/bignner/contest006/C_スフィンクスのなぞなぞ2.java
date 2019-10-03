package main.bignner.contest006;

import java.util.Scanner;

public class C_スフィンクスのなぞなぞ2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int M = Integer.parseInt(sc.next());

        String ans = solve(N, M);
        System.out.println(ans);
    }

    private static String solve(int N, int M) {
        int a = 0;
        int b = 0;
        int c = 0;
        if (M % 2 == 0) {
            c = (M - 2 * N) / 2;
            a = N - c;
        } else {
            b = 1;
            c = (M - 3 * b - 2 * (N - 1)) / 2;
            a = N - b - c;
        }

        System.err.println(a + " " + b + " " + c);
        if (M < 2 * N || a < 0) {
            a = -1;
            b = -1;
            c = -1;
        }
        return a + " " + b + " " + c;
    }
}
