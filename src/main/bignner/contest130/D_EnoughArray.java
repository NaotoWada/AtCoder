package main.bignner.contest130;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class D_EnoughArray {

    public static void main(String[] args) { // 33m30s AC

        Scanner sc = new Scanner(System.in);
        String[] NK = sc.nextLine().split(" ");
        int N = Integer.parseInt(NK[0]);
        int K = Integer.parseInt(NK[1]);
        String[] A = sc.nextLine().split(" ");
        Long[] AN = Arrays.stream(A).map(Long::parseLong).collect(Collectors.toList())
                .toArray(new Long[N]);

        long[] amount = new long[N];
        long tmps = 0;
        for (int i = 0; i < N; i++) {
            tmps += AN[i];
            amount[i] += tmps;
        }

        int count = 0;
        for (int i = 0; i < N; i++) {
            long tmp = amount[N - 1] - amount[i];
            if (tmp >= K) {
                count++;
            }
        }

        System.out.println(count);
    }
}
