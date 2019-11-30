package main.bignner.contest146;

import java.util.Scanner;

public class C_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        long x = sc.nextLong();

        long max = Math.min(x, 1000000000);
        long ans = 0;
        for (long i = max; i > 0; i--) {
            long tmp = (a * i) + (b * String.valueOf(i).length());
            if (tmp > x) {
                continue;
            }

            ans = i;
            break;
        }

        System.out.println(ans);
    }
}
