package main.bignner.contest142;

import java.util.Scanner;

public class B_RollerCoaster {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (h[i] >= k) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
