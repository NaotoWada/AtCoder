package main.bignner.contest059;

import java.util.Scanner;

public class A_ThreeLetterAcronym {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] S = sc.nextLine().split(" ");

        StringBuilder sb = new StringBuilder();
        for (String s : S) {
            String upperCase = s.substring(0, 1).toUpperCase();
            sb.append(upperCase);
        }

        System.out.println(sb.toString());
    }
}
