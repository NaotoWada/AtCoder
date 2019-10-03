package main.regular.contest088;

import java.util.Scanner;

public class C_MultipleGift {

    public static void main(String[] args) {
        // シミュレーション
        Scanner sc = new Scanner(System.in);
        long X = sc.nextLong();
        long Y = sc.nextLong();

        long ans = 0;
        long tmp = X;
        for (int i = 0; i < Y; i++) {
            if (tmp > Y) {
                break;
            }
            ans++;
            tmp *= 2;
        }
        System.out.println(ans);
    }
}
