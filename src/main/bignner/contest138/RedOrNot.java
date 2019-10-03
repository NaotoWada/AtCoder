package main.bignner.contest138;

import java.util.Scanner;

public class RedOrNot {

    public static void main(String[] args) { // msAC

        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        String s = sc.nextLine();

        System.out.println(a >= 3200 ? s : "red");
    }

}
