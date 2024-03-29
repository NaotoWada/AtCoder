package main.bignner.contest134;

import java.util.Arrays;
import java.util.Scanner;

public class D_PreparingBoxes2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
        }

        // 後ろから順にボールが入っているかをXORで計算していく
        int[] ball = new int[n + 1];
        for (int i = n; i >= 1; i--) {
            int sum = 0;
            for (int j = i + i; j <= n; j += i) {
                // i倍数の部分だけ計算しなおす
                sum ^= ball[j];
            }
            // iとXORする
            ball[i] = sum ^ a[i];
        }

        int ballCount = (int) Arrays.stream(ball).filter(s -> s != 0).count();
        if (ballCount == 0) {
            System.out.println(0);
        } else {
            // 先にボールの個数を出力して、それ以外はボールが入っている場所だけ出力
            System.out.println(ballCount);
            for (int i = 1; i <= n; i++) {
                if (ball[i] == 0) {
                    continue;
                }
                System.out.println(i);
            }
        }
    }
}

