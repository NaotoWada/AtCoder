package main.bignner.contest006;

import java.util.Scanner;

public class B_トリボナッチ数列 {

    static int[] T = { 0, 0, 1, 1, 2, 4, 7, 13 };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());

        if (N < 9) {
            System.out.println(T[N - 1]);
        } else {
            solve(N);
        }
    }

    private static void solve(int n) {
        long ans;

        long[] t = new long[n];
        for (int i = 0; i < T.length; i++) {
            t[i] = T[i];

        }
        for (int i = 8; i < n; i++) {
            long a1 = t[i - 1];
            long a2 = t[i - 2];
            long a3 = t[i - 3];
            long tmp = a1 + a2 + a3;
            t[i] = tmp % 10007;
        }

        System.out.println(t[n - 1]);
    }
}
