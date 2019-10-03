package main.bignner.contest127;

import java.util.Scanner;

public class A_FerrisWheel {

    public static void main(String[] args) { // msAC

        Scanner sc = new Scanner(System.in);
        Integer A = sc.nextInt();
        Integer B = sc.nextInt();

        int result = A >= 13 ? B :
                       A <= 5 ? 0 :
                       B / 2;
        System.out.println(result);
    }

}
