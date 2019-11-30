package main.gigacode2019;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class C_ {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int d = sc.nextInt();
        int[] a = new int[d];
        int[] b = new int[d];
        for (int i = 0; i < d; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < d; i++) {
            b[i] = sc.nextInt();
        }

        long sum = 0;
        Set<Integer> boughts = new HashSet<>();
        for (int i = 0; i < d; i++) {
            sum += a[i];
            if (b[i] <= sum) {
                boughts.add(b[i]);
            }
        }

        if (boughts.isEmpty()) {
            System.out.println(-1);
        } else {

            long min = Long.MAX_VALUE;
            for (Integer price : boughts) {
                min = Math.min(price, min);
            }

            System.out.println(min);
        }

    }
}
