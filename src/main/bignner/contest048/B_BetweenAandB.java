package main.bignner.contest048;

import java.util.Scanner;

public class B_BetweenAandB {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] abx = sc.nextLine().split(" ");
        long a = Long.parseLong(abx[0]);
        long b = Long.parseLong(abx[1]);
        long x = Long.parseLong(abx[2]);

        long ans = 0;
        for (; a <= b; a++) {
            // 当然の如く10^18でTLE
            if (a % x == 0) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
