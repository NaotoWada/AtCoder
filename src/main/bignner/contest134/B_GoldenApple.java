package main.bignner.contest134;

import java.util.Scanner;

public class B_GoldenApple {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();

        int coverage = d * 2 + 1;
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < coverage; j++) {
                i++;
            }
            ans++;
        }
        System.out.println(ans);
    }
}
