package main.bignner.contest120;

import java.util.Scanner;

public class A_FavoriteSound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int satisfaction = a * c;
        System.out.println(satisfaction <= b ? c : b / a);
    }
}
