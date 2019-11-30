package main.gigacode2019;

import java.util.Scanner;

public class A_ {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            int tech = a[i];
            int society = b[i];
            if (tech >= x && society >= y && (tech + society) >= z) {
                ans++;
            }
        }

        System.out.println(ans);
    }
}
