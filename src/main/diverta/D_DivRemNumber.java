package main.diverta;

import java.util.Scanner;

public class D_DivRemNumber {

    public static void main(String[] args) {// TLE

        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();

        long match = 0;
        for (long i = 2; i < N + 1; i++) {
            if (!isM(i, N)) {
                continue;
            }
            System.out.println(i);

            if (isFavorite(i - 1, N)) {
                match += i - 1;
            }
        }
        System.out.println(match);
    }

    private static boolean isFavorite(long m, long N) {
        return N / m == N % m;
    }

    private static boolean isM(long m, long N) {
        return N % m == 0;
    }
}
