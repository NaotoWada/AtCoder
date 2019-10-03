package main.bignner.contest073;

import java.util.Scanner;

public class B_Theater {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            ans += end - start + 1;
        }
        System.out.println(ans);
    }
}

