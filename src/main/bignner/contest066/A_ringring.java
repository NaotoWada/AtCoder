package main.bignner.contest066;

import java.util.Arrays;
import java.util.Scanner;

public class A_ringring {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int[] prices = { a, b, c };
        Arrays.sort(prices);

        System.out.println(prices[0] + prices[1]);
    }
}
