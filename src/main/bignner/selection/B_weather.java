package main.bignner.selection;

import java.util.Scanner;

public class B_weather {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();

        if (m < 100) {
            System.out.println("00");
        } else if (m >= 100 && m <= 5000) {

            if (m < 1000) {
                System.out.println("0" + m / 100);
            } else {
                System.out.println(m / 100);
            }
        } else if (m >= 6000 && m <= 30000) {
            System.out.println(50 + m / 1000);
        } else if (m >= 3500 && m <= 70000) {
            System.out.println((m / 1000 - 30) / 5 + 80);
        } else if (m > 7000) {
            System.out.println("89");
        }
    }
}
