package main.bignner.contest143;

import java.util.Scanner;

public class B_TAKOYAKIFESTIVAL2019 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] d = new int[n];
        for (int i = 0; i < n; i++) {
            d[i] = sc.nextInt();
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                ans += d[i] * d[j];
            }
        }

        System.out.println(ans);
    }
}
