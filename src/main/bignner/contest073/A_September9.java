package main.bignner.contest073;

import java.util.Scanner;

public class A_September9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        System.out.println(n.charAt(0) == '9' || n.charAt(1) == '9' ? "Yes" : "No");
    }
}
