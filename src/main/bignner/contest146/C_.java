package main.bignner.contest146;

import java.util.Scanner;

public class C_ {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        long x = sc.nextLong();

        long limit = x / a;
        long max = 0;
        long ans = 0;
        for (int i = 0; i < 100; i++) {

            long tmp = (limit * a) + (b * String.valueOf(limit).length());
            if (tmp > x) {
                limit--;
                continue;
            }
            if (tmp > max) {
                ans = limit;
            }
            max = Math.max(tmp, max);
            limit--;
        }

        System.out.println(ans);
    }
}
