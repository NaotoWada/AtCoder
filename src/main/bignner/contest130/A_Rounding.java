package main.bignner.contest130;

import java.util.Scanner;

public class A_Rounding {

    public static void main(String[] args) { // msAC

        Scanner sc = new Scanner(System.in);
        String[] abt = sc.nextLine().split(" ");
        int X = Integer.parseInt(abt[0]);
        int A = Integer.parseInt(abt[1]);

        System.out.println(X >= A ? "10" : "0");
    }

}
