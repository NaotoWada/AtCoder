package main.bignner.contest046;

import java.util.Scanner;

public class B_AtCoDeer君とボール色塗り {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] NK = sc.nextLine().split(" ");
        int N = Integer.parseInt(NK[0]);
        int K = Integer.parseInt(NK[1]);

        // 解説見たけどよく分からん
        int pow = (int) Math.pow(K - 1, N - 1);
        System.out.println(K * pow);
    }
}
