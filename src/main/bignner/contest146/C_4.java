package main.bignner.contest146;

import java.util.Scanner;

public class C_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        long x = sc.nextLong();

        long R = Math.min(x, 1000000000);
        long L = 1;

        long before = -1;
        long ans = 0;
        long max = 0;
        while (true) {
            long M = (R + L) / 2;
            long tmp = (a * M) + (b * String.valueOf(M).length());
            System.out.printf("%s %s %s = %s\n", L, M, R, tmp);
            if (tmp > x) {
                // 中央値を最大に
                R = M;
            } else {
                // 中央値を最小に
                L = M;
                max = tmp;
                ans = M;
            }

            if (before == max) {
                break;
            }

            if (before == M) {
                ans = M;
                break;
            }
            before = M;
        }

        if (L == R && (L + R) / 2 == R) {
            ans = 0;
        } else {
            long tmp = (a * R) + (b * String.valueOf(R).length());
            if (tmp <= x) {
                ans = R;
            }
        }
        System.out.println(ans);
    }
}
